package ru.spbau.jvm.scala

import org.junit.Test

class EvaluateExceptionsTest {
  @Test(expected = classOf[ParserException])
  def testNothing(): Unit = {
    Main.evaluate("")
  }

  @Test(expected = classOf[ParserException])
  def testUnknownSymbol1(): Unit = {
    Main.evaluate("~")
  }

  @Test(expected = classOf[ParserException])
  def testUnknownSymbol2(): Unit = {
    Main.evaluate("2 - 3 / Ж + 45")
  }

  @Test(expected = classOf[ParserException])
  def testUnknownSymbol3(): Unit = {
    Main.evaluate("4 + 44 ^ 2")
  }

  @Test(expected = classOf[ParserException])
  def testWrongParenthesis1(): Unit = {
    Main.evaluate("5 + (7 - (42 / 5)")
  }

  @Test(expected = classOf[ParserException])
  def testWrongParenthesis2(): Unit = {
    Main.evaluate("17 || (5 - 2) / 5)")
  }

  @Test(expected = classOf[ParserException])
  def testWrongNumber1(): Unit = {
    Main.evaluate("-0")
  }

  @Test(expected = classOf[ParserException])
  def testWrongNumber2(): Unit = {
    Main.evaluate("+42")
  }

  @Test(expected = classOf[ParserException])
  def testWrongOrder1(): Unit = {
    Main.evaluate("5 * + 42")
  }

  @Test(expected = classOf[ParserException])
  def testWrongOrder2(): Unit = {
    Main.evaluate("5 3 + 2 / 15 3 -")
  }

  @Test(expected = classOf[ParserException])
  def testWrongOrder3(): Unit = {
    Main.evaluate("3 -")
  }

  @Test(expected = classOf[ParserException])
  def testWrongOrder4(): Unit = {
    Main.evaluate("* 4 / 2 -")
  }


  @Test(expected = classOf[ArithmeticException])
  def testDivideByZeroException1(): Unit = {
    Main.evaluate("5 / 0")
  }

  @Test(expected = classOf[ArithmeticException])
  def testDivideByZeroException2(): Unit = {
    Main.evaluate("5 / (42 - 41 - (2 || 1))")
  }

  @Test(expected = classOf[ArithmeticException])
  def testDivideByZeroException3(): Unit = {
    Main.evaluate("15 % 0")
  }

}
