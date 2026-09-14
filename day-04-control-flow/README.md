# 💴 Day 04 | Control Flow + Credit Eligibility Checker 🧾

> **Java Warzone — Day 04**
>
> Today I learned how to make my Java programs **make decisions**. 🧠⚡
>
> Instead of Java simply calculating and printing things, I started controlling **which path my program should take** depending on the information provided by the user.

---

## 🎯 Day 04 Mission

Today's focus was **Control Flow and Decision Making**.

I learned how to use:

* `if`
* `else if`
* `else`
* `&&`
* Comparison operators
* Boolean logic
* Multiple conditions
* Calculated values inside conditions
* `while (true)`
* `break`
* User input

To put everything together, I built a **Credit Eligibility Checker**.

The program collects information from a user and determines whether their loan application meets the requirements.

---

# 🧠 What I Learned

## 🚦 1. Control Flow

Normally, Java executes instructions from top to bottom.

Control flow allows me to change that path.

For example:

```java
if (condition) {
    // Do something
} else {
    // Do something else
}
```

This allows my program to ask questions and make decisions based on the answers.

I can think of control flow as:

```text
             START
                ↓
          Check condition
                ↓
        ┌───────┴───────┐
        ↓               ↓
      TRUE            FALSE
        ↓               ↓
    Do this         Do that
```

---

# 🔎 2. `if`

The `if` statement allows Java to execute code only when a condition is `true`.

Example from my project:

```java
if(age >= 18 && creditScore >= 650 && loanPercentage <= 30) {
```

This asks Java to check several conditions before approving the loan.

---

# 🔀 3. `else if`

`else if` allows me to check another condition if the original `if` condition was false.

My program uses:

```java
else if (age >= 18 && creditScore >= 650 && loanAmount >= 30)
```

This gives my program another possible decision path.

The general structure is:

```java
if (condition1) {

} else if (condition2) {

} else {

}
```

Java checks these conditions from **top to bottom**.

---

# 🛑 4. `else`

The `else` block acts as the fallback.

If none of my previous conditions are `true`, Java executes the `else`.

In my project:

```java
else {
    System.out.print("🆘 Loan denied, your did not meet the requirements this time");
}
```

This means:

> If the applicant doesn't meet the conditions checked above, deny the application.

---

# 🔗 5. The `&&` Operator

Today I used:

```java
&&
```

which means **AND**.

For example:

```java
age >= 18 && creditScore >= 650 && loanPercentage <= 30
```

means **ALL three conditions must be true**.

The program checks:

```text
Is age >= 18?
        AND
Is credit score >= 650?
        AND
Is loan percentage <= 30?
```

Only if all three are `true` will the first `if` block execute.

---

# 🧮 6. Calculating a Percentage

One of the important calculations in my project was:

```java
double loanPercentage = loanAmount / totalSalary * 100;
```

This calculates what percentage of the user's salary the requested loan amount represents.

For example:

```text
Salary = R20,000
Loan = R5,000
```

The calculation becomes:

```text
5,000 / 20,000 × 100
```

which gives:

```text
25%
```

The value `25` is stored inside:

```java
loanPercentage
```

I can then use that calculated value in my control flow:

```java
loanPercentage <= 30
```

Meaning:

> Is the requested loan amount 30% or less of the user's salary?

---

# 🧠 7. Using Calculated Values in Conditions

This was an important step in my Java journey.

I didn't just use conditions with values directly.

I calculated a value first:

```java
double loanPercentage = loanAmount / totalSalary * 100;
```

Then used that result to make a decision:

```java
if (loanPercentage <= 30)
```

This creates a simple programming pattern:

```text
USER INPUT
    ↓
CALCULATION
    ↓
RESULT
    ↓
CONDITION
    ↓
DECISION
```

My program is therefore doing:

```text
Salary + Loan Amount
        ↓
Calculate loan percentage
        ↓
Check percentage
        ↓
Approve / Deny
```

---

# 🧾 8. User Input

I used `Scanner` to collect information from the user.

```java
Scanner input = new Scanner(System.in);
```

The program collects:

```text
Name
Age
Salary
Credit Score
Loan Amount
```

Different Scanner methods are used depending on the data type.

| Method         | Used For        |
| -------------- | --------------- |
| `nextLine()`   | Text/String     |
| `nextInt()`    | Whole numbers   |
| `nextDouble()` | Decimal numbers |

For example:

```java
String name = input.nextLine();

int age = input.nextInt();

double totalSalary = input.nextDouble();
```

---

# 🔄 9. `while (true)`

I used:

```java
while (true) {
```

to keep the calculator running.

This creates a loop that continues until I explicitly tell Java to stop it.

The flow is:

```text
Start
  ↓
Ask for information
  ↓
Check eligibility
  ↓
Show result
  ↓
Ask if user wants to check again
  ↓
YES ─────────→ Start again
  ↓
NO
  ↓
STOP
```

---

# 🛑 10. `break`

I used:

```java
break;
```

to exit the `while` loop.

For example:

```java
if(answer.equals("no")) {
    System.out.println("Thank you...");
    break;
}
```

If the user enters:

```text
no
```

Java reaches `break` and leaves the loop.

---

# 🧹 11. Clearing the Scanner Input

After collecting numbers with:

```java
input.nextInt();
input.nextDouble();
```

I used:

```java
input.nextLine();
```

before asking for another String.

This clears the leftover newline from the previous input so that:

```java
String answer = input.nextLine();
```

can correctly receive the user's response.

---

# 🧼 12. `.trim()`

I used:

```java
.trim()
```

when processing the user's answer.

```java
String answer = input.nextLine().trim().toLowerCase();
```

`trim()` removes unnecessary spaces around the user's input.

For example:

```text
" yes "
```

becomes:

```text
"yes"
```

---

# 🔡 13. `.toLowerCase()`

I also used:

```java
.toLowerCase()
```

This converts the user's response to lowercase.

For example:

```text
YES
Yes
YeS
yes
```

can all become:

```text
yes
```

This makes checking the response easier.

---

# 🆚 14. `.equals()`

To check whether the user entered `"no"`, I used:

```java
answer.equals("no")
```

This asks:

> Does the String stored inside `answer` equal `"no"`?

This is the appropriate way to compare String values in this situation.

---

# 🏦 Credit Eligibility Logic

My program uses these requirements for automatic approval:

```text
Age >= 18
AND
Credit Score >= 650
AND
Loan Percentage <= 30%
```

In Java:

```java
if(age >= 18 && creditScore >= 650 && loanPercentage <= 30)
```

If all three conditions are true:

```text
✅ Loan Approved
```

---

# 🚫 Loan Denial Logic

If the first condition isn't satisfied, the program checks another condition using:

```java
else if
```

Then, if none of the conditions are satisfied, the program reaches:

```java
else
```

and denies the application.

This gives my program multiple decision paths:

```text
                    APPLICATION
                         ↓
                 Check requirements
                         ↓
              ┌──────────┴──────────┐
              ↓                     ↓
          Requirements          Requirements
             pass                  fail
              ↓                     ↓
        APPROVED                 DENIED
                                    ↓
                              Show reason
```

---

# 🧠 Control Flow Pattern I Learned

The most important pattern from today was:

```java
if (condition) {

} else if (anotherCondition) {

} else {

}
```

I can use this pattern to build programs that make decisions.

Examples include:

* Loan eligibility
* Student grading systems
* Login systems
* Insurance eligibility
* Employee qualification systems
* Discount systems
* Security access systems
* Transaction validation

This is where Java starts becoming much more than just a calculator. 💻⚡

---

# 🛠️ Project Structure

```text
Day-04/
│
├── README.md
│
└── CreditChecker.java
```

---

# 🧪 Example

### User Input

```text
What is your name: Buhle
What is your age: 25
How much is your salary after deductions (R): 20000
What is your credit score: 700
Enter the loan amount you require (R): 5000
```

The program calculates:

```text
5,000 / 20,000 × 100
```

Result:

```text
25%
```

Then Java checks:

```text
Age >= 18?
YES ✅

Credit Score >= 650?
YES ✅

Loan Percentage <= 30?
YES ✅
```

All conditions are true.

Result:

```text
✅ Congratulations Buhle your loan has been approved!
```

---

# 🧠 Day 04 Takeaways

Today I learned that a program doesn't have to blindly execute every instruction.

I can give Java rules and let it decide what happens.

```text
INPUT
  ↓
PROCESS
  ↓
CONDITIONS
  ↓
DECISION
  ↓
OUTPUT
```

The biggest concept I learned today was **combining multiple conditions with `&&`**.

Instead of checking one thing:

```java
if (age >= 18)
```

I can check several requirements:

```java
if(age >= 18 && creditScore >= 650 && loanPercentage <= 30)
```

That allows me to model real-world rules inside my programs.

---

# ⚔️ Day 04 Status

```text
[████████████████████] 100%

CONTROL FLOW: CLEARED ✅
IF: CLEARED ✅
ELSE IF: CLEARED ✅
ELSE: CLEARED ✅
LOGICAL OPERATORS: CLEARED ✅
MULTIPLE CONDITIONS: CLEARED ✅
BOOLEAN DECISIONS: CLEARED ✅
LOOPS: CLEARED ✅
USER INPUT: CLEARED ✅
CREDIT ELIGIBILITY ENGINE: BUILT ✅
```

## 🏆 Project Completed

**Credit Eligibility Checker 💴🧾**

---

# 🚀 Next Mission

### Day 05 | Loops + Login Attempt System 🔐

Next, I'll go deeper into repetition and learn how programs can keep performing an action until a particular condition is met.

I'll work with:

* `while`
* `for`
* Loop conditions
* Counters
* `break`
* Repeated user input
* Attempt tracking

> **Day 04 complete. The code can now make decisions. Next, I'm teaching it how to repeat itself. ⚔️💻**
