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


Traditional Development --- Design Code Test4 TDD --Test Refactor Code

TDD Development -- 1.Write a failing Test 2.Write Code to make the test pass 3.Refactor the code 4. Repeat the process ParameterizedTests --- 1.Run a test multiple times and provide different paramater values 2.@ValueSource,@CsvSource,@CsvFileSource,@EnumSource,@MethodSource

      

       
