package ch1

/**
  * Package : ch1
  * Class Propose : 섭씨와 화씨를 변환하는 모듈
  */
object TempDegree {

  def main(args: Array[String]) {
    println(getFahrenheit(22.5))
    println(getFahrenheitToInt(22.5))
    println(getCelsiusDegree(getFahrenheit(22.5)))
    println(pretty(getFahrenheit(22.5)))
    println(isFalse(false))
    println(changer(125))
  }

  def getFahrenheit(celsiusDegree : Double): Double = {
    (celsiusDegree * 9/5) + 32
  }

  def getFahrenheitToInt(celsiusDegree : Double): Int = {
    ((celsiusDegree * 9/5) + 32).toInt
  }

  def getCelsiusDegree(fahrenheitDegree : Double): Double = {
    (fahrenheitDegree - 32) * 5/9
  }

  def pretty(degree : Double): String = {
    "Your degree " + degree
  }

  def isFalse(flag : Boolean): Boolean = {
    !flag
  }

  /**
   * 숫자를 Char, String, Double로 전환해보고, 다시 Int로 바꾸도록한다.
   * toChar로 인해서 해탕 Charset의 문자가 치환된다.
   * 125의 경우 } 로 치환되어서 에러가 발생한다.
   * 따라서 toCharArray -> Map -> Product를 수행한다.
   * @param num
   * @return Int
   */
  def changer(num : Int): Int = {
    val charNum = num.toChar
    val StringNum = charNum.toString
    StringNum.toCharArray.map(_.toInt).product
  }

}
