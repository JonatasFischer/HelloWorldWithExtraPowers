package com.example.greeting;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RandomGreeterPickerTest {

  @Test
  void GivenAPickerHasOnlyOneGreeterThatOneShouldAlwaysBePicked(@Mock Greeter hello) {
    var picker = new RandomGreeterPicker(List.of(hello), new Random());
    when(hello.greet()).thenReturn("Hello");
    assertEquals("Hello", picker.pick().greet());
  }
}