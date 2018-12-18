package ru.spbau.jvm.scala


import org.junit.Assert._
import org.junit.Test
import ru.spbau.jvm.scala.HList.{HCons, HNil}
import ru.spbau.jvm.scala.NonNegative._

class HListTest {
  val _0: Zero.type = Zero
  val _1 = Succ(_0)
  val _2 = Succ(_1)
  val _3 = Succ(_2)
  val _4 = Succ(_3)
  val _5 = Succ(_4)

  @Test def testZip1(): Unit = {
    assertEquals(HNil, HNil.zip(HNil))
  }

  @Test def testZip2(): Unit = {
    assertEquals(HNil, HNil.zip("1" :: "0" :: HNil))
  }

  @Test def testZip3(): Unit = {
    val actual = ("1" :: "0" :: HNil).zip("1" :: "0" :: HNil)
    val expected = ("1", "1") :: ("0", "0") :: HNil
    assertEquals(expected, actual)
  }

  @Test def testZip4(): Unit = {
    val actual = ("1" :: "0" :: HNil).zip("3" :: "2" :: "1" :: "0" :: HNil)
    val expected = ("1", "3") :: ("0", "2") :: HNil
    assertEquals(expected, actual)
  }

  @Test def testSplit1(): Unit = {
    assertEquals((HNil, HNil), HNil.split(_0))
  }

  @Test def testSplit2(): Unit = {
    val list = "2" :: "1" :: "0" :: HNil
    assertEquals((HNil, list), list.split(_0))
  }

  @Test def testSplit3(): Unit = {
    val list = "2" :: "1" :: "0" :: HNil
    assertEquals((list, HNil), list.split(_3))
  }

  @Test def testSplit4(): Unit = {
    val list = "3" :: "2" :: "1" :: "0" :: HNil
    val l1 = "3" :: "2" :: HNil
    val l2 = "1" :: "0" :: HNil
    assertEquals((l1, l2), list.split(_2))
  }


}