# Kotlin Beginner Tasks

## Material Content
- Char type  
- String type  
- String formatting  
- String parsing  
- String comparing  
- Regular expressions (Regex in Kotlin)  

---

## **Tasks**

### 1. Create a Kotlin application  
Create a simple console application using Kotlin (`main()` function).  
It should be runnable via `kotlinc` or an IDE (IntelliJ IDEA preferred).

---

### 2. Average Word Length  
Create a function that defines the **average word length** in an input string (returns `Double`).  
Punctuation characters should not affect the word length.  
Do **not** use regular expressions.  

**Example:**  
Input: `"Hello, world!"`  
Output: `5.0`

---

### 3. Double Characters  
Create a function that **doubles in the first string all characters belonging to the second string**.  

**Example:**
>first = "omg i love shrek" 
>second = "o kek" 
>result = "oomg i loovee shreekk"


---

### 4. Sum of Big Numbers  
Create a function that returns the **sum of two big numbers (larger than `Long`)**.  
Both numbers are strings, and the result must also be a string.  
Do not use `Long`, `BigInteger`, or any external math libraries.  

---

### 5. Reverse Words  
Create a function that **reverses all words** in a given string.  

**Example:**  
```kotlin
reverseWords("The greatest victory is that which requires no battle")
// → "battle no requires which that is victory greatest The"
```


---

### 6. Extract Phone Numbers from File

Create a function that reads a text file (`Text.txt`) containing text with phone numbers in formats like:  
- `+X (XXX) XXX-XX-XX`  
- `X XXX XXX-XX-XX`  
- `+XXX (XX) XXX-XXXX`

The function should:

1. Read the source text from `Text.txt`  
2. Extract all phone numbers matching the format  
3. Return a list of strings with those numbers  
4. Write them into another file `Numbers.txt`

**Example of `Text.txt` content:**

>Bla bla bla my number is +7 (921) 345-67-89 kekeke Blo Blo blo +375 (34) 444-7843 ololo

**Expected result:**

>"+7 (921) 345-67-89" "+375 (34) 444-7843"
