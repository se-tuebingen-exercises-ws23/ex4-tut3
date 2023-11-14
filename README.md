# Exercise #04 - Multi-paradigm Programming in Scala

### Hello, world!

1. Clone this GitHub repository: `se-tuebingen-exercises-ws23/ex4-tutN` where `N` is the number of your tutorial.
2. Open it in the IntelliJ IDE.
3. Run the project.
    - In IntelliJ: use the green run button ▶️ on the top right
        - If it doesn't work straight away, try adding a new configuration -> sbt task -> `run`, see [the IntelliJ guide on the forum](https://ps-forum.cs.uni-tuebingen.de/t/de-intellij-scala-plugin-einrichten/1386#run-an-sbt-project-5).
    - If you prefer the command line: use the command `sbt run`.
    - If you have any problems with your setup, please, ask on the forum.
4. Observe the "Hello, world!" Scala program in `Main.scala`
5. Use `sbt console` on the command line to try out a REPL!
6. Try `1 + 1` in the REPL.
7. Define a function summing up two integers in the `Main.scala` file and call it from the REPL:
```scala
def add(x: Int, y: Int) = x + y
```

> [!Note]
> You might need to reload your REPL. Use `:load Main.scala` to do so.

### A Taste of Scala

Go through [A Taste of Scala](https://docs.scala-lang.org/scala3/book/taste-intro.html) together with your tutor & answer the following questions.
Please, try things out in the REPL / the given file.

> [!Important]
> No need to go further than 'Singleton Objects'.

**Questions:**
1. What is the difference between statements and expressions?
    - Compare with the languages you already know (Java, BSL/ISL)
2. What is the difference between values and types?
3. What is the difference between mutable and immutable variables?
    - What is their syntax?
    - Compare with the languages you already know (Java, BSL/ISL)
4. What features of Java are similar to `trait`s?
5. What is the difference between Java `enum`s and Scala `enum`s?
6. What features of BSL/ISL are similar to Scala `enum`s?
7. What is the difference between a method and a function?
8. What are first class functions? How do you use them?
     - Compare with the languages you already know (Java, BSL/ISL)

### Exercises

Try to write the following programs in pairs:

1. Function `shout` which takes a string and adds an exclamation mark `!` to its end.
    - Implement two versions: one using `+` and one using string interpolation.
2. Function `passed` which takes a German university grade as a float and returns `True` if the grade is passing (bestanden) or `False` if it isn't (nicht bestanden).
    - Implement two versions: one using `if-else` and one using `match`.
3. Function `factorial` which returns the factorial of a given number.
    - Implement two versions: one using recursion and one using a `for-loop`.
4. Class `Person` with a first name, a last name, and a method which returns them in the format: `Mustermann, Maxine`.
5. Class `Student` which inherits from the `Person` class and has a student ID (Matrikelnr)
6. Enum `Rank` which is either a `Professor`, `Tutor` or a `Student`.
    - Then make a function which pattern matches on the given `Rank`.
7. Enum `IntList` (similar to `List-of-number` from Info1).
    - ... with two constructors:
        - `Empty` with no parameters
        - `Cons` which has two parameters, an integer and the rest of the list as an `IntList`
    - Then create some examples of the list,
    - and write a function which sums up all of the numbers in a list.
8. Function which sums up all of the numbers in a _standard library_ list
    - **Hint:** Use Google / the documentation to find:
        - How are standard library lists called
        - How to create one
        - How to pattern match on them
        - How does a for-each work with lists 
    - Implement two versions: one using pattern matching and recursion, one using a `for-each` loop.
9. Function which takes a (standard library) list of `Person` and filter the people whose first and last name starts with the same character.
    - Implement two versions: one using a `for-each` loop and one using the `.filter` method.
10. Identity function (returns its argument)
    - What is its type?
11. Function which takes a list of type `A` and a predicate (function `A => Bool`) and returns a pair of lists (all of the `False` items will be on the left side, all of the `True` items will be on the right side)

### BONUS: Tooling

1. Open this repository in the IntelliJ IDE again.
2. Hover over a type and observe the tooltip, hover over a term and observe the tooltip.
3. Use 'go to definition' and look at the definition of a name.
4. Use 'find usages', use 'find implementation' on a method/class/trait to find where it's used.
5. Use right click to see what other actions the IDE can perform.
6. Use context actions (the little lightbulb 💡).

