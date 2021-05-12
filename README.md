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

#
#
#
# Testcases Bookmarking

## new testcases to increase mutation %
- [x] addKeywordToUrl Case 8: Check if keyword was added
- [x] addBookmark Case 5: Check size of Bookmarklist

## countSecureURLs() : 
- [x] Case 1: has secure URLs -> return count
- [x] Case 2: No secure URLs -> return 0
- [ ] Case 3: List empty -> return -1
- [ ] Case 4: URL starts with "www."

## Testcases
### checkIfNotDuplicate(Bookmark bookmark)
Case 1: Is Duplicate
```
Bookmark List contains: "https://www.google.com"
new Bookmark URL = "https://www.google.com"

expected: false

```
Case 2: Is not Duplicate
 ```
Bookmark List does not contain: "https://www.google.com"
new Bookmark URL = "https://www.google.com"

expected: true
 ```
Case 3: Is NULL
 ```
URL = NULL

expected false
 ```
#
### checkIfUrlValid(String url)
###### only checks syntax of URL string, not if website exists

Case 1: URL is not valid
```
URL = "hello, world!"
expected: false

```
Case 2: URL is valid
 ```
URL = "https://www.google.com"
expected: true
 ```

Case 3: String is NULL
 ```
URL = null
expected: false
 ```



#
### addKeywordToUrl(String keyword, String url)
###### Adds a Keyword to a URL, if the bookmark already has an associated URL it is simply overwritten

Case 1: is successful
```
Bookmarklist contains URL
URL = "https://github.com/"
keyword = "programming"

expected: true
```
Case 2: URL does not exist in Bookmarklist
 ```
Bookmarklist does not contain URL
URL = "https://github.com/"
keyword = "programming"

expected: false
 ```
Case 3: Keyword is NULL
 ```
Bookmarklist contains URL
URL = "https://github.com/"
keyword = NULL

expected: false
 ```
Case 4: URL is NULL
```
Bookmarklist contains URL
URL = NULL
keyword = "programming"

expected: false
```
Case 5: Keyword and URL is NULL
```
Bookmarklist contains URL
URL = NULL
keyword = NULL

expected: true
```
Case 6: Bookmark has already associated Keyword
```
Bookmarklist contains URL with keyword "work"
URL = "https://github.com/"
keyword = "programming"

expected: true
```
Case 7: Testing Case Sensitivity
```
Bookmarklist contains URL with keyword "Programming"
URL = "https://github.com/"
keyword = "programming"

expected: true
```




#
### addBookmark(String url)
###### tries to add a new Bookmark, if successful it returns the created object
Case 1: URL does not already exist, is successful
```
Bookmarklist does not contain URL 
URL = "https://github.com/"

expected: "https://github.com/"
```
Case 2: URL already exists
 ```
Bookmarklist does contain URL 
URL = "https://github.com/"
(increases rating)

expected: 2
 ```
Case 3: URL is NULL
 ```
Bookmarklist does not contain URL 
URL = NULL

expected: NULL
 ```
Case 4: URL is invalid
```
Bookmarklist does not contain URL 
URL = "hello, world!"

expected: NULL
```



#Testcases Calculator
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
expected: -3
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
 
 
 #
 #
 #
 