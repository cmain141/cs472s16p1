package main

import scala.collection.mutable
import scala.io.source

object methods {

  def inputLength(lines: List[String]): List[Int] = {

    val iterator = for (line <- lines) yield line.length
    val lengths = iterator.toList
    lengths
  }

  def mutableMap(lengths: List[Int]): mutable.HashMap[Int, Int] = {
    var count = new scala.collection.mutable.HashMap[Int, Int]

    for (length <- lengths) {
      if (count.contains(length)) {
        count.put(length, count(length) + 1)
      }
      else
        count.put(length, 1)
    }
    count
  }

  def immutableMap(list: List[Int]): Map[Int, Int] = {
    val count = list.foldLeft[Map[Int, Int]](Map.empty)((m, n) => m + (n -> (m.getOrElse(n, 0) + 1)))
    count
  }

  def showMutable(count: mutable.HashMap[Int,Int]): Unit = {
    if (count.isEmpty) println("no input")
    else {
      val max = count.keysIterator.max
      for (i <- 1 to max) {
        println(i + " " + count.getOrElse(i, 0) + " " + "*"*count.getOrElse(i,0))
      }
    }
  }

  def showImmutable(count: mutable.HashMap[Int, Int]): Unit = {
    if (count.isEmpty) println("no input")
    else {
      val max = count.keysIterator.max
      for (i <- 1 to max) {
        println(i + " " + count.getOrElse(i, 0) + " " + "*"*count.getOrElse(i,0))
      }
    }
  }

}
