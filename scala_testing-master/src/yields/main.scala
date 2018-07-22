package yields

import scala.util.matching.Regex


object main extends App{
//------------------used for PATHUtils modification (uses 3 defs)
//  val path = functions.getLatestRversionPath("C:\\Program Files\\R")
//  println(path)
//  println(functions.isPathExecutable(path))

//  val istrue = 5%2 == 0
//  println(istrue)
//
//  var second = 5
//  second += 7  //equivalant to second = second + 7
//  println(second)
//
//  val codeBlock: Int = {
//    val something: Int ={
//      5
//    }
//    5 + something
//  }
//  println(codeBlock)

//-------------used for testing passing methods
//  val r = new someClass
//  println(r.aMethod())

//------------used for pass by value/name example
//  println()
//  println(functions.myFunc(functions.myFuncTime()))

//-----some weird lambda shit (anonymous function)
//  val isOdd = (x: Int) => x%2 !=0
//  println(isOdd(2))

//-----same thing as having the above
//  def isEven(x: Int): Boolean ={
//    x%2 ==0
//  }
//  println(isEven(2))




  val x1= "Date,0.25#0,0.5#0,1#0,0.25#0.5,0.5#0.5,1#0.5,0.25#1,0.5#1,1#1,0.25#1.5,0.5#1.5,1#1.5,0.25#2,0.5#2,1#2,0.25#2.5,0.5#" +
    "2.5,1#2.5,0.25#3,0.5#3,1#3,0.25#3.5,0.5#3.5,1#3.5,0.25#4,0.5#4,1#4,0.25#4.5,0.5#4.5,1#4.5,0.25#5,0.5#5,1#5,0.25#5.5,0.5#5.5,1" +
    "#5.5,0.25#6,0.5#6,1#6,0.25#6.5,0.5#6.5,1#6.5,0.25#7,0.5#7,1#7,0.25#7.5,0.5#7.5,1#7.5,0.25#8,0.5#8,1#8,0.25#8.5,0.5#8.5,1#8.5,0.25" +
    "#9,0.5#9,1#9,0.25#9.5,0.5#9.5,1#9.5,0.25#10,0.5#10,1#10,0.25#10.5,0.5#10.5,1#10.5,0.25#11,0.5#11,1#11,0.25#11.5,0.5#11.5,1#11.5,0.25" +
    "#12,0.5#12,1#12,0.25#12.5,0.5#12.5,1#12.5,0.25#13,0.5#13,1#13,0.25#13.5,0.5#13.5,1#13.5,0.25#14,0.5#14,1#14,0.25#14.5,0.5#14.5,1#" +
    "14.5,0.25#15,0.5#15,1#15,0.25#15.5,0.5#15.5,1#15.5,0.25#16,0.5#16,1#16,0.25#16.5,0.5#16.5,1#16.5,0.25#17,0.5#17,1#17,0.25#17.5,0.5" +
    "#17.5,1#17.5,0.25#18,0.5#18,1#18,0.25#18.5,0.5#18.5,1#18.5,0.25#19,0.5#19,1#19,0.25#19.5,0.5#19.5,1#19.5,0.25#20,0.5#20,1#20,0.25" +
    "#20.5,0.5#20.5,1#20.5,0.25#21,0.5#21,1#21,0.25#21.5,0.5#21.5,1#21.5,0.25#22,0.5#22,1#22,0.25#22.5,0.5#22.5,1#22.5,0.25#23,0.5#23,1#" +
    "23,0.25#23.5,0.5#23.5,1#23.5,0.25#24,0.5#24,1#24,0.25#24.5,0.5#24.5,1#24.5,0.25#25,0.5#25,1#25,0.25#25.5,0.5#25.5,1#25.5,0.25#26,0.5#" +
    "26,1#26,0.25#26.5,0.5#26.5,1#26.5,0.25#27,0.5#27,1#27,0.25#27.5,0.5#27.5,1#27.5,0.25#28,0.5#28,1#28,0.25#28.5,0.5#28.5,1#28.5,0.25#29,0.5#29,1#29,0.25#29.5,0.5#29.5,1#29.5"

  val dottedPattern: Regex = "\\d{1,2}\\.\\d{1,2}|\\d{1,2}".r

  var sequence = "Date,"
  var counter = 0
  for (x <- dottedPattern.findAllMatchIn(x1)){
    //print(x + "\n")
    //print((x.toString().toDouble*12).toInt + "M" + "\n")
    sequence += (x.toString().toDouble*12).toInt + "M"
    if (counter%2==0){
      sequence += "#"
    } else {sequence += ","}
    counter +=1
  }

  print(sequence.substring(0, sequence.length -1))

}

