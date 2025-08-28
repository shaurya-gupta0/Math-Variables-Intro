class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!

    //ANSWER: 



    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): 
    //double:
    //boolean:

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES

    int x = 0;
    boolean amI_A_Student = true;
    boolean amI_A_Teacher = false;
    double y = 67.41;

    System.out.println("Testing");
    String lalala = "Hello this is a string";
    System.out.println(lalala);




    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %
    //Try doing some math operations with numbers. How can we check to see if the math worked?

    int a = 2 + 1; // Simple addition, answer 3
    int b = 2 - 1; // Simple subtracton, answer 1
    int c = 2 * 2; // Simple multiplication, answer 4
    int d = 3 / 2; // Shows how many times 2 fits into 3 FULLY, = 1
    int e = 4 / 2; // Fully works out, shows how many times 2 fits into 3 FULLY, =2
    int f = 5 % 2; // shows how much is remaining (remainder) after 2 fits into 5 as many times as possible, = 1
    int g = 6 % 2; // Fully works out, shows how much is remaining (remainder) after 2 fits into 6 as many times as possible, = 0

    System.out.println("Simple addition 2+1:" + 2+1);
    System.out.println("Simple substracton 2-1:" + (2-1));
    System.out.println("Simple multiplication 2*2:" + 2*2);
    System.out.println("Shows how many times 2 fits into 3 FULLY:" + 3/2);
    System.out.println("Shows how much is remaining (remainder) after 2 fits into 5 as many times as possible:" + 5%2);
    System.out.println("Fully works out, shows how much is remaining (remainder) after 2 fits into 6 as many times as possible:" + 6%2);

    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both
    System.out.println("Odd integers from 1 to 100, inclusive of both");
    for(int i=1; i<=100; i = i+2){
      System.out.print(i + ", ");

    }
    System.out.println(".");
    System.out.println("Odd numbers done.");

    //All multiples of 3 from 1 to 100
    System.out.println("All multiples of 3 from 1 to 100");
    for(int i=3; i<=100; i = i+2){
      System.out.print(i*3 + ", ");

    }
    System.out.println(".");
    System.out.println("Multiples of 3 done.");


    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
    System.out.println("All the numbers ending in 0 less than 1000");
    for(int i=99; i>=1; i = i-1){
      System.out.print(i*10 + ", ");

    }
    System.out.println(".");
    System.out.println("0's numbers done.");

  }
}
