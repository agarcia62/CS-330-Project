# CS-330-Project
Project by Alejandro Garcia for CS-330
## What does the program Do
The program is designed to simulate the security installation to installed in many offices and homes. The installation has a keypad and a controller this keypad has 10 keys labeled 0-9. The controller will unlock the lock when it finds the correct un-locking access code in the input string. The security engine will lock the lock when it finds the correct combination. The program will also read from a standard input without echoing the input characters. Any charcters that aren't 0-9 will be discarded discretley. The controller will understand a fixed code. The access code should compromise of the last 5 digits in your student ID. For unlock the last digit will be a 1 for lock the last digit will be a 4.
## How to Build Run the Executable
First, the Keypad class was created. This created the consturctors for the GUI class to take in the values of the variables used. After the Keypad was finished, the GUI class was created. This is the execuatble Java file that can run when turned into the .jar file. In the GUI class was the public static void method that executes the code when you run in the IDE and the .jar file through the terminal. The GUI class creates a Guided-User-Interface that consists of a JFrame (the window itself), a JLabel that tells the user if the mechanism is unlocked or not, and a JTextField that the user can type a string of numbers and characteres into.

To turn the java files into a runnable .jar file, you need the .java files of your project and a manifest.txt file that specifies which .java file is the "Main" class. The manifeset.txt file should be formatted as:

Main-Class: nameOfMainClass

with a return at the end of the line. (The manifest.txt file is in the git repository. No need to make or edit the file.)

Therefore, first clone the git repo to a directory of your chooing and navigate into the cloned git repo by typing:

cd CS330_Final_Project (The name of the folder from the cloned git.)

Once in the folder in the terminal/command prompt, turn the .java files into .class files by typing:

javac *.java

This will turn all .java files into .class files, which you will use next. To then turn the those files into a runnable, executable .jar file, type into the terminal/command prompt:

jar cfm FinalProject.jar manifest.txt *.class
## How To Run The Executable In The Github Repository
In the GitHub repository there is a jar file named RunnableGUI.jar. The first step is to clone the git repository to a directory of your choice. Next, navigate to that directory where you cloned the git repository and find the folder created. Then there should be 2 java files the READMe.md and the RunnableTest.jar in the terminal prompt. java-jar CS-330FinalProject.
This should run the interface,the JFrame should appear. To test the program,delete the text "Type here", then begin testing. 
## How to Generate Unit Test Coverage
The first step will be creating the JUnit test class this will be found in the package explorer and select new JUnit test case. Click the next button, check the box and click finish. Run the test if a green bar appears then the code passed if a red bar appears then the test failed. You can run coverage analysis against your program by clicking the button to the right of run. Additional tests can be created until 100% of the code is covered. Testing for exceptions can also be done if need be. The test cases need to be done well in order to catch errors just because the code is covered doesnt' mean the test are effective. 
## The Platform Its Been Tested On
The platform the program has been testeed on is Eclipse. 
