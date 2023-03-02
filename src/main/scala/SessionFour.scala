object SessionFour extends App {

  // val pet = "Dog"
  // s"Hello I have a $pet"
  def greeting(name: String, age: Int): String = {
    s"Hi my name is $name and I am $age years old"
  }

  assert(s"$$" == "$") // This is how to escape a dollar sign (weird)
  assert(1 == 1)

  // assert(greeting("nathan", 18) == "Hi my name is Nathan and I am 18 years old")
  // assert(greeting("arran", 18) == "Hi my name is Arran and I am 18 years old") // return title

  assert(greeting("Isabella", 19) == "Hi my name is Isabella and I am 19 years old")

  assert(greeting("zeynep", 19) == "Hi my name is zeynep and I am 19 years old")

  assert(greeting("Asher", 19) == "Hi my name is Asher and I am 19 years old")
}
