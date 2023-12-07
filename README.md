# junitTesting-spring

Spring Boot supports developing unit tests and integration tests using JUnit and Mockito.
Unit Testing: Testing an individual unit of code for correctness
Two frameworks for testing: JUNIT and Mockito
dependency:junit-jupiter
JUNIT Assertions:
       assertEquals,assertNotEquals,assertNull,assertNotNull ,assertSame,assertNotSame,assertTrue,assertFalse,assertLinesMatch,assertArrayEquals,assertIterableEquals,assertThrows,assertTimeoutPreemptively
Defined in class: org.junit.jupiter.api.Assertions
lifecycle methods: BeforeEach,AfterEach,AfterAll,BeforeAll
custom display name: @DisplayName() for testcase execution
Simple,ReplaceUnderscores,IndicativeSentences - displayNameGenerators

Order of Test Methods:
Annotation:@TestMethodOrder
 through DisplayName
         MethodName
          random
        OrderAnnotation---@Order
  Code Coverage:
        Code coverage measures how many methods/lines are called by your tests
        Coverage is represented as a percentage: 50% coverage etc ...
  Code Coverage with Maven in commandLine:
      mvn clean test
      maven-surefire-plugin -- for configuring maven unit test coverage
Conditional Tests:
  @Disabled ----Disable the test method
  @EnabledOnOs-----Enable test when running on a given operating system
@EnabledOnJre ---Enable test for a given Java version
@EnabledForJreRange---- Enable test for a given Java version range


      

       
