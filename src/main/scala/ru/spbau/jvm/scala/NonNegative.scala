package ru.spbau.jvm.scala

sealed trait NonNegative

object NonNegative {
  case object Zero extends NonNegative

  case class Succ[T <: NonNegative](pred: T) extends NonNegative
}
