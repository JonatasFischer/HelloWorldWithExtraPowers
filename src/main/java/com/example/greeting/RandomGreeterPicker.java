package com.example.greeting;

import com.example.greeting.helloword.Dreamer;
import com.example.greeting.helloword.Optimist;
import com.example.greeting.helloword.Pessimist;
import com.example.greeting.helloword.Possessive;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import org.apache.log4j.Logger;

public class RandomGreeterPicker {
  static Logger logger = Logger.getLogger(RandomGreeterPicker.class);
  private final List<Greeter> pickerOptions = new ArrayList<>();
  private final RandomGenerator random;

  public RandomGreeterPicker(List<Greeter> pickerOptions,
                             RandomGenerator random) {
    this.pickerOptions.addAll(pickerOptions);
    this.random = random;
  }

  private int getNextRandomInRange(int max) {
    int randNumber = this.random.nextInt(max);
    logger.info(String.format("Random Number: %d, range: 0 - %d", randNumber, max));
    return randNumber;
  }

  public static RandomGreeterPicker createInstance() {
    return new RandomGreeterPicker(List.of(new Pessimist(), new Dreamer(), new Optimist(), new Possessive()),
                                   new Random());
  }

  public Greeter pick() {
    return this.pickerOptions.get(this.getNextRandomInRange(this.pickerOptions.size()));
  }
}
