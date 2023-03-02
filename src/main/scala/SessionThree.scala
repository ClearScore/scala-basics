object SessionThree extends App {
  object Calc {
    def add(num1: Int, num2: Int): Int = num1 + num2
    def divide(num3: Int, num4: Double): Double = {
      if (num4 == 0) {
        0
      } else {
        num3 / num4
      }
    }
    def square(num6: Double): Double = scala.math.pow(num6, 2)
    def cube(num7: Double): Double = num7 * square(num7)
  }

  assert(true)
  assert(5 == 5)
  //  assert(100 == 101)

  assert(Calc.divide(43242, 0) == 0)
  // Tests
  assert(2 == Calc.divide(4, 2))
  assert(4 == Calc.divide(8, 2))

  assert(16 == Calc.square(4))
  assert(Calc.square(3) == 9)

  assert(5 == Calc.add(3, 2))
  assert(-98 == Calc.add(-100, 2))

  assert(Calc.cube(3) == 27)
  assert(Calc.cube(9) == 729)

}
