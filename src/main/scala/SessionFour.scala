object SessionFour extends App {
  // ALTON TOWERS RIDES
  val atOrOver90cm = "Runaway Mine Train, Gangsta Granny, Battle Galleons, Heave Ho, Enterprise, Raj's Bouncy Bottom Burp, Peter Rabbit Hippity Hop, Octonauts Rollercoaster Adventure, Justin's House Pie-O-Matic Factory, Go Jetters Vroomster Zoom Ride, Duel: The Haunted House Strikes Back"
  val atOrOver100cm = "The Blade"
  val atOrOver110cm = "Marauder's Mayhem, Congo River Rapids"
  val atOrOver120cm = "TH13TEEN, Spinball Whizzer, Wicker Man"
  val atOrOver140cm = "Rita  Maximum, Galactica, The Smiler, Oblivion"

  def heightLimit(height: Double): String = {
    val rides = Array("Rita, Galactica, The Smiler, Oblivion", "TH13TEEN, Spinball Whizzer, Wicker Man", "Marauder's Mayhem, Congo River Rapids", "The Blade", "Gangsta Granny: The Ride, Runaway Mine Train, Battle Galleons, Heave Ho, Enterprise, Raj's Bouncy Bottom Burp, Peter Rabbit Hippity Hop, Octonauts Rollercoaster Adventure, Justin's House Pie-O-Matic Factory, Go Jetters Vroomster Zoom Ride, Duel: The Haunted House Strikes Back")
    if (height >= 140.0) "You can ride everything!"
    else if (height >= 120.0) "You can jump on: " + (rides(4) ++ rides(3) ++ rides(2) ++ rides(1))
    else if (height >= 110.0) "You can jump on: " + (rides(3) ++ rides(2) ++ rides(1))
    else if (height >= 100.0) "You can jump on: " + (rides(2) ++ rides(1))
    else "You can jump on: " + rides(1)
  }



  def greeting(name: String, age: Int): String = {
    s"Hi my name is $name and I am $age years old"
  }
  // input: Double
  // output: String


  def greeting(name: String, age: Int): String = {
    s"Hi my name is $name and I am $age years old"
  }
}



assert(height())