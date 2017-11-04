package com.example

import org.specs2.mutable.Specification

class HelloSpec extends Specification {
  "The Hello object" should {
    "say hello" in {
      Hello.greeting must_== "hello"
    }
  }
}
