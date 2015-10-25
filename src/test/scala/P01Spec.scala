package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  "lastElement" should "rerturn the last element of a list" in {
    assert(P01.lastElement(List(1,2,3)) == 3)
  }

}

