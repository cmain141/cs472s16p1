package main

import methods._

import scala.collection.mutable
import scala.io.Source

object Main extends App {

  // import list of lines
  val lines = Source.fromFile("input.txt").getLines().toList

  // "Better Java" approach with mutable
  println("Better Java with mutable")
  methods.showMutable(methods.mutableMap(methods.inputLength(lines)))
  print('*')
  println(methods.inputLength(lines).size.toString + '\n')

  // "Functional version" with no mutable
  println("Functional without mutable")
  methods.showImmutable(methods.immutableMap(methods.inputLength(lines)))
  print('*')
  println(methods.inputLength(lines).size.toString + '\n')

}

// almost done






















/*  Dave's code for help/ideas...
  // creates empty array for user to enter string(s)
  val buffer = ArrayBuffer.empty[String]
  println("Enter text to evaluate:\n")
  // loop to enter each line
  for (ln <- io.Source.stdin.getLines) {
    buffer += ln
  }
  // empty line shows there are no characters
  if(buffer.isEmpty) {
    print("* 0")
  }
  // calls evaluate function for each line that contains characters
  else {
    val fEval = new FEval
    fEval.evaluate(buffer)
  }
}

*/