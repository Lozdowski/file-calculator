## file-calculator

> Command line application calculating result of provided in file math instructions

# Technologies
- Java 11
- JUnit5
- Maven

# To run
1. Download project as a zip file or clone
2. Ensure you have Java 11 and Maven installed 
3. Project already contains .jar file
3. Open command prompt and type:
```bash
java -jar target/file-calculator-X-fat-jar.jar
```
# Features

Application calculates result based on provided in file instructions.
User is asked to type filepath with filename of the file for calculation, then result is printed to the screen.

Example file input
```bash
add 4
multiply 5
apply 10
```
```bash
output of above file printed on the screen : 70
```
Assumptions:
* instructions will ignore mathematical precedence
* last instruction should be "apply" (for example: "apply 3")
* all instructions are applied to the "apply" row
