package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloLambdaTest {

  @org.junit.jupiter.api.Test
  public void handleRequestShouldReturnHelloMessage() {
    var sut = new HelloLambda();
    assertEquals("Hello, lambda!", sut.handleRequest());
  }
}