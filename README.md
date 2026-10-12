# Customized Packer-Unpacker Using Java

**Author:** Bhavesh Narayan Gaikwad

## 📌 Project Overview

The **Customized Packer-Unpacker** is a Java-based file management application that combines multiple files from a directory into a single packed file and later extracts the original files from that packed file.

The project demonstrates file handling, byte-stream operations, directory traversal, and basic data organization using Java.

## ✨ Features

### 1. Packer
- Accepts a directory name from the user.
- Checks whether the specified directory exists.
- Reads files present in the directory.
- Stores each file's name and size in a header.
- Combines file headers and file contents into a single packed file.
- Displays file information and the total number of files processed.

### 2. Unpacker
- Accepts the name of a packed file.
- Reads file headers from the packed file.
- Extracts the original file names and sizes.
- Recreates the extracted files and restores their contents.
- Displays the total number of files unpacked.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Concepts:** Object-Oriented Programming (OOP)
- **File Handling:** `File`, `FileInputStream`, `FileOutputStream`
- **Collections and Utilities:** Java utility package
- **Byte Stream Operations:** Reading and writing binary data
- **Exception Handling:** `try-catch`

## 📂 Project Structure

```text
Customized-Packer-Unpacker/
│
├── Packer.java
├── Unpacker.java
└── README.md
```

*Note: The filenames above are suggested names. They can be changed according to your actual source files.*

## ▶️ How to Run

### Step 1: Install Java

Install the Java Development Kit (JDK) and verify the installation:

```bash
java -version
javac -version
```

### Step 2: Compile the Packer

Save the packing code in `Packer.java` and compile it:

```bash
javac Packer.java
```

### Step 3: Run the Packer

```bash
java program467
```

Enter the directory path and the name of the packed file when prompted.

### Step 4: Compile the Unpacker

Save the unpacking code in `Unpacker.java` and compile it:

```bash
javac Unpacker.java
```

### Step 5: Run the Unpacker

```bash
java program476
```

Enter the path or name of the packed file when prompted.

**Important:** The supplied code uses package-private classes and has separate main classes named `program467` and `program476`. If you use the filenames above, ensure each public class and source filename follows Java's naming rules.

## 📚 Learning Objectives

- Understand Java file handling.
- Learn how to read and write data using byte streams.
- Practice directory traversal and file operations.
- Understand how file metadata can be stored alongside file contents.
- Implement a basic packing and unpacking mechanism.
- Improve understanding of exception handling and OOP.

## 🚀 Future Enhancements

- Add support for nested directories.
- Improve error handling and resource management.
- Add file integrity checks.
- Support large files more efficiently.
- Prevent accidental overwriting of existing files.
- Add a graphical user interface.

## ⚠️ Limitations

- The current implementation is designed primarily for files in a directory, not recursive directory structures.
- The header format uses file names and sizes separated by spaces, which can cause problems with names containing spaces.
- The supplied code should be corrected and tested before being used with important files.

## 👨‍💻 Author

**Bhavesh Narayan Gaikwad**

A Java project developed to practice file handling, byte streams, and object-oriented programming.
