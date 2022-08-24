package com.example.greeting.helloword;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OptimistTest {
  @InjectMocks
  Optimist greeter;

  @Test
  void greet() {
    assertEquals("Hello good world!", this.greeter.greet());
  }

}