# ☕ Day 01: Java Setup, Hello World & My First Logic Practice

> **“Today started with `Hello, World!` and somehow ended with me searching student arrays. Java said welcome and immediately handed me homework.”** 😭☕

Welcome to **Day 01 of my Full-Stack Java Developer Journey** 🚀

Today was all about getting comfortable with the Java environment again and rebuilding my programming brain from the ground up.

I’ve touched Java before, but after not using it for a while, I’m treating this journey like I’m starting fresh.

No pretending I remember things I absolutely do not remember. 😂

The goal for today was simple:

> **Understand what Java code is actually doing instead of blindly memorizing syntax.**

---

# 🎯 Today's Mission

By the end of Day 01, I wanted to understand:

* ☕ How a basic Java program is structured
* 🚪 What the `main()` method is
* 🖨️ How to print output
* 🧩 How methods work at a beginner level
* 📦 How arrays can store multiple values
* 🔁 How to loop through an array
* 🤔 How Java makes decisions with `if`
* ✅ How booleans can track program state
* 🔍 How to compare strings
* 🛑 How `break` stops a loop
* ⚠️ What `throws Exception` roughly means
* 🧠 Why programming logic matters more than memorizing syntax

---

# ⚙️ Project Setup

For the early stages of this roadmap, I’m keeping my Java projects simple.

Each day gets its own folder inside the main repository.

```text
java-fullstack/
│
├── README.md
│
├── day-01-java-setup/
│   ├── README.md
│   └── src/
│       └── HelloWorld.java
│
├── day-02-variables-data-types/
│
└── ...
```

For now, I’m using:

```text
Java: Create Java Project
        ↓
No build tools
```

No Maven dragon yet. 🐉

We’ll summon that creature later.

---

# 👶 Starting Point: Hello World

My first Java program looked like this:

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

    }

}
```

Output:

```text
Hello, World!
```

Simple?

Yes.

But instead of treating this like magical Java boilerplate, I started breaking it down.

---

# 🧠 Understanding the Basic Structure

## `public class HelloWorld`

```java
public class HelloWorld {
```

This creates a Java **class** called:

```text
HelloWorld
```

For now, I’m thinking of a class as a container where my Java code lives.

Because the class is:

```java
HelloWorld
```

the file should be:

```text
HelloWorld.java
```

Java is very strict about matching names.

Basically:

> “Your paperwork better match your ID.” 😭

---

# 🚪 The `main()` Method

```java
public static void main(String[] args)
```

This is the starting point of the program.

When Java runs the application, it looks for:

```java
main()
```

and begins executing code from there.

For now, my beginner mental model is:

```text
Run program
    ↓
Find main()
    ↓
Start executing instructions
```

---

# 🖨️ Printing Output

To display something in the terminal:

```java
System.out.println("Hello, World!");
```

The result:

```text
Hello, World!
```

At beginner level:

```text
System.out.println()
```

basically means:

> 🗣️ **“Java, print this to the console.”**

---

# ⚠️ Tiny Side Quest: `throws Exception`

When VS Code generated my project, the `main()` method originally looked like:

```java
public static void main(String[] args) throws Exception
```

I hadn’t remembered seeing:

```java
throws Exception
```

so I stopped to understand it.

## What I learned

`throws Exception` does **not** mean:

> “If something goes wrong, fix it.”

Instead, it means:

> **“This method might produce an exception, and I’m not handling that exception here.”**

The responsibility gets passed upward to whatever called the method.

---

# 🧠 Beginner Mental Model

```text
try/catch
=
"I'll handle the problem here."
```

while:

```text
throws
=
"I'll pass the problem upward."
```

For example:

```java
public static void readFile() throws Exception {
}
```

means:

> Something inside `readFile()` might fail, and this method is not taking responsibility for handling it.

---

# 💥 Important Discovery

If `main()` also says:

```java
throws Exception
```

and nobody catches the exception, eventually the JVM receives the uncaught exception and the program stops.

So:

```text
throws != safety net
```

Instead:

```text
throws = pass responsibility
```

Exceptions will get their own proper deep dive later in the roadmap.

For now, I removed it because my Hello World program didn’t need it.

---

# 🧠 Biggest Lesson So Far: Logic First

One of the most important lessons from today:

> **Programming is not about memorizing syntax. It is about understanding the logic first.**

Before writing code, I should be able to describe what I want the program to do.

Example:

```text
1. Have a list of students
2. Search for a specific student
3. Check every student in the list
4. If the student exists → print their name
5. If the student doesn't exist → print "Student not found"
```

That is the logic.

Then Java syntax becomes the translation.

```text
Human Logic
     ↓
Java Syntax
     ↓
Working Program
```

---

# 🧪 First Logic Exercise: Student Search

After Hello World, I experimented with a simple student search program.

The goal:

> Search through an array of student names and determine whether a requested student exists.

My program:

```java
public class HelloWorld {

    public static void main(String[] args) {

        printStudent("Kathy");

    }

    public static void printStudent(String name) {

        String[] students = {"Kathy", "James", "Lebo"};

        boolean found = false;

        // LOOPING THROUGH THE STUDENT ARRAY

        for (String student : students) {

            if (student.equals(name)) {

                System.out.println("Student found: " + student);

                found = true;

                break;

            }

        }

        if (!found) {

            System.out.println("Student not found");

        }

    }

}
```

Output:

```text
Student found: Kathy
```

🔥 My first little search system.

---

# 🧩 Breaking Down the Program

## 1️⃣ Calling the Method

Inside `main()`:

```java
printStudent("Kathy");
```

This means:

> Run the `printStudent()` method and give it the value `"Kathy"`.

So:

```text
main()
   ↓
printStudent("Kathy")
```

---

# 🧠 The Method

```java
public static void printStudent(String name)
```

This creates a method called:

```text
printStudent
```

It accepts one piece of information:

```java
String name
```

So when I write:

```java
printStudent("Kathy");
```

Java effectively gives:

```text
name = "Kathy"
```

to the method.

---

# 📦 Creating an Array

```java
String[] students = {"Kathy", "James", "Lebo"};
```

This creates an array containing multiple strings.

Visually:

```text
students
   │
   ├── "Kathy"
   ├── "James"
   └── "Lebo"
```

Instead of creating:

```java
String student1 = "Kathy";
String student2 = "James";
String student3 = "Lebo";
```

I can group them together.

Much cleaner. ✨

---

# ✅ Tracking Whether the Student Was Found

```java
boolean found = false;
```

A `boolean` can only contain:

```text
true
```

or:

```text
false
```

At the beginning, I haven’t searched yet.

So:

```java
found = false;
```

means:

> “We have not found the student.”

Later, if the student exists:

```java
found = true;
```

---

# 🔁 Looping Through the Students

```java
for (String student : students)
```

This is a **for-each loop**.

Beginner translation:

> “For every student inside the `students` array, temporarily call that student `student`.”

So Java processes:

```text
Kathy
 ↓
James
 ↓
Lebo
```

one at a time.

For the first loop:

```text
student = "Kathy"
```

Next:

```text
student = "James"
```

Next:

```text
student = "Lebo"
```

---

# 🔍 Comparing Names

Inside the loop:

```java
if (student.equals(name))
```

This asks:

> “Does the current student have the same text as the name we're searching for?”

If:

```text
student = "Kathy"
```

and:

```text
name = "Kathy"
```

then:

```java
student.equals(name)
```

becomes:

```text
true
```

So the code inside the `if` executes.

---

# 🖨️ Printing the Student

```java
System.out.println("Student found: " + student);
```

The `+` joins text together.

If:

```text
student = Kathy
```

then:

```java
"Student found: " + student
```

becomes:

```text
Student found: Kathy
```

---

# ✅ Changing the Boolean

Once the student is found:

```java
found = true;
```

Our program state changes from:

```text
found = false
```

to:

```text
found = true
```

Meaning:

> “Yep. We found them.”

---

# 🛑 Breaking Out of the Loop

```java
break;
```

Once the student has been found, there is no reason to keep searching.

So:

```java
break;
```

tells Java:

> **“Stop this loop now.”**

Without it, Java would unnecessarily continue checking the remaining students.

---

# ❗ Checking If Nothing Was Found

After the loop:

```java
if (!found)
```

The `!` means:

> **NOT**

So:

```java
!found
```

means:

> “if `found` is NOT true”

or more simply:

> “if we never found the student”

Then:

```java
System.out.println("Student not found");
```

runs.

---

# 🧠 Program Flow

If I search:

```java
printStudent("Kathy");
```

the program roughly behaves like this:

```text
START
  ↓
main()
  ↓
printStudent("Kathy")
  ↓
Create students array
  ↓
found = false
  ↓
Check Kathy
  ↓
"Kathy".equals("Kathy")
  ↓
TRUE ✅
  ↓
Print "Student found: Kathy"
  ↓
found = true
  ↓
break
  ↓
if (!found)
  ↓
FALSE
  ↓
END
```

---

# 🧪 What If I Search for Someone Missing?

Example:

```java
printStudent("Buhle");
```

Array:

```text
Kathy
James
Lebo
```

The loop checks:

```text
Buhle == Kathy ❌
Buhle == James ❌
Buhle == Lebo ❌
```

No match.

So:

```text
found
```

remains:

```text
false
```

Then:

```java
if (!found)
```

becomes:

```text
if (true)
```

and Java prints:

```text
Student not found
```

---

# ⚠️ Normal Logic vs Exceptions

Another important thing I learned today:

A result such as:

```text
Student not found
```

doesn't automatically need to be an exception.

Sometimes a missing result is completely normal program behaviour.

For example:

```text
Search student
      ↓
Student exists?
   ↙       ↘
 YES       NO
 ↓          ↓
Print     Print
student   not found
```

That can simply be handled using:

```java
if
```

and:

```java
else
```

or variables such as:

```java
boolean found
```

Exceptions are more useful when something actually goes wrong and needs special handling.

---

# 🧠 Day 01 Concepts Unlocked

```text
✅ Java project setup
✅ Classes
✅ main() method
✅ println()
✅ Basic methods
✅ Method parameters
✅ String arrays
✅ Booleans
✅ for-each loops
✅ if statements
✅ String comparison with .equals()
✅ break
✅ ! operator
✅ Basic exception awareness
✅ Program flow
✅ Logic-first thinking
```

Not bad for a supposed Hello World day. 😭🔥

---

# 💡 Biggest Takeaways

### 1. Understand before memorizing

I don't want to memorize:

```java
for (String student : students)
```

without understanding what Java is actually doing.

---

### 2. Logic comes before syntax

Before coding:

```text
What should happen?
        ↓
What information do I need?
        ↓
What decisions need to happen?
        ↓
What should happen after each decision?
```

Then translate that into Java.

---

### 3. Methods help organize behaviour

Instead of putting everything inside:

```java
main()
```

I can create methods such as:

```java
printStudent()
```

and let them perform specific jobs.

---

### 4. Variables can track program state

This:

```java
boolean found = false;
```

isn't just storing random information.

It's helping the program remember:

> “Have I found what I'm looking for yet?”

That idea becomes extremely powerful later.

---

### 5. Errors and normal outcomes are different

```text
Student not found
```

might simply be a normal result.

Not every unusual outcome needs:

```java
throws Exception
```

Java does not need to call emergency services every time a search returns nothing. 😭🚑

---

# 🛠️ Mini Project / Exercise

## 🔎 Student Search CLI

### Goal

Search through a predefined list of students and display whether a requested student exists.

### Current Features

* 📦 Stores students in an array
* 🔁 Loops through each student
* 🔎 Compares names
* ✅ Tracks whether a student was found
* 🛑 Stops searching once a match is found
* ❌ Displays a message when no match exists

---

# 🚀 Future Upgrade Ideas

As I learn more Java, I could eventually upgrade this tiny program with:

```text
⌨️ User input
➕ Add students
🗑️ Remove students
🔎 Search students
🔡 Case-insensitive searching
📋 Display all students
🎓 Student objects
🗄️ Database storage
🌐 REST API
```

Today:

```text
String[] students
```

Future me:

```text
GET /api/students/{id}
```

We move. 😭☕

---

# 📊 Day 01 Progress

```text
DAY 01
━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Java Setup              ✅
Hello World             ✅
main()                   ✅
Methods                  ✅ Intro
Arrays                   ✅ Intro
Loops                    ✅ Intro
Conditionals             ✅ Intro
Booleans                 ✅ Intro
Exception Concepts       ✅ Sneak Peek
Logic Practice           ✅

STATUS: COMPLETE 🔥
```

---

# 🧭 Next Stop

## Day 02: Variables & Data Types 💰

Next I’ll properly explore how Java stores different kinds of information.

Coming up:

```text
int
double
boolean
char
String
variables
constants
type rules
basic calculations
```

And then we build:

## 💸 Finance Snapshot Tool

Because apparently we're going from:

```java
System.out.println("Hello, World!");
```

to making Java calculate my finances.

No pressure. 😂☕

---

# 🔥 Day 01 Motto

> **“Don’t memorize the code. Understand the decision the code is making.”**

```text
UNDERSTAND 🧠
    ↓
CODE ☕
    ↓
BREAK 💥
    ↓
DEBUG 🐛
    ↓
UNDERSTAND EVEN BETTER 🔥
```

**Day 01 complete. Java Warzone officially active. ⚔️☕**
