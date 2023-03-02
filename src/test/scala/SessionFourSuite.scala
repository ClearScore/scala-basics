import SessionFour.greeting
import munit.FunSuite

class SessionFourSuite extends FunSuite {
  test("successful test") {
    assertEquals(greeting("zeynep", 19), "Hi my name is zeynep and I am 19 years old")
  }

  test("failed test") {
    assertEquals(greeting("zeynep", 19), "dsadads")
  }
}
