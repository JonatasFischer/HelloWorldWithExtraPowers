package com.example.greeting.helloword;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PossessiveTest {
  @InjectMocks
  Possessive greeter;

  @Test
  void greet() {
    assertEquals("Hello my world!", this.greeter.greet());
  }
}