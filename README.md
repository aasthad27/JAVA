# JAVA
LEARN JAVA WITH ME

# BASIC STUFF 


## DATATYPES IN JAVA

1)PRIMITIVE:

byte=> [-128 to 127] -- 1 Byte

short=>2 Byte

int =>4 bytes

long =>8   ex: => 1234567800L

float=>4   ex: =>3.14F

double => 8


char => 2

boolean=>1


2)NON PRIMITIVE:

### String =>new keyword isn't compulsory 

funcions :

Concate =>s1+s2

charAt =>s.charAt(0)=>java is 0 based index

length=>s.length()

replace =>s.replace(oldchar , newChar) , no changes in the original string , * in java strings are immutable 

substring=> s.substring(0,3) => 0 will be included , 3 won't be included 

#### ARRAYS in java

syntax:


int[] marks = new int[3];

initialisation : 

variable by default initialise with 0/NULL

functions:

length =>s.length;

sort => arrays.sort(marks);  // import java.util.Arrays

##### 1D array

int[] marks ={97,98,95};

##### 2D array

int[][] finalMarks ={{97,98,95},{95,95,98}};


### CASTING IN JAVA

1)IMPLICIT (small --> into large )

double price =100.00;
double finalPrice =price+18;

output=>118.0 

int value is impicitly converted to double by java .

2)EXPLICIT (large-->into small )

int p=100;
int fp =p+18.88;

output=>throw error , we have to explicitly convert the double value to int

int fp =p+(int)18.88;

output=>118
 
#### CONSTANT :

final float PI =3.14F; // cannot reassign furthur 

####INPUT 

import java.util.Scanner

Scanner sc =new Scanner(System.in);

System.out.println("INPUT YOUR AGE ; ");

int age =sc.nextInt();

System.out.println(age);

### STRING INPUT 

String name =sc.next();  // takes token 

String name=sc.nextLine();  // takes whole sentence 


# IMP STUFF

JDK VS JRE VS JVM

{link} https://www.geeksforgeeks.org/differences-jdk-jre-jvm/ 

Features of java

https://www.javatpoint.com/features-of-java


Syntax of java

class class name
{
   public static void main(String args[])
     {
        System.out.println("LET"S LEARN JAVA ");
     }
     
}
   

MAIN FUNCTION => JVM ENTERS FROM MAIN FUNCTION ,hence it needs to be public

##### STATIC: AS members of class deals with the object hence we need to make it static in so that we don't have to create an object of the main function

Return type=>void 

Argument is passed as String


##### SAVING 

classname.java


##### COMPILATION

javac classname.java  =>dot class file is generated

##### EXECUTION

java classname


### CLASS AND OBJECT IN JAVA

class
```
class Student {
	int id; // data member (also instance variable)
	String name; // data member (also instance variable)

	public static void main(String args[])
	{
		Student s1 = new Student(); // creating an object of
									// Student
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}
```

Creation of object

classname objname = new classname();

            |        |      |
            |        |      |
     obj reference   Dynamic  Constructor
                     memory 
                     alloction



### CONSTRUCTORS IN JAVA

1)object initialisation 
2)every java class hve constructor-->default 
3)constructor automticlly called at the time of object creation
4) no return type


## Default Constructor 

```
import java.io.*;

class Geeks {
	Geeks() { super(); }
	public static void main(String[] args)
	{
		Geeks geek = new Geeks();
	}
}
```
The first line of a constructor is a call to super() or this(), (a call to a constructor of a super-class or an overloaded constructor), if you don’t type in the call to super in your constructor the compiler will provide you with a non-argument call to super at the first line of your code, the super constructor must be called to create an object

## Parameterised Constructor

```
import java.io.*;
class Geek {
	// data members of the class.
	String name;
	int id;
	Geek(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}
class GFG {
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		Geek geek1 = new Geek("avinash", 68);
		System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);
	}
}

```


## COPY COnstructor 

```
Class A
{
  int a;
  String b;
  A()
  {
    a=ref.a;
    b=ref.b;
  }
  A(A ref)
  {
    a=ref.a;
    b=ref.b;
   }
}
Class B
{
  public static void main(String[] args){
     A r=new A();
     A r2=new A(r);
  }
  
}
```

###### Main purpose of copy constructor is to copy the values of one object into another , by passing the reference of object

### Constructor Chaining In Java with Examples


Constructor chaining is the process of calling one constructor from another constructor with respect to current object. 

Constructor chaining can be done in two ways: 
 

Within same class: It can be done using this() keyword for constructors in the same class
From base class: by using super() keyword to call the constructor from the base class.
```
// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
class Temp
{
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	Temp()
	{
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	Temp(int x)
	{
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	Temp(int x, int y)
	{
		System.out.println(x * y);
	}

	public static void main(String args[])
	{
		// invokes default constructor first
		new Temp();
	}
}
```

#### What happens if we change the order of constructors?
Nothing, Constructor chaining can be achieved in any order









