import scala.sys.process._

object main_exec extends App {

  val cmd = "ls -la"
  val output = cmd.!!
  println(output)

}
