package ru.spbau.jvm.scala

import ru.spbau.jvm.scala.NonNegative.{Succ, Zero}

sealed trait HList

object HList {

  case class HCons[+H, +T <: HList](head: H, tail: T) extends HList

  case object HNil extends HList

  implicit class HListExt[R <: HList](private val list: R) extends AnyVal {

    def ::[H](head: H) = HCons(head, list)

    def :::[L <: HList, Result <: HList](left: L)
                                        (implicit appendable: Appendable[L, R, Result]): Result =
      appendable(left, list)

    def zip[L <: HList, Result <: HList](right: L)
                                        (implicit zippable: Zippable[R, L, Result]): Result =
      zippable(list, right)

    def split[I <: NonNegative, R1 <: HList, R2 <: HList](index: I)
                                                         (implicit splittable: Splittable[R, I, R1, R2]): (R1, R2) =
      splittable(list, index)
  }

  def main(args: Array[String]): Unit = {
    val list = ("hello" :: 42 :: false :: HNil) ::: ("world" :: HNil)

    val x = HListExt(HNil).::(3)
    val x2 = 3 :: HNil
    println(x)

    val hello: String = list.head
    val world: String = list.tail.tail.tail.head
    println(s"$hello $world")
    println(list)

    val list1 = "kek" :: "42" :: "41" :: HNil
    val list2 = HNil

    println(list1.zip(list2))

    val num = Zero
    println(list2.split(num))
  }
}