package com.example;

import com.example.greeting.RandomGreeterPicker;
import org.apache.log4j.Logger;

public class Main {
  static Logger logger = Logger.getLogger(Main.class);

  public static void main(String[] args) {
    var picker = RandomGreeterPicker.createInstance();
    logger.info("Application Started");
    int i = 0;
    while (i++ < 10) {
      logger.info(picker.pick().greet());
    }
    logger.info("Application Finished");
  }
}