# 06 - tests

Hoang Anh Tuan

<hoang.dusan@gmail.com>

Deadline: 14.4.2024

Requirements:

- You do not have to procotol absolutely everything, such as 'cd' commands,
  'rm -rf' when the task tells you to do a 'rm -rf', 'vim file', etc.
- Include output of commands only when explicitly requested.
- You can write answers in Czech.

Useful links and help:
  http://junit.org/junit5/
  https://github.com/junit-team/junit/wiki

## Tasks

1. Write unit tests for the class (in your preferred language) that provides functionality of a sorted map.
   That means java.util.TreeMap (http://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html) in case of Java, SortedDictionary for C#, and so on.
   In the case you plan to use a different language (C/C++, Python, ...), find the corresponding class with similar behavior and then adapt tasks 1-3.

   In the case of Java, you need to download all the required libraries (JUnit, ...) from the web or from the Maven repository.

   Cover the following basic use cases:
     - adding new mapping with the key different from all present mappings
     - adding new mapping with a key equal to some already present mapping
     - removing some element (mapping) already present in the map
     - removing all elements from the map and checking for emptiness
     - getting the value associated with a specific key
     - attempt to get a value for a key not present in the map

   Always verify the current state of the map (content, size) and, if necessary, also the state of the associated iterator.

   Your tests should be calling only public methods of the respective class or interface (you will make black-box tests).

   Follow the recommended practices for writing unit tests.

- `src/test/java/mff/tuan/TreeMapTest.java`

2. Build and execute all tests for the sorted-map class and verify that they pass.
   Run tests from the command line, using the approach recommended for the respective testing framework (JUnit, MSTest, ...), or from within a build script (Maven, Ant, Gradle, MSBuild, ...).
   Paste the command (or the build script) and test output here.

- `success.txt`

3. Add another test for the sorted-map class that fails and prints a custom error message.
   For example, you can assert that the map has a key-value mapping which it does not really have.
   Run the tests and paste the output here. 
   In the output, mark the line of the output that contains the custom error message, and mark the line that identifies the place in the test code that has failed.

- `fail.txt`

4. Define interface Employees with the following methods in your favorite language (Java, C#, C/C++, Python, ...).
   List of required methods:
     int add(String name, int salary); // returns ID
     Set<Integer> getAll(); // returns a set of IDs
     String getName(int id);
     int getSalary(int id);
     void changeSalary(int id, int newSalary);
   It represents a simple database of employees.
   You do not have to create a real implementation of this interface (e.g., using an SQL database).

- `src/main/java/mff/tuan/IEmployees.java`

5. Define and implement the class Statistics that satisfies the following requirements. Use your favorite language (Java, C#, C/C++, Python, ...).
   Constructor should have an argument of type Employees that represents an instance to be used inside the class.
   List of required methods that you should implement:
     int computeAverageSalary();
     int getMinSalary();
     void printSalariesByName(); // prints the list of pairs <name, salary> that is sorted by employee names

- `src/main/java/mff/tuan/Employees.java`
- `src/main/java/mff/tuan/Statistics.java`

6. Write unit tests for methods of the Statistics class in any unit testing framework that is available for the selected language.
   In the unit tests, properly capture (model) the dependency on the instance of Employees given to the constructor.
   Define reasonable properties for the three methods and check whether they hold (using assertions in your unit tests).
   You should create unit tests that really check behavior of methods in the Statistics class (i.e., an empty stub implementation of the Employee interface is not sufficient).

- `src/test/java/mff/tuan/StatisticsTest.java`

7. Write unit tests for selected methods of the class that provides date/time-parsing functionality in the standard library of the language that you choose (Java, C#, C/C++, Python, ...).
   That means SimpleDateFormat (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html) in case of Java, for C# it should be the DateTime class (https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-8.0), and so on.
   You need to cover only methods that provide functionality corresponding to the following: constructor that accepts "String pattern", the method "String format(Date)", and the method "Date parse(String)".
   Use advanced features of the testing framework of your choice, especially parameterized tests.

- `src/test/java/mff/tuan/SimpleDateFormatTest.java`

8. Submit an archive containing your tests (source code) and the build scripts along with the protocol.

## Survey

We use the survey to evaluate the labs (tasks) and homework assignments.
It is completely voluntary, but useful for future tuning of the content and level of complexity of the labs.
Most questions can be answered using the scale from 1 to 10.
Write your answer under the corresponding question.

(1) How new was the topic and content of the lab for you?
     (1 - brand new, 10 - I already knew everything)

- 8

(2) Do you think that the content of this lab was useful?
     (1 - useless or too trivial, 10 - very useful)

- 10

(3) How do you evaluate the level of complexity of the homework assignment?
     (1 - too trivial, 5-6 - just about right, 10 - too demanding or complex)

- 6

(4) How do you evaluate your prior experience with the tool in the context of the homework assignment?
     (1 - I already know and can use everything, 10 - I tried everything practically for the first time)

- 4

(5) How much time (in minutes) did you spend working on the homework assignment?

- 360

(6) Additional space for your own comments on the lab and homework assignment: