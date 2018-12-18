package ru.spbau.jvm.scala

import ru.spbau.jvm.scala.NonNegative.{Succ, Zero}

trait Splittable[L <: HList, I <: NonNegative, R1 <: HList, R2 <: HList] {
  def apply(list: L, index: I): (R1, R2)
}

object Splittable {

  import HList._

  implicit def zeroSplittable[L <: HList]: Splittable[L, Zero.type, HNil.type, L] =
    (list: L, _: NonNegative.Zero.type) => (HNil, list)

  implicit def splittable[HL, L <: HList, I <: NonNegative, R1 <: HList, R2 <: HList](implicit splittable: Splittable[L, I, R1, R2]): Splittable[HCons[HL, L], Succ[I], HCons[HL, R1], R2] =
    (list: HCons[HL, L], index: Succ[I]) => {
      val (r1, r2) = splittable(list.tail, index.pred)
      (HCons(list.head, r1), r2)
    }

}
