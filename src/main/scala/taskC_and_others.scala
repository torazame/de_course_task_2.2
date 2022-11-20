object taskC_and_others {

  import scala.collection.mutable.ArrayBuffer

  def main(args: Array[String]): Unit = {
    val salaries: List[Int] = List(100000, 150000, 200000, 80000, 120000, 75000)
    val bonus_size: Double = 0.15
    val lunch_compensation: Int = 3000

    def salaryCalcPreLoaded(monthly: Double, bonusPercentage: Double = bonus_size,
                            lunchComp: Int = lunch_compensation): Double = {
      val monthlyBonus = monthly * bonusPercentage * 0.87
      val monthlySalary = monthly * 0.87
      val finalMonthly = monthlyBonus + monthlySalary + lunchComp
      finalMonthly
    }

    val monthly_salaries: List[Double] = salaries.map(i => salaryCalcPreLoaded(i))
    println(s"Net monthly salaries of the employees: \n$monthly_salaries\n")

    val meanSalary: Double = monthly_salaries.sum / monthly_salaries.size

    println(s"Average monthly salary is $meanSalary \n")

    val differences = monthly_salaries.map(i => (i / meanSalary - 1) * 100)
    println(s"Percentage differences in employees' net salaries against the mean are: \n$differences\n")

    // new employee with good performance bonus
    val performanceBonus = 1.3
    val newEmployeeSalary: Double = 150000.0 * performanceBonus

    val newSalariesList: List[Double] = newEmployeeSalary :: monthly_salaries
    val maxSalary: Double = newSalariesList.max
    println(s"The maximum salary in the extended list is $maxSalary")

    val newHighPaid = 350000.0
    val newLowPaid = 90000.0
    val monthlySalariesWithNewcomers: List[Double] = (List(newHighPaid, newLowPaid) ::: newSalariesList).sortWith(_ < _)
    println(s"Sorted salaries: \n$monthlySalariesWithNewcomers\n")

    val mutableMonthlySalaries: ArrayBuffer[Double] = ArrayBuffer[Double]()
    mutableMonthlySalaries ++= monthlySalariesWithNewcomers

    val newcomerSalary = 130000
    mutableMonthlySalaries.insert(5, newcomerSalary)
    println(s"Extended salaries list: $mutableMonthlySalaries\n")

    // filter middle
    val lowerBound: Double = 100000.0
    val upperBound: Double = 150000.0
    val filteredList: ArrayBuffer[Double] = mutableMonthlySalaries.filter(i => (i > lowerBound) && (i < upperBound))
    println(s"Filtered Middle Level Employees: \n$filteredList\n")

    val salaryIncreaseCoef = 1.07
    val increasedSalaries: ArrayBuffer[Double] = mutableMonthlySalaries.map(_ * salaryIncreaseCoef)
    println(s"Increased salaries by 7%: \n$increasedSalaries\n")

    // Индексация по отклонению от среднего по рынку
    val avgSalaryOnMarketJun: Double = 90000.0
    val avgSalaryOnMarketMid: Double = 150000.0
    val avgSalaryOnMarketSen: Double = 220000.0

    // Имена сотрудников
    val employeeNames: List[String] = List("John Hopkins", "Finita la Comedia", "Rita Rumour", "Mark Twain",
      "Samuel Clemens", "Lewis Carroll", "Josef Stalin", "Paris Hilton", "Bruce Lee", "Chuck Norris")

    // Имена и зарплаты
    val employeeNamesSalaries = employeeNames.zip(increasedSalaries).toMap
    for ((k, v) <- employeeNamesSalaries) println(s"$k's salary is $v")

    def getMaxSalary(m: Map[String, Double]): Tuple2[String, Double] = {
      var max_v: Double = 0.0
      var max_k: String = ""
      for ((sal, empl) <- m.values zip m.keys) {
        if (sal > max_v) {
          max_v = sal
          max_k = empl
        }
      }
      (max_k, max_v)
    }

    val (highestEmp, highestSal) = getMaxSalary(employeeNamesSalaries)
    println(s"\nHighest paid employee is $highestEmp with the salary of $highestSal RUB.")

  }

}
