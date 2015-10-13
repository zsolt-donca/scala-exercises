package com.zsd.pyramids

object NumberPyramids extends App {

  def pattern1(n: Int): String = {
    def line(i: Int): String = (" " * (n - i)) + List.fill(i)(i).mkString(" ")

    ((1 to n) map line).mkString("\n")
  }

  def pattern2(n: Int): String = {
    def line(i: Int): String = (" " * (n - i)) + (1 to i).mkString(" ")

    ((1 to n) map line).mkString("\n")
  }

  def pattern3(n: Int): String = {
    def line(i: Int): String = (" " * (n - i)) + List.fill(i)("*").mkString(" ")

    ((1 to n) map line).mkString("\n")
  }

  def pattern4(n: Int): String = {
    def line(i: Int): String = (" " * ((n - i) * 2)) + ((1 to i) ++ (1 until i).reverse).mkString(" ")

    ((1 to n) map line).mkString("\n")
  }

  def pattern5(n: Int): String = {
    def line(i: Int): String = (" " * ((n - i) * 2)) + ((1 to i) ++ (1 until i).reverse).mkString(" ")

    ((1 to n).reverse map line).mkString("\n")
  }

  def pattern6(n: Int): String = {
    def line(i: Int): String = (" " * (i * 2)) + ((i to n) ++ (i until n).reverse).mkString(" ")

    ((1 to n).reverse map line).mkString("\n")
  }

  def printPattern(pattern: String) = {
    println(pattern)
    println()
  }

  printPattern(pattern1(9))
  printPattern(pattern2(9))
  printPattern(pattern3(9))
  printPattern(pattern4(9))
  printPattern(pattern5(9))
  printPattern(pattern6(9))
}
