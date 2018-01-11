package com.assignmentScala4

import org.apache.log4j.Logger

object OperationsCall {

  def main(args: Array[String]): Unit = {

    val log = Logger.getLogger(this.getClass)
    val operation = new Operations
    val number1 = 5
    val number2 = 6
    val number3 = 4
    val list = List(number1, number2, number3)
    val sumSquare = operation.sum((num1, num2) => (num1 * num1) + (num2 * num2), number1, number2)
    log.info(s"sum of squares : $sumSquare\n")
    val sumCube = operation.sum((num1, num2) => (num1 * num1 * num1) + (num2 * num2 * num2), number1, number2)
    log.info(s"sum of cube : $sumCube\n")
    val sumInt = operation.sum((num1, num2) => num1 + num2, number1, number2)
    log.info(s"sum of Int : $sumInt\n")
    val result1 = operation.operateList(list,"sum",operation.result)
    log.info(s"sum result : $result1\n")
    val result2 = operation.operateList(list,"product",operation.result)
    log.info(s"product result : $result2\n")
    val result3 = operation.operateList(list,"max",operation.result)
    log.info(s"max result : $result3\n")

  }
}

