package ru.spbau.jvm.scala

import org.junit.Assert._
import org.junit.Test

class EvaluateTest {
  @Test def testNumber(): Unit = {
    assertEquals(3, Main.evaluate("3"))
  }

  @Test def testNegativeNumber(): Unit = {
    assertEquals(-3, Main.evaluate("-3"))
  }

  @Test def testSimpleExpr1(): Unit = {
    assertEquals(5, Main.evaluate("2 + 3"))
  }

  @Test def testSimpleExpr2(): Unit = {
    assertEquals(-4, Main.evaluate("3 - 7"))
  }

  @Test def testSimpleExpr3(): Unit = {
    assertEquals(56, Main.evaluate("7 * 8"))
  }

  @Test def testSimpleExpr4(): Unit = {
    assertEquals(1, Main.evaluate("9 / 7"))
  }

  @Test def testLogicExpr1(): Unit = {
    assertEquals(0, Main.evaluate("2 && 0"))
  }

  @Test def testLogicExpr2(): Unit = {
    assertEquals(1, Main.evaluate("45 || 0"))
  }

  @Test def testLogicExpr3(): Unit = {
    assertEquals(0, Main.evaluate("0 || 0"))
  }

  @Test def testEqExpr1(): Unit = {
    assertEquals(0, Main.evaluate("2 == 3"))
  }

  @Test def testEqExpr2(): Unit = {
    assertEquals(1, Main.evaluate("42 >= 15"))
  }


  @Test def testPriority1(): Unit = {
    assertEquals(6, Main.evaluate("2 + 2 * 2"))
  }

  @Test def testPriority2(): Unit = {
    assertEquals(1, Main.evaluate("1 || 1 && 0"))
  }

  @Test def testPriority3(): Unit = {
    assertEquals(0, Main.evaluate("3 + 2 >= 17"))
  }

  @Test def testPriority4(): Unit = {
    assertEquals(0, Main.evaluate("5 - 3 - 2"))
  }

  @Test def testPriorityParentheses1(): Unit = {
    assertEquals(8, Main.evaluate("(2 + 2) * 2"))
  }

  @Test def testPriorityParentheses2(): Unit = {
    assertEquals(-1, Main.evaluate("(((((10) - 9) * 8) <= 7) - 6) / 6"))
  }


  @Test def testComplexExpression1(): Unit = {
    assertEquals(1, Main.evaluate("(134 + 41) / 7 >= (15 && 0)"))
  }

  @Test def testComplexExpression2(): Unit = {
    assertEquals(0, Main.evaluate("0 && 15 <= 7 * (4 - 1 && (3 - 3))"))
  }

  @Test def testComplexExpression3(): Unit = {
    assertEquals(1, Main.evaluate("(1 / 3 == 1 / 5) * (134 + 51 > (3 * 17)) == 3 - 2"))
  }

}
