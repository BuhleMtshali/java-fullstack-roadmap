# ☕ Day 02: Variables, Data Types & Interactive CLI Programs

> **“Yesterday Java could say hello. Today it can ask for my salary, calculate my savings, and do maths on command. We’re moving suspiciously fast.”** 😭💸☕

Welcome to **Day 02 of my Full-Stack Java Developer Journey** 🚀

Today’s official topic was:

# 🧠 Variables & Data Types

The main goal was to understand how Java **stores, identifies, changes, and works with information**.

Instead of stopping at basic examples like:

```java
int age = 25;
String name = "Buhle";
```

I pushed the concepts into two interactive CLI mini-projects:

```text
💸 Mini Finance Snapshot
🧮 Mini Calculator
```

Both programs accept real user input, store the values inside variables, process those values, and produce calculated output.

So Day 02 became less:

```text
"What is a variable?"
```

and more:

```text
"Okay Java, take this data and actually do something useful with it." 🔥
```

---

# 🎯 Today's Mission

By the end of Day 02, I wanted to understand:

* 📦 What variables are
* 🧠 Why Java needs data types
* 🔢 How numeric values are stored
* 🔤 How text and characters are stored
* ✅ How booleans represent state
* 🏷️ Variable naming conventions
* 📝 Declaration vs assignment
* 🔄 Reassigning variable values
* 🧮 Performing calculations using variables
* 📥 Getting input from the user
* 🔁 Repeating a program using loops
* 🤔 Making basic decisions
* 🎛️ Choosing logic using `switch`
* 🧹 Cleaning user input
* 🔠 Working with basic String methods
* 🚪 Closing resources when the program finishes

---

# 🧠 What Is a Variable?

A variable is basically a **named container that holds information while the program is running**.

Example:

```java
double salary = 30000.00;
```

Breaking it apart:

```text
double   salary   =   30000.00;
  │        │      │      │
  │        │      │      └── value
  │        │      │
  │        │      └──────── assignment operator
  │        │
  │        └─────────────── variable name
  │
  └──────────────────────── data type
```

Human translation:

> Create a variable called `salary` that stores decimal numbers, then place `30000.00` inside it.

---

# 📝 Declaration vs Assignment

## Declaration

```java
double salary;
```

This creates the variable.

Java now knows:

```text
salary → stores decimal numbers
```

---

## Assignment

```java
salary = 30000.00;
```

This places a value inside the variable.

---

## Both At Once

Usually I can simply write:

```java
double salary = 30000.00;
```

This declares and assigns the variable in one line.

---

# 🔢 Core Data Types

Java has several data types, but today I focused mainly on the ones that are most useful while learning.

| Data Type | Stores            | Example                     |
| --------- | ----------------- | --------------------------- |
| `int`     | Whole numbers     | `int age = 25;`             |
| `double`  | Decimal numbers   | `double salary = 30000.50;` |
| `boolean` | `true` or `false` | `boolean active = true;`    |
| `char`    | One character     | `char operator = '+';`      |
| `String`  | Text              | `String answer = "yes";`    |

---

# 🔤 `String`

A `String` stores text.

```java
String answer = "yes";
```

Strings use:

```text
"double quotes"
```

Example:

```java
String name = "Buhle";
```

---

# 🔡 `char`

A `char` stores **one character**.

Example:

```java
char operator = '+';
```

Unlike a String, a `char` uses:

```text
'single quotes'
```

So:

```java
char operator = '+';
```

is valid.

But:

```java
char operator = "plus";
```

would not be.

---

# 🔢 `double`

`double` stores decimal numbers.

Example:

```java
double salary = 30000.00;
```

This makes sense for financial calculations because money may include decimal values.

---

# 👀 `Double` vs `double`

In my projects today, I used:

```java
Double salary;
```

instead of:

```java
double salary;
```

Both can hold decimal values, but they are technically different.

```text
double → primitive data type

Double → wrapper class
```

For my current beginner-level calculations, I could simply use:

```java
double
```

The deeper reason wrapper classes like `Double` exist comes later in the roadmap.

For now:

> **`double` is my normal default for decimal numbers.**

---

# ✅ `boolean`

A boolean stores one of only two values:

```text
true
false
```

Example:

```java
boolean found = false;
```

Booleans are useful when a program needs to remember whether something has happened.

---

# 💡 Variables Can Be Calculated From Other Variables

This was one of the biggest concepts from today.

A value does not always need to be typed manually.

For example:

```java
double salary = 30000;
double expenses = 18000;

double leftOverMoney = salary - expenses;
```

`leftOverMoney` is calculated using values stored inside other variables.

So:

```text
salary
30000
   │
   ├───────────┐
   │           │
   ▼           ▼
expenses     calculation
18000           │
                ▼
           leftOverMoney
               12000
```

This is called **derived data**.

The value is derived from other information.

---

# 📥 User Input With `Scanner`

Today I also introduced user input using:

```java
import java.util.Scanner;
```

Then:

```java
Scanner input = new Scanner(System.in);
```

Beginner mental model:

```text
Scanner
   ↓
listens for keyboard input
   ↓
user types something
   ↓
Java reads it
   ↓
value gets stored in a variable
```

Example:

```java
double salary = input.nextDouble();
```

If the user types:

```text
30000
```

then:

```text
salary
   ↓
30000
```

---

# 🧠 Different Scanner Methods

I used several Scanner methods today.

### Decimal numbers

```java
input.nextDouble();
```

---

### A single word/token

```java
input.next();
```

---

### Entire line of text

```java
input.nextLine();
```

Each method reads input slightly differently.

This became important when mixing:

```java
nextDouble()
```

with:

```java
nextLine()
```

---

# 🧹 Clearing Scanner Input

After using:

```java
input.nextDouble();
```

there can still be a newline waiting inside the Scanner input buffer.

So before reading a full line:

```java
String response = input.nextLine();
```

I used:

```java
input.nextLine();
```

once first.

Example:

```java
input.nextLine();

System.out.print("Create another snapshot? ");

String response = input.nextLine();
```

This clears the leftover newline before collecting the real answer.

Tiny line.

Huge amount of beginner confusion avoided. 😭

---

# 🧼 Cleaning String Input

I also used:

```java
.trim()
```

and:

```java
.toLowerCase()
```

Example:

```java
String response = input
        .nextLine()
        .trim()
        .toLowerCase();
```

If the user enters:

```text
   YES
```

then:

```java
.trim()
```

removes the extra spaces:

```text
YES
```

Then:

```java
.toLowerCase()
```

turns it into:

```text
yes
```

This makes checking user input much easier.

---

# 🧪 Mini Project 01: 💸 Finance Snapshot

The first major Day 02 project was an interactive finance calculator.

The program asks the user for:

```text
💰 Monthly income
🧾 Monthly expenses
🐷 Savings percentage
```

It then calculates:

```text
💵 Actual money saved
💸 Leftover money
```

and displays a monthly snapshot.

---

# 💻 Finance Snapshot

```java
import java.util.Scanner;

public class FinanceSnapshot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
            "===== 💸 Mini Finance Snapshot 🚕 ===="
        );

        while (true) {

            System.out.print(
                "🙋🏻‍♀️ How much is your cumulative income per month(R): "
            );

            Double salary = input.nextDouble();

            System.out.print(
                "How much are your monthly expenses(R): "
            );

            Double expenses = input.nextDouble();

            System.out.print(
                "What percentage of your salary do you save(%): "
            );

            Double savings = input.nextDouble();

            // CALCULATING SAVINGS

            Double totalSavings =
                    savings / 100 * salary;

            System.out.print(
                "Saving: R" + totalSavings
            );

            // CALCULATING LEFTOVER MONEY

            Double leftOverMoney =
                    salary - expenses - totalSavings;

            System.out.println(
                "\n======== MONTHLY SNAPSHOT ======="
            );

            System.out.println(
                "Monthly Income: R" + salary
            );

            System.out.println(
                "Monthly Expenses: R" + expenses
            );

            System.out.println(
                "Monthly Savings Rate: "
                + savings + "%"
            );

            System.out.println(
                "Total Saving: R" + totalSavings
            );

            System.out.println(
                "Leftover Money R: "
                + leftOverMoney
            );

            System.out.println(
                "\n=================================="
            );

            // CLEARING OUT THE INPUT

            input.nextLine();

            System.out.print(
                "\nWanna create another Snapshot? (yes/no): "
            );

            String response = input
                    .nextLine()
                    .trim()
                    .toLowerCase();

            if (response.equals("no")) {

                System.out.println(
                    "======== THANK YOU ======="
                );

                break;

            } else {

                System.out.println(
                    "===== Okay, let's create another Snapshot 🧾 ====="
                );

            }

        }

        input.close();

    }

}
```

---

# 🧠 Finance Snapshot Logic

Before thinking about syntax, the program logic is:

```text
START
  ↓
Ask for salary
  ↓
Store salary
  ↓
Ask for expenses
  ↓
Store expenses
  ↓
Ask for savings percentage
  ↓
Store savings rate
  ↓
Calculate actual savings
  ↓
Calculate leftover money
  ↓
Print snapshot
  ↓
Ask whether user wants another
  ↓
 YES ────────► repeat
  │
  NO
  ↓
break
  ↓
close Scanner
  ↓
END
```

---

# 🧮 Calculating Savings

The user enters a percentage:

```text
20%
```

but I need the actual money amount.

So:

```java
Double totalSavings =
        savings / 100 * salary;
```

Example:

```text
salary = R30,000
savings = 20%
```

First:

```text
20 / 100
=
0.20
```

Then:

```text
0.20 × 30,000
=
6,000
```

Therefore:

```text
totalSavings = R6,000
```

---

# 💸 Calculating Leftover Money

I then calculate:

```java
Double leftOverMoney =
        salary - expenses - totalSavings;
```

Example:

```text
Salary
R30,000

Expenses
-R18,000

Savings
-R6,000
────────
Left
R6,000
```

This is another example of variables interacting with each other.

---

# 🔁 Keeping The Program Running

Instead of allowing the Finance Snapshot to run only once, I wrapped it inside:

```java
while (true)
```

This creates a loop that continues indefinitely unless something explicitly stops it.

Inside the program:

```java
if (response.equals("no")) {
    break;
}
```

The:

```java
break;
```

terminates the loop.

So:

```text
while(true)
     ↓
run snapshot
     ↓
another?
 ↙       ↘
yes      no
 ↓        ↓
repeat   break
```

---

# 🧪 Mini Project 02: 🧮 Mini Calculator

My second project was an interactive calculator.

The program accepts:

```text
1️⃣ First number
🎛️ Operator
2️⃣ Second number
```

Supported operators:

```text
+
-
*
/
```

The calculator then chooses the correct calculation and prints the result.

---

# 💻 Mini Calculator

```java
import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args)
            throws Exception {

        System.out.println(
            "====== 🧮 MINI CALCULATOR 🎲 ====="
        );

        Scanner input =
                new Scanner(System.in);

        while (true) {

            Double output;

            System.out.print(
                "\n1️⃣ Enter your first number: "
            );

            Double firstNumber =
                    input.nextDouble();

            System.out.print(
                "Choose an operator (+, -, *, /): "
            );

            char operator =
                    input.next()
                         .charAt(0);

            System.out.print(
                "Enter your second value: "
            );

            Double secondNumber =
                    input.nextDouble();

            switch (operator) {

                case '+':

                    output =
                            firstNumber
                            + secondNumber;

                    System.out.println(
                        "Result: " + output
                    );

                    break;

                case '-':

                    output =
                            firstNumber
                            - secondNumber;

                    System.out.println(
                        "Result: " + output
                    );

                    break;

                case '*':

                    output =
                            firstNumber
                            * secondNumber;

                    System.out.println(
                        "Result: " + output
                    );

                    break;

                case '/':

                    if (secondNumber != 0) {

                        output =
                                firstNumber
                                / secondNumber;

                        System.out.println(
                            "Result: " + output
                        );

                    } else {

                        System.out.println(
                            "We cannot divide by 0"
                        );

                    }

                    break;

                default:

                    System.out.println(
                        "❌ Invalid operator!"
                    );

                    break;

            }

            input.nextLine();

            System.out.print(
                "\nWanna run another calculation? (yes/no): "
            );

            String answer = input
                    .nextLine()
                    .trim()
                    .toLowerCase();

            if (answer.equals("no")) {

                System.out.println(
                    "🐝 Thank you for using my mini calculator 🎲"
                );

                break;

            } else {

                System.out.println(
                    "\n🔁 Okayyy, let's run another one! 🎉"
                );

            }

        }

        input.close();

    }

}
```

---

# 🎛️ Choosing An Operator With `char`

I stored the operator using:

```java
char operator =
        input.next().charAt(0);
```

Breaking that apart:

```text
input.next()
     ↓
read user's input

Example:
"*"
     ↓
.charAt(0)
     ↓
get character at position 0
     ↓
'*'
```

Then that character gets stored inside:

```java
operator
```

---

# 🎚️ `switch`

The calculator uses:

```java
switch (operator)
```

to choose what calculation should happen.

Conceptually:

```text
operator
   ↓
   +
   │
   ├── '+' → addition
   ├── '-' → subtraction
   ├── '*' → multiplication
   └── '/' → division
```

Example:

```java
case '+':
```

means:

> If the operator is `+`, run this block.

---

# 🧮 Addition

```java
output =
        firstNumber + secondNumber;
```

---

# ➖ Subtraction

```java
output =
        firstNumber - secondNumber;
```

---

# ✖️ Multiplication

```java
output =
        firstNumber * secondNumber;
```

---

# ➗ Division

```java
output =
        firstNumber / secondNumber;
```

Before dividing, I also check:

```java
if (secondNumber != 0)
```

because dividing by zero is not a valid normal calculation.

So:

```text
secondNumber
      ↓
    == 0?
   ↙     ↘
 yes     no
  ↓       ↓
error   divide
```

---

# 🐛 Bug Caught: Division Operator

While reviewing my calculator, I spotted an important bug in my original division case.

I originally had:

```java
output =
        firstNumber * secondNumber;
```

inside:

```java
case '/':
```

That would perform multiplication instead of division. 😭

The correct operation is:

```java
output =
        firstNumber / secondNumber;
```

This was a good reminder that:

> **Code can compile successfully and still contain incorrect logic.**

The computer faithfully does exactly what I write.

Even when what I write is nonsense. 💀

Debugging isn't only about fixing red error messages.

Sometimes the program runs perfectly...

and gives the wrong answer.

---

# ⚠️ `throws Exception` Revisited

My calculator currently has:

```java
public static void main(String[] args)
        throws Exception
```

From Day 01, I learned that:

```java
throws Exception
```

means roughly:

> “If an exception happens here and I don't handle it, pass the responsibility upward.”

The calculator currently doesn't need this declaration for the code I'm running.

So it could simply be:

```java
public static void main(String[] args)
```

I'm keeping the distinction in mind for later when I properly study exception handling.

---

# 🧠 Normal Logic vs Exceptions

Another important lesson continued from Day 01:

Not every problem needs an exception.

For example:

```text
User enters /
Second number is 0
```

I can handle that with normal logic:

```java
if (secondNumber != 0)
```

instead of immediately reaching for:

```java
throws Exception
```

Beginner rule:

```text
NORMAL PROGRAM DECISION
        ↓
if / else / switch

ACTUAL EXCEPTIONAL FAILURE
        ↓
exceptions
```

Exceptions get their own proper battlefield later. ⚔️

---

# 🛑 `break`

Today I used `break` in two different contexts.

## Inside loops

```java
break;
```

means:

> Stop the loop.

---

## Inside `switch`

```java
case '+':
    ...
    break;
```

means:

> Stop executing this `switch` case.

Same keyword.

Different surrounding context.

---

# 🔁 Program State & User Control

Both projects allow the user to decide whether the program should continue.

Example:

```java
String answer =
        input.nextLine()
             .trim()
             .toLowerCase();
```

Then:

```java
if (answer.equals("no")) {
    break;
}
```

So the user controls the flow:

```text
Program finishes calculation
           ↓
      Run again?
       ↙     ↘
     yes      no
      ↓        ↓
    repeat    exit
```

This made both projects feel more like actual CLI applications instead of one-shot exercises.

---

# 🧹 Closing The Scanner

At the end:

```java
input.close();
```

This closes the Scanner when the program no longer needs it.

Good habit:

```text
Open resource
     ↓
Use resource
     ↓
Finish program
     ↓
Close resource
```

---

# 🧠 Biggest Day 02 Lesson

Today started with:

```java
double salary = 30000;
```

But variables became much more meaningful once they started interacting.

For example:

```java
Double totalSavings =
        savings / 100 * salary;
```

and:

```java
Double leftOverMoney =
        salary
        - expenses
        - totalSavings;
```

The important part isn't memorizing:

```text
double
String
char
boolean
```

The important part is understanding:

> **What information does my program need, what type of information is it, where should I store it, and what should I do with it?**

That is the programming logic underneath the Java syntax.

---

# 🧩 From Human Logic → Java

My Finance Snapshot starts as:

```text
Ask for income
Ask for expenses
Ask for savings %
Calculate savings
Calculate leftover
Print snapshot
Ask whether to repeat
```

Then Java gives me tools to represent each step:

```text
Information
    ↓
Variables

Numbers
    ↓
double

Text
    ↓
String

One character
    ↓
char

Input
    ↓
Scanner

Repeated behaviour
    ↓
while

Decisions
    ↓
if / switch

Stop repetition
    ↓
break
```

That connection between **logic and syntax** is the real lesson.

---

# 📦 Day 02 Concepts Unlocked

```text
✅ Variables
✅ Data Types
✅ Declaration
✅ Assignment
✅ Reassignment
✅ double
✅ Double
✅ String
✅ char
✅ User Input
✅ Scanner
✅ nextDouble()
✅ next()
✅ nextLine()
✅ charAt()
✅ trim()
✅ toLowerCase()
✅ Arithmetic calculations
✅ Derived variables
✅ while loops
✅ if statements
✅ switch statements
✅ break
✅ Resource cleanup
✅ Basic debugging
✅ Logic-first thinking
```

For a Variables & Data Types day...

we may have wandered slightly outside the syllabus. 😭🔥

---

# 🛠️ Projects Completed

## 💸 01. Mini Finance Snapshot

### Features

```text
📥 Accept monthly income
📥 Accept monthly expenses
📥 Accept savings percentage
🧮 Calculate actual savings
💰 Calculate leftover money
🧾 Print monthly financial snapshot
🔁 Allow multiple snapshots
🚪 Exit when user chooses
```

### Main Concepts

```text
Variables
double / Double
Scanner
Arithmetic
Strings
while loop
if statement
break
```

---

## 🧮 02. Mini Calculator

### Features

```text
📥 Accept first number
🎛️ Accept operator
📥 Accept second number
➕ Addition
➖ Subtraction
✖️ Multiplication
➗ Division
🚫 Prevent divide-by-zero calculation
❌ Detect invalid operators
🔁 Repeat calculations
🚪 User-controlled exit
```

### Main Concepts

```text
Variables
double / Double
char
Scanner
switch
if
while
break
String processing
Arithmetic operators
```

---

# 🐛 Bugs & Lessons Learned

Today also reinforced something important:

## A program running does not mean the program is correct.

My division case originally contained:

```java
firstNumber * secondNumber
```

instead of:

```java
firstNumber / secondNumber
```

The code itself was valid Java.

The **logic** was wrong.

That means debugging includes checking:

```text
Does it compile? ✅

Does it run? ✅

Does it produce the CORRECT result? 👀
```

All three matter.

---

# 🚀 Future Upgrades

These projects can evolve as I learn more Java.

## Finance Snapshot

Future versions could include:

```text
🚦 Financial health status
🎯 Savings targets
📊 Expense percentages
⚠️ Overspending warnings
📅 Multiple months
📈 Monthly comparisons
🗄️ Database persistence
🌐 Finance REST API
```

---

## Mini Calculator

Future versions could include:

```text
🧠 More operators
📐 Powers
√ Square roots
📊 Calculation history
🧹 Dedicated methods
🚨 Exception handling
🖥️ GUI interface
```

---

# 🧭 Where These Projects Could Eventually Go

Today:

```text
Scanner
   ↓
Variables
   ↓
Calculations
   ↓
CLI output
```

Later:

```text
React UI
   ↓
Spring Boot API
   ↓
Business logic
   ↓
Database
```

The tiny calculator and finance CLI are simple now, but the core programming pattern is already there:

```text
INPUT
  ↓
PROCESS
  ↓
OUTPUT
```

That pattern follows software everywhere.

---

# 📊 Day 02 Progress

```text
DAY 02
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Variables                 ✅
Primitive Types           ✅
String                    ✅
Numeric Data              ✅
User Input                ✅
Scanner                   ✅
Calculations              ✅
Derived Values            ✅
String Processing         ✅
char                      ✅
while Loop                ✅ Sneak Peek
if Statements             ✅ Sneak Peek
switch                     ✅ Sneak Peek
break                      ✅
Debugging Logic           ✅

Mini Finance Snapshot     ✅ 💸
Mini Calculator           ✅ 🧮

STATUS: COMPLETE 🔥
```

---

# 🧠 Day 02 Brain Upgrade

Yesterday:

```java
System.out.println("Hello, World!");
```

Today:

```text
User enters data
      ↓
Java stores it
      ↓
Java processes it
      ↓
Java makes decisions
      ↓
Java calculates results
      ↓
Java asks what happens next
```

We're officially beyond Hello World territory. ☕🔥

---

# 🧭 Next Stop

## Day 03: Operators ⚙️

Coming next:

```text
+
-
*
/
%
++
--
+=
-=
==
!=
>
<
>=
<=
&&
||
!
```

And most importantly:

> **Understanding what each operator actually tells Java to do.**

Then we build:

# ⚡ Smart Utility Calculator

The Java Warzone continues. ☕⚔️

---

# 🔥 Day 02 Motto

> **“Variables hold the data. Logic gives the data a job.”**

```text
INPUT 📥
   ↓
STORE 📦
   ↓
PROCESS 🧠
   ↓
DECIDE 🤔
   ↓
OUTPUT 📤
   ↓
DEBUG 🐛
   ↓
LEVEL UP 🔥
```

**Day 02 complete. Two mini systems shipped. ☕💸🧮**
