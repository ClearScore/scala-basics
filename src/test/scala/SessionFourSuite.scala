import SessionFour.{greeting, heightLimit}
import munit.FunSuite

class SessionFourSuite extends FunSuite {
  // ALTON TOWERS RIDES
  val atOrOver90cm = "Runaway Mine Train, Gangsta Granny, Battle Galleons, Heave Ho, Enterprise, Raj's Bouncy Bottom Burp, Peter Rabbit Hippity Hop, Octonauts Rollercoaster Adventure, Justin's House Pie-O-Matic Factory, Go Jetters Vroomster Zoom Ride, Duel: The Haunted House Strikes Back"
  val atOrOver100cm = "The Blade"
  val atOrOver110cm = "Marauder's Mayhem, Congo River Rapids"
  val atOrOver120cm = "TH13TEEN, Spinball Whizzer, Wicker Man"
  val atOrOver140cm = "Rita  Maximum, Galactica, The Smiler, Oblivion"

// ! ! (moved to SessionFour.scala) ! ! (moved to SessionFour.scala) !
//def heightLimit(height: Double): String = {
//  val rides = Array("Rita, Galactica, The Smiler, Oblivion", "TH13TEEN, Spinball Whizzer, Wicker Man", "Marauder's Mayhem, Congo River Rapids", "The Blade", "Gangsta Granny: The Ride, Runaway Mine Train, Battle Galleons, Heave Ho, Enterprise, Raj's Bouncy Bottom Burp, Peter Rabbit Hippity Hop, Octonauts Rollercoaster Adventure, Justin's House Pie-O-Matic Factory, Go Jetters Vroomster Zoom Ride, Duel: The Haunted House Strikes Back")
//  if (height >= 140.0) "You can ride everything!"
//  else if (height >= 120.0) "You can jump on: " + (rides(4) ++ rides(3) ++ rides(2) ++ rides(1))
//  else if (height >= 110.0) "You can jump on: " + (rides(3) ++ rides(2) ++ rides(1))
//  else if (height >= 100.0) "You can jump on: " + (rides(2) ++ rides(1))
//  else "You can jump on: " + rides(1)
//}
//  }   ! ! (moved to SessionFour.scala) ! !  (moved to SessionFour.scala) ! !


  test("Alton tower test 1a") {
    assertEquals(heightLimit(height: 200), atOrOver140cm) // a very tall 5y/o (int datatype)🤪
  }

  test("Alton tower test 1b") {
    assertEquals(heightLimit(height: 200.0), atOrOver140cm) // a very tall 5y/o part 2 (Double datatype)🤪
  }
  test("Alton tower test 1c") {
    assertEquals(heightLimit(height: 2.0), atOrOver140cm) // a very tall 5y/o part 3 (given in m not cm) 🤪
  }

  test("123") {
  }


  // Greeting Exercise
  test("successful test") {
    assertEquals(greeting("zeynep", 19), "Hi my name is zeynep and I am 19 years old")
  }

  test("failed test") {
    assertEquals(greeting("zeynep", 19), "dsadads")
  }

  test("greeting") {
    assert(s"$$" == "$") // This is how to escape a dollar sign (weird)
  }

  test("greeting") {
    assert(1 == 1)
  }

  test("greeting") {
    assert(greeting("nathan", 18) == "Hi my name is Nathan and I am 18 years old")
  }

  test("greeting") {
    assert(greeting("arran", 18) == "Hi my name is Arran and I am 18 years old") // return title
  }

  test("greeting") {
    assert(greeting("Isabella", 19) == "Hi my name is Isabella and I am 19 years old")
  }

  test("greeting") {
    assert(greeting("Asher", 19) == "Hi my name is Asher and I am 19 years old")
  }

  test("greeting") {
    assert(greeting("zeynep", 19) == "Hi my name is zeynep and I am 19 years old")d")
  }
}
