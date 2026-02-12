fun main() {
    // Task 1: operations on numbers
    println(123 + 456 * 789)
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    println(13530.0 / 1.23)

    // Task 2: operations on variables
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3

    // Simple (Int) average
    val averageScoreInt = totalScore / 3

    // Pro (Double) average
    val averageScoreDouble = totalScore / 3.0

    println("Total score = $totalScore")
    println("Average (Int) = $averageScoreInt")
    println("Average (Double) = %.2f".format(averageScoreDouble))

    // Task 3: bonus
    val boostMultiplier = 4
    val scoreBoost = totalScore * boostMultiplier
    val finalBoostedScore = totalScore + scoreBoost

    println("Score boost = $scoreBoost")
    println("Final boosted score = $finalBoostedScore")
}
