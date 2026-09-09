# ⚡ Day 03 | Java Operators + Smart Utility Bill Calculator 🧾

> **Java Warzone — Day 03**
>
> Today we moved from simply storing data to actually **using data to make decisions and perform calculations.** 🧠⚡

---

## 🎯 Day 03 Mission

Today's focus was **Java Operators**.

I learned how Java uses operators to:

* Perform mathematical calculations
* Compare values
* Make logical decisions
* Update variables
* Build conditions
* Control program flow

To put everything together, I built a **Utility Bill Calculator** that calculates electricity costs differently depending on whether the user is a **Domestic** or **Commercial** customer.

---

# 🧠 What I Learned

## 1. Arithmetic Operators

Arithmetic operators allow Java to perform mathematical calculations.

| Operator | Meaning        | Example  |
| -------- | -------------- | -------- |
| `+`      | Addition       | `10 + 5` |
| `-`      | Subtraction    | `10 - 5` |
| `*`      | Multiplication | `10 * 5` |
| `/`      | Division       | `10 / 5` |
| `%`      | Remainder      | `10 % 3` |

In my utility calculator, I used:

```java
units * 3.0
```

to calculate the cost of electricity.

I also used subtraction to determine how many units remained after a previous pricing tier.

---

# 🔎 2. Comparison Operators

Comparison operators compare values and produce a `true` or `false` result.

```java
==
!=
>
<
>=
<=
```

For example:

```java
if (type == 1)
```

means:

> "Is `type` equal to `1`?"

And:

```java
if (units <= 100)
```

means:

> "Are the units less than or equal to 100?"

These comparisons allow the program to make decisions.

---

# 🧮 3. Tiered Calculations

One of the biggest things I learned today was how to calculate **tiered pricing**.

The Domestic pricing structure is:

| Units     |   Price |
| --------- | ------: |
| First 100 | R3/unit |
| Next 100  | R4/unit |
| Above 200 | R5/unit |

For example, if a customer uses **150 units**:

```text
First 100 units
100 × R3 = R300

Remaining units
150 - 100 = 50

Remaining cost
50 × R4 = R200

Total
R300 + R200 = R500
```

This is represented in Java as:

```java
totalBill = (100 * 3.0) + ((units - 100) * 4.0);
```

The important part is:

```java
(units - 100)
```

This finds how many units are left **after the first 100 units have already been calculated**.

---

# 🪣 Understanding the Pricing Tiers

I can think of the pricing system as three buckets:

```text
DOMESTIC

Bucket 1
First 100 units
R3 each

Bucket 2
Next 100 units
R4 each

Bucket 3
Anything above 200
R5 each
```

For 250 units:

```text
100 × R3 = R300
100 × R4 = R400
50 × R5  = R250

TOTAL = R950
```

The Java calculation:

```java
totalBill = (100 * 3.0)
          + (100 * 4.0)
          + ((units - 200) * 5.0);
```

calculates each tier separately and then adds them together.

---

# 🏡 4. Domestic vs Commercial Logic

The calculator supports two connection types.

### Domestic

```text
First 100 → R3/unit
Next 100  → R4/unit
Above 200 → R5/unit
```

### Commercial

```text
First 100 → R5/unit
Next 100  → R6/unit
Above 200 → R8/unit
```

The program first determines the connection type:

```java
if (type == 1) {
    category = "DOMESTIC";
}
```

or:

```java
else if (type == 2) {
    category = "Commercial";
}
```

Then it calculates the bill according to that category's pricing rules.

---

# 🔁 5. `while (true)`

I used:

```java
while (true) {
```

to continuously run the calculator.

This allows the user to calculate another bill without restarting the program.

The loop only stops when I use:

```java
break;
```

For example:

```java
if (answer.equals("no")) {
    break;
}
```

This means:

> If the user says "no", leave the loop.

---

# ⌨️ 6. Scanner Input

I used the `Scanner` class to receive information from the user.

```java
import java.util.Scanner;
```

Then created a Scanner object:

```java
Scanner input = new Scanner(System.in);
```

`System.in` means the program receives input from the keyboard.

I used:

```java
input.nextDouble();
```

to read decimal numbers.

And:

```java
input.nextInt();
```

to read whole numbers.

---

# 🧹 7. `nextLine()`

After using:

```java
input.nextInt();
```

I used:

```java
input.nextLine();
```

This clears the leftover newline from the user's previous input.

This allows:

```java
String answer = input.nextLine();
```

to correctly read the user's next response.

---

# 🧼 8. `.trim()`

I used:

```java
.trim()
```

to remove unnecessary spaces from the beginning and end of the user's response.

For example:

```text
" yes "
```

becomes:

```text
"yes"
```

---

# 🔡 9. `.toLowerCase()`

I used:

```java
.toLowerCase()
```

to convert the user's response to lowercase.

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

# 🧠 10. `.equals()`

I used:

```java
answer.equals("no")
```

to compare Strings.

This means:

> "Does the value stored inside `answer` equal `"no"`?"

This is important because Strings should generally be compared using `.equals()` rather than `==`.

---

# 💰 11. `printf()` and Decimal Formatting

I used:

```java
System.out.printf(
    "======== 💡Total Amount Due 💵 : R%.2f\n",
    totalBill
);
```

The important part is:

```text
%.2f
```

It tells Java to display the decimal number with **2 decimal places**.

For example:

```text
500
```

can be displayed as:

```text
500.00
```

This is useful for displaying money.

---

# 🚨 12. Handling Invalid Input

The calculator also checks whether the user entered a valid connection type.

```java
else {
    System.out.println("\n ------ ⛔️ INVALID CONNECTION TYPE ⛔️ -----");
    input.close();
    return;
}
```

If the user enters something other than:

```text
1
```

or:

```text
2
```

the program displays an error message.

Then:

```java
input.close();
```

closes the Scanner.

And:

```java
return;
```

immediately exits the `main()` method.

---

# 🧹 13. Closing the Scanner

At the end of the program:

```java
input.close();
```

closes the Scanner because I no longer need to receive input.

This is good resource-management practice.

---

# 🛠️ Project Structure

```text
Day-03/
│
├── README.md
│
└── UtilityBill.java
```

---

# 💻 What My Program Does

The program:

1. Starts the Utility Bill Calculator
2. Asks for electricity consumption
3. Asks whether the connection is Domestic or Commercial
4. Calculates the bill using tiered pricing
5. Displays a formatted bill summary
6. Asks whether the user wants another calculation
7. Repeats if they choose `yes`
8. Stops if they choose `no`

---

# 🧪 Example

### Input

```text
💡 Enter units consumed (kWh): 150

🕹️ Enter connection type
1 for Domestic
2 for Commercial

Choice: 1
```

### Calculation

```text
First 100 units:
100 × R3 = R300

Remaining:
150 - 100 = 50

Remaining cost:
50 × R4 = R200

Total:
R300 + R200 = R500
```

### Output

```text
----- 🧾 Bill Summary -----

🏡 Connection Type: DOMESTIC
🧮 Units Consumed: 150.0 kWh

======== 💡 Total Amount Due 💵 : R500.00
```

---

# 🧠 Key Takeaways

Today's biggest lesson was understanding that operators aren't just mathematical symbols.

They allow a program to **think and make decisions**.

```text
Arithmetic
    ↓
Calculate values

Comparison
    ↓
Compare values

Conditions
    ↓
Make decisions

Loops
    ↓
Repeat actions

Together
    ↓
Build actual programs
```

The biggest concept I learned today was **tiered pricing**.

Instead of simply calculating:

```java
units * price
```

I learned how to break a calculation into different sections:

```text
First tier
+
Second tier
+
Third tier
=
Total
```

That was a major step from basic Java syntax toward writing actual business logic. 🚀

---

# ⚔️ Day 03 Status

```text
[████████████████████] 100%

OPERATORS: CLEARED ✅
CONDITIONAL LOGIC: CLEARED ✅
USER INPUT: CLEARED ✅
TIERED CALCULATIONS: CLEARED ✅
LOOPS: CLEARED ✅
STRING HANDLING: CLEARED ✅
UTILITY BILL CALCULATOR: BUILT ✅
```

### 🏆 Project Completed

**Utility Bill Calculator 🧾💡**

---

# 🚀 What's Next?

**Day 04: Decision Making + Smart Eligibility Engine**

The next mission moves deeper into:

* `if`
* `else if`
* `else`
* Complex conditions
* Logical operators
* Combining multiple rules
* Building decision-making systems

> **One day. One concept. One project. Keep building. ⚔️💻**
