package ru.spbau.jvm.scala

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

object Main {
  def evaluate(expression: String): Int = {
    val lexer = new ExpLexer(CharStreams.fromString(expression))
    val parser = new ExpParser(new CommonTokenStream(lexer))

    parser.eval().value
  }

  def main(args: Array[String]): Unit = {
    println("Enter expression: ")
    val expression = readLine()

    println(evaluate(expression))
  }
}