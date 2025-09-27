# 📓 CLI Notes Application (Java)

This is my **4th task** during my internship at **Elevate Labs**.  
A **command-line interface (CLI) based Notes Management System** built in **Java** using **OOP concepts** and **File Handling mechanisms**.  
This project allows users to create, manage, and organize their notes and folders directly from the terminal.  

---

## 🚀 Features

### 📂 Folder Management
- **Create Folder** → Make a new folder for storing notes.  
- **Enter Folder** → Navigate into an existing folder.  
- **Exit Folder** → Move back to the parent folder.  
- **Rename Folder** → Change the name of a folder.  
- **Delete Folder** → Remove a folder (and its contents).  
- **Show Current Path** → Display the working directory.  
- **Show All Files and Folders** → List all items in the current directory.  

### 📄 File Management
- **Create File** → Make a new note file.  
- **Read File** → Open and view the content of a note.  
- **Update File** → Edit an existing note (append or rewrite).  
- **Remove File** → Delete a note file.  
- **Rename File** → Rename an existing file.  

### 🔚 Exit
- **Exit Application** → Quit the program safely.  

---

## 🏗 Tech Stack
- **Language**: Java  
- **Core Concepts**:  
  - Object-Oriented Programming (OOP)  
  - File Handling (`File`, `FileWriter`, `BufferedWriter`, `Scanner`, etc.)  
- **Application Type**: Console / CLI Application  

---

## 📂 Project Structure
- Day4/
  - Main.java ( main handler of the program )
  - NotesManager.java ( All the operation are held here. This in encapsulation of program)
  - README.md ( Tell the project sturcture of the program)
  - .gitignore (for ignoring the file that are not useful)
    
---
## Example 
```
--------- Welcome to note make application ---------


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
1
Enter folder name : Java Important notes
Folder created successfully 


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path       
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
2
Enter folder name : Java Important notes
New path D:\Personal space\Elevate labs Internship\Day4\All Notes\Java Important notes


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
8
Enter file name with format (like :- myText.txt) : First.txt
Start typing your notes (type 'exit' to stop):
Why Use Java?
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
It is one of the most popular programming languages in the world
It has a large demand in the current job market
It is easy to learn and simple to use
It is open-source and free
It is secure, fast and powerful
It has huge community support (tens of millions of developers)
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa
                                                                                    
exit        
File created : D:\Personal space\Elevate labs Internship\Day4\All Notes\Java Important notes\First.txt


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
9
Enter the file name : First.txt
Why Use Java?
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
It is one of the most popular programming languages in the world
It has a large demand in the current job market
It is easy to learn and simple to use
It is open-source and free
It is secure, fast and powerful
It has huge community support (tens of millions of developers)
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa



1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
6
Current location : D:\Personal space\Elevate labs Internship\Day4\All Notes\Java Important notes


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
10
Enter the file name : First.txt

1. Want to append ?
2. Want to rewrite ?
Enter choice(1-2) :
1
Start typing your notes (type 'exit' to stop):
Java Quickstart
In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called Main.java, which can be done in any text editor (like Notepad).

exit


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
9
Enter the file name : First.txt
Why Use Java?
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
It is one of the most popular programming languages in the world
It has a large demand in the current job market
It is easy to learn and simple to use
It is open-source and free
It is secure, fast and powerful
It has huge community support (tens of millions of developers)
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa


Java Quickstart
In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called Main.java, which can be done in any text editor (like Notepad).



1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
12
Enter the file name : First.txt
Enter new file name : Important.txt
File renamed to: D:\Personal space\Elevate labs Internship\Day4\All Notes\Java Important notes\Important.txt


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
3
New path : D:\Personal space\Elevate labs Internship\Day4\All Notes


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
New path : D:\Personal space\Elevate labs Internship\Day4\All Notes


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
4
Enter folder name : Java Important notes
Enter new folder nameJava Notes
Renamed successfully


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
5
Enter folder name : Java Notes
Java Notes is deleted successfully


1. Make folder
2. Enter folder
3. Exit folder
4. Rename folder
5. Delete Folder
6. Show current path
7. Show all files & folders
8. Create file
9. Read file
10. Edit file
11. Remove file
12. Rename file
13. Exit
13
PS D:\Personal space\Elevate labs Internship\Day4> 
```


