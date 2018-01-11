package com.assignmentScala4

import org.apache.log4j.Logger

class Operations {

  val log = Logger.getLogger(this.getClass)
  def sum(f: (Int, Int) => Int,a: Int, b:Int): Int = {

    val sumResult = f(a,b)
    sumResult

  }

  def result (number1: Int, number2: Int, operation: String): Int = {

    operation match {
      case "sum" => number1 + number2
      case "product" => number1 * number2
      case "max" => if(number1 > number2) number1 else number2

    }
  }

  def operateList(list: List[Int], operation: String, f:(Int,Int,String) => Int): Int  = {

    def operateHelper(list: List[Int], result: Int): Int = {
      list match {
        case Nil => result
        case head1 :: tail => operateHelper(tail, f(head1,result, operation))

      }
    }
    operation match {
      case "sum"|"max" => operateHelper(list, 0)
      case "product" => operateHelper(list, 1)
    }
  }
}

