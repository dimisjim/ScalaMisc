import java.io.File
import java.nio.file.{Files, Paths}

object PathUtils {

  def pathFromString(path: String) = {
    val segments = path.split("/") match {
      case split if split.length == 1 => path.split("\\\\")
      case split => split
    }
    Paths.get(segments.head, segments.tail :_*)
  }

  def isPathExecutable(p: String) = {
    val path = Paths.get(p)
    val isExecutable = Files.isExecutable(path)
    isExecutable
  }

    //input: R directory "C:\\Program Files\\R"
  //output: list of version folders converted to int
  def getListOfRVersionsInstalled(dir: String): List[Int] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      //println("found directory")
      val list: List[File] = d.listFiles.filter(_.isDirectory).toList

      val listInt: List[Int] = for (e <- list) yield{
        val array = e.getName.substring(2).split("\\.")
        if (array.mkString.length==4){
          array.mkString.toInt
        }
        else{
          val array2 = array.mkString.toInt.toString.substring(0,1) + "0" + array.mkString.toInt.toString.substring(1)
          array2.toInt
        }
      }

      listInt

    } else {
      //println("did not found")
      List[Int]()
    }
  }


  //printList(getListOfRVersionsInstalled(dir))

  //returns the Option (Int of
  def max(xs: List[Int]): Option[Int] = xs match {
    case Nil => None
    case List(x: Int) => Some(x)
    case x :: y :: rest => max( (if (x > y) x else y) :: rest )
  }

  //returns the highest R version Rscrpt.exe path
  def getLatestRversionPath(dir: String): String ={
    val selectedValue: String = max(getListOfRVersionsInstalled(dir)).getOrElse(0).toString

    if (selectedValue.substring(1,2).equals("0")){
      dir +"\\" + "R-" + selectedValue.substring(0,1) + "." + selectedValue.substring(2,3) + "." + selectedValue.substring(3,4) + "\\bin\\Rscript.exe"
    }
    else{
      dir +"\\" + "R-" + selectedValue.substring(0,1) + "." + selectedValue.substring(1,3) + "." + selectedValue.substring(3,4) + "\\bin\\Rscript.exe"
    }

    //println(dir)
  }

  
}