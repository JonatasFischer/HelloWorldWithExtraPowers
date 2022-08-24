package com.example.greeting.helloword;

import com.example.greeting.Greeter;

public class Pessimist implements Greeter {
  @Override
  public String greet() {
    return "Hello terrible world";
  }
}
