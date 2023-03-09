object AltonTowers extends App {
  println("Alton Towers")

  println(suitableRides(122))
  println(suitableRides(90))

//val atOrOver90cm = "Runaway Mine Train, Gangsta Granny, Battle Galleons, Heave Ho, Enterprise, Raj's Bouncy Bottom Burp, Peter Rabbit Hippity Hop, Octonauts Rollercoaster Adventure, Justin's House Pie-O-Matic Factory, Go Jetters Vroomster Zoom Ride, Duel: The Haunted House Strikes Back"
//val atOrOver100cm = "The Blade"
//val atOrOver110cm = "Marauder's Mayhem, Congo River Rapids"
//val atOrOver120cm = "TH13TEEN, Spinball Whizzer, Wicker Man"
//val atOrOver140cm = "Rita  Maximum, Galactica, The Smiler, Oblivion"

  private def suitableRides(heightInCm: Double): String = {
    val atOrOver90cm =
      "Runaway Mine Train, Gangsta Granny, Battle Galleons, Heave Ho, Enterprise, Raj's Bouncy Bottom Burp, Peter Rabbit Hippity Hop, Octonauts Rollercoaster Adventure, Justin's House Pie-O-Matic Factory, Go Jetters Vroomster Zoom Ride, Duel: The Haunted House Strikes Back"
    val atOrOver100cm = "The Blade, " + atOrOver90cm
    val atOrOver110cm = "Marauder's Mayhem, Congo River Rapids, " + atOrOver100cm
    val atOrOver120cm = "TH13TEEN, Spinball Whizzer, Wicker Man, " + atOrOver110cm
    val atOrOver140cm = "Rita	Maximum, Galactica, The Smiler, Oblivion, " + atOrOver120cm

    val result = "You can jump on: "

    if (heightInCm < 90.0)
      result + "a stool in the ice cream parlour!"
    else if (heightInCm < 100.0)
      result + atOrOver90cm
    else if (heightInCm < 110.0)
      result + atOrOver100cm
    else if (heightInCm < 120.0)
      result + atOrOver110cm
    else if (heightInCm < 140.0)
      result + atOrOver120cm
    else
      result + "ANYTHING! :D"
  }
}
