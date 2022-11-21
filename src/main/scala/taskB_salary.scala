object taskB_salary {
  import io.StdIn.readInt
  import io.StdIn.readFloat

  // Задание 3b
  def main(args: Array[String]): Unit = {
    def salaryCalc(yearly: Double, yearlyBonus: Double, foodComp: Int): Unit = {
      val monthlyBonus = yearlyBonus * 0.87 / 12
      val monthlySalary = yearly * 0.87 / 12
      val finalMonthly = monthlyBonus + monthlySalary + foodComp
      println(s"Average monthly salary of the employee is $finalMonthly")
      }
    println("Input yearly salary...")
    val salaryInput = readFloat()
    println(s"Accepted yearly salary input - $salaryInput")
    println("Input yearly bonus porcentage as value between 0 and 1...")
    val bonusPercentage = readFloat()
    println(s"Accepted yearly bonus input - $bonusPercentage")
    println("Input monthly lunch compensation amount...")
    val lunchCompensation = readInt()
    println(s"Accepted monthly lunch compensation input - $lunchCompensation")

    salaryCalc( salaryInput, bonusPercentage, lunchCompensation)
  }
}
