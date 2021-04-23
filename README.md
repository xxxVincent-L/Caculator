# Caculator

## It's the Lab for the JAVA Programming Class in SCU, I extend it from an existing repo in Github the one which I can't point out right now

- **Abstract:**

This project is based on java swing a relatively large number of functions of the computer.

Not only can complete simple addition, subtraction, multiplication and division, but also includes a series of functions such as taking the modulus, finding the square root, calculating the multiplicity of squares, etc.

And completed the construction of different color patterns and background music and keystroke music.

- **class explanation**:

The overall division into 5 categories

- Parameter: Used to store parameters
- Button: Used to handle two special buttons
- Action: the main class for implementing the functions of the calculator
- Calculator: the main class that calls the methods of the above classes
- Music: the background music and the control of the calculator key tone
- **Difficult Points (for that time)**:
    - How to represent the process of calculation on the JTextField we created
    - How to construct the framework of the project: i.e. how to design the classes, and how to design the relative positions of the buttons and text boxes
    - How to add the music part, not only in the background, but also in the keys
- **Extension**:
    - In order to achieve the determination and setting of information inside JTextField, I learned the regular expressions in java
    - After learning about databases, I was planning to deploy a mysql database to my calculator (not yet completed)
    - In order to achieve the effect of background music and keystroke music, I learned how to call in the Applet package, so as to use the music effects
- **Outcome**:
![avatar](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6bda1700-766b-4975-a878-be611134845a/Untitled.png)


- **Shortcoming & Future**：

> To be honest, after doing it, I felt that this calculator was not as relatively complex as my classmates' projects.
I could only add my own learning to the logic of the calculator itself, such as regular expressions and the music representation in the Applet package.
In the process of implementing the music, I was unable to control the size of the music, so I had the problem that the background music was too loud, while the sound of the numeric keys was too small.
And the button sound effects are only partially implemented, because there are few audio files of related sound effects on the web.

> Plus database
for storing data for each calculation
plus Web
For simultaneous calculations between different hosts
