import munit.FunSuite

class SessionThreeSuite extends FunSuite {
  test("isDefined") {
    assertEquals(1.0, 1d)
    assert(s"$$" == "$")
  }

}
