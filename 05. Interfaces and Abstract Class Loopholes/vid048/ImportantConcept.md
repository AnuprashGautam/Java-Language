# Anyway we can not create the object for the abstract class and interface. Abstract class can contain constructor but interface can not contain constructor. Why?

- Constructor is used to initialise the instance **variables**. 
- In the case of abstract class, there exits instance variables so it is used in abstract classes.
- While in the case of interfaces all the variables are by default **public** , **static** and **final** i.e. no instance variables, so their is no constructor in interfaces.