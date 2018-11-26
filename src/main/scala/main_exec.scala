import scala.sys.process._

object main_exec extends App {

  val nbconvert = """"jupyter nbconvert --execute /notebook/notebooks/Untitled.ipynb""""
  val nbconvertArray = Array[String]("jupyter", "nbconvert", "--execute", "/notebook/notebooks/Untitled.ipynb")
//  val cmd = s"docker exec jupyter bash -c $nbconvert"
//  val cmd = """docker exec jupyter bash -c "jupyter nbconvert --execute /notebook/notebooks/Untitled.ipynb""""
//  val output = cmd.!!
//  println(output)

//  """docker exec jupyter bash -c "jupyter nbconvert --execute /notebook/notebooks/Untitled.ipynb"""" lineStream
//  val cmd = Seq("docker", "exec", "jupyter", "bash", "-c", """"""", "jupyter", "nbconvert", "--execute", "/notebook/notebooks/Untitled.ipynb", """"""")
//  cmd.lineStream

  val cmd = "docker exec jupyter bash env"
  val output = cmd.!!
  println(output)
}
