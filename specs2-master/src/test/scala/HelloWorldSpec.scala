import org.specs2._

class HelloWorldSpec extends Specification {

  //defining results
  def is = s2"""

 This is a specification to check the 'Hello world' string

 The 'Hello world' string should
   contain 11 characters                                         $e1
   start with 'Hello'                                            $e2
   end with 'world'                                              $e3
                                                                 """


  //define results (expectations. In this case one expectation per example is defined. Better this way.)
  def e1 = "Hello world" must have size 11
  def e2 = "Hello world" must startWith("Hello")
  def e3 = "Hello world" must endWith("world")
}