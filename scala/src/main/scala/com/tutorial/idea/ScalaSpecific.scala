package com.tutorial.idea

import scala.concurrent.Future

class Conversion {
  val bi: BigInt = 177
}

class Parameter {

  import scala.concurrent.ExecutionContext.Implicits._

  val doSomeWork: () => Unit = ???

  Future(doSomeWork)
}
