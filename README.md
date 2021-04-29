# TDD Basic Example

This project shows a basic TDD example with some of the most common annotations.

This project used Java and Maven.

We have to declare the maven-surefire-plugin in the pom.xml file and configure the dependencies of this plugin. 

We have to declare the following dependencies:

The junit-platform-surefire-provider dependency allows us to run tests that use either the “old” JUnit (3 or 4) or JUnit 5.

If we want to run tests that use either JUnit 3 or 4, we have to declare the junit-vintage-engine dependency.

If we want to run tests that use JUnit 5, we have to declare the junit-jupiter-engine dependency.

* Junit Jupiter Dependency graph
    - https://junit.org/junit5/docs/current/user-guide/
* JUnit Annotation
    - https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations

  
## Maven goals
### Run the unit tests
```
mvn clean test
```

### Generate javadoc for the source code
```
mvn javadoc:javadoc
```

### Generate javadoc for the test code
```
mvn javadoc:test-javadoc
```

### Generate Jacoco source code coverage report
```
mvn test jacoco:report
```

### Check if thresholds limits are achieved
```
mvn test jacoco:check
```

### Generates a PIT Mutation coverage report to target/pit-reports/YYYYMMDDHHMI
```
mvn org.pitest:pitest-maven:mutationCoverage
```

### Generates a quicker PIT Mutation coverage report to target/pit-reports/YYYYMMDDHHMI
```
mvn org.pitest:pitest-maven:mutationCoverage -DwithHistory
```

### Complete example

``` 
mvn test jacoco:report org.pitest:pitest-maven:mutationCoverage -DhistoryInputFile=target/fasterPitMutationTesting-history.txt -DhistoryOutputFile=target/fasterPitMutationTesting-history.txt -Dsonar.pitest.mode=reuseReport -Dthreads=4 -DtimestampedReports=false
```
## Jacoco dependencies
* https://github.com/pitest/pitest-junit5-plugin
  - https://mvnrepository.com/artifact/org.pitest/pitest-junit5-plugin
    - required to work with JUnit5

## Testcases
### Sum
Case 1: positive + positive
```
4 + 3
expected: 7
```
Case 2: positive + negative
 ```
4 + -3
expected: 1
 ```
Case 3: negative + positive
 ```
-4 + 3
expected: -1
 ```
Case 4: negative + negative
```
-4 + -3
expected: -7
```
Case 5: positive + 0
   ```
   4 + 0
   expected: 4
   ```
Case 6: 0 + positive
```
0 + 3
expected: 3
```
Case 7: negative + 0
```
-4 + 0
expected: -4
```
Case 8: 0 + negative
```
0 + -3
expected: -3
```



#
### Subtract
Case 1: positive - positive
```
4 - 3
expected: 1
```
Case 2: positive - negative
 ```
4 - -3
expected: 7
 ```
Case 3: negative - positive
 ```
-4 - 3
expected: -7
 ```
Case 4: negative - negative
```
-4 - -3
expected: -1
```
Case 5: positive - 0
```
4 - 0
expected: 4
```
Case 6: 0 - positive
```
0 - 3
expected: -4
```
Case 7: negative - 0
```
-4 - 0
expected: -4
```
Case 8: 0 - negative
```
0 - -3
expected: 3
```




#
### Multiply
Case 1: positive * positive
```
4 * 3
expected: 12
```
Case 2: positive * negative
 ```
4 * -3
expected: -12
 ```
Case 3: negative * positive
 ```
-4 * 3
expected: -12
 ```
Case 4: negative * negative
```
-4 * -3
expected: 12
```
Case 5: positive * 0
```
4 * 0
expected: 0
```
Case 6: 0 * positive
```
0 * 3
expected: 0
```
Case 7: negative * 0
```
-4 * 0
expected: 0
```
Case 8: 0 * negative
```
0 * -3
expected: 0
```



#
### Divide
###### Assumption: Java compiler cuts off Integers at decimal point without rounding 
Case 1: positive / positive
```
8 / 3
expected: 2
```
Case 2: positive / negative
 ```
8 / -3
expected: -2
 ```
Case 3: negative / positive
 ```
-8 / 3
expected: -2
 ```
Case 4: negative / negative
```
-8 / -3
expected: 2
```
Case 5: positive / 0
```
8 / 0
expected: error
```
Case 6: 0 / positive
```
0 / 3
expected: 0
```
Case 7: negative / 0
```
-8 / 0
expected: error
```
Case 8: 0 / negative
```
0 / -3
expected: 0
```

#
### Factorial
Case 1: positive
```
3!
expected: 6
```
Case 2: negative
 ```
-3!
expected: 1
 ```
Case 3: 0
 ```
0!
expected: 1
 ```