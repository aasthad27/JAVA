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











