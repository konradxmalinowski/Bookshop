# 📚 Bookshop

A simple Java console application for managing a small library of books.

## ✨ Features

- Add new books by title and author  
- Remove books by title  
- Display all books in the library  
- Find a book by its title  
- Exit the application

##  How to Run

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/bookshop.git
   cd bookshop
   ```

2. **Compile the project:**
   ```sh
   javac -d out src/*.java
   ```

3. **Run the application:**
   ```sh
   java -cp out Main
   ```

## 🖥️ Example Usage

```
===== MENU =====
1. Add book
2. Remove book
3. Display all books
4. Find book by title
5. Exit
Choose option: 1
Enter title: The Hobbit
Enter author: J.R.R. Tolkien
✅ Book added successfully.
```

## 🗂️ Project Structure 

```
src/
  Book.java
  Library.java
  Main.java
```
