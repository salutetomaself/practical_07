object filterPrime {
  // Helper function to check if a number is prime
  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2) true
    else !(2 to math.sqrt(num).toInt).exists(i => num % i == 0)
  }

  // Function to filter prime numbers from a list
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterPrime(input)
    println(output)  // Output: List(2, 3, 5, 7)
  }
}

