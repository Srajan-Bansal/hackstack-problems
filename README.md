# Coding Problems Collection

A comprehensive collection of algorithmic coding problems with test cases and boilerplate code in multiple programming languages.

## 📁 Repository Structure

Each problem is organized in its own directory with the following structure:

```
problem-name/
├── Problem.md          # Problem statement and examples
├── Structure.md        # Input/output specifications
├── boilerplate/        # Basic function templates
│   ├── function.java
│   └── function.js
├── boilerplate-full/   # Complete function implementations
│   ├── function.java
│   └── function.js
└── tests/             # Test cases
    ├── inputs/        # Input files (0.txt to 99.txt)
    └── outputs/       # Expected output files (0.txt to 99.txt)
```

## 🧩 Available Problems

| Problem | Description | Difficulty |
|---------|-------------|------------|
| [anagram-check](./anagram-check/) | Check if two strings are anagrams | Easy |
| [count-vowels](./count-vowels/) | Count vowels in a string | Easy |
| [factorial](./factorial/) | Calculate factorial of a number | Easy |
| [fibonacci](./fibonacci/) | Generate Fibonacci sequence | Easy |
| [find-median](./find-median/) | Find median of an array | Medium |
| [gcd-of-two-numbers](./gcd-of-two-numbers/) | Greatest Common Divisor | Easy |
| [max-element](./max-element/) | Find maximum element in array | Easy |
| [palindrome-check](./palindrome-check/) | Check if string is palindrome | Easy |
| [reverse-string](./reverse-string/) | Reverse a string | Easy |
| [sort-array](./sort-array/) | Sort an array | Easy |
| [two-sum](./two-sum/) | Find two numbers that sum to target | Easy |
| [valid-parentheses](./valid-parentheses/) | Check balanced parentheses | Easy |

## 🚀 Getting Started

1. **Choose a problem**: Browse the available problems and select one to solve
2. **Read the problem**: Check `Problem.md` for problem statement and examples
3. **Understand structure**: Review `Structure.md` for input/output specifications
4. **Start coding**: Use templates from `boilerplate/` directory
5. **Test your solution**: Validate against test cases in `tests/` directory

## 📝 Problem Format

### Problem.md
Contains the problem statement, examples, and constraints.

### Structure.md
Defines the function signature and data types following this format:
- Problem Name
- Function Name
- Input Structure (with field types)
- Output Structure (with return type)

### Test Cases
Each problem includes 100 test cases (0.txt to 99.txt) with corresponding expected outputs.

## 💻 Supported Languages

- **Java**: Complete with proper data types and collections
- **JavaScript**: Simplified type system with arrays and basic types

## 📋 Rules and Guidelines

Refer to [Rules.md](./Rules.md) for detailed guidelines on:
- Creating Structure.md files
- Supported data types for each language
- Input/output formatting conventions
- Function naming conventions

## 🎯 How to Use

1. Navigate to any problem directory
2. Read the problem statement in `Problem.md`
3. Check the function signature in `Structure.md`
4. Implement your solution using the boilerplate code
5. Test against the provided test cases
6. Compare with the full implementation if needed

## 🔧 Testing

Each problem comes with comprehensive test cases:
- **Input files**: Located in `tests/inputs/`
- **Output files**: Located in `tests/outputs/`
- **Coverage**: 100 test cases per problem

## 📚 Learning Path

**Beginners**: Start with basic problems like `reverse-string`, `factorial`, `palindrome-check`

**Intermediate**: Progress to `fibonacci`, `two-sum`, `find-median`

**Advanced**: Challenge yourself with more complex algorithms and data structures

---

Happy coding! 🎉