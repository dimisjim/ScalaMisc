//        class someClass ()
//or      class someClass (var x: Int, var y: Int)  //public parameters
//or      class someClass (x: Int, y: Int)          //private parameters
//or even class someClass (var x: Int = 0, var y: Int = 0)
//the above are actually constructors inside the class signature

//instead of constructors, one may have getters/setters
class someClass {

  val height: Int = 0

  def aMethod(): String ={
    "yayy"
  }

  def bMethod(): Int={
    15
  }
}

//
//class Point {
//  private var _x = 0
//  private var _y = 0
//  private val bound = 100
//
//  def x = _x
//  def x_= (newValue: Int): Unit = {
//    if (newValue < bound) _x = newValue else printWarning
//  }
//
//  def y = _y
//  def y_= (newValue: Int): Unit = {
//    if (newValue < bound) _y = newValue else printWarning
//  }
//
//  private def printWarning = println("WARNING: Out of bounds")
//}
//
//val point1 = new Point
//point1.x = 99
//point1.y = 101 // prints the warning