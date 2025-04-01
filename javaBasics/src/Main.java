import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //variables
        String name1= "diya";
        int age1= 20;
        String neighbour= "isha";
        String friend= neighbour;

        //PRIMITIVE DATA TYPES
        //Byte- 1 [-128 to 127]
        byte age=21;
        //short-2
        //int-4
        int phone= 1234567890;
        //long-8
        long phone2= 123456789999L; //L denotes a long type variable
        //float-4
        float pi= 3.14F; //F denotes float
        //double-8
        //char-2
        char letter= 'A';
        //boolean-1
        boolean isAdult = true;

        //NON PRIMITIVE DATA TYPES
        //String
        String name= "ankita";
        System.out.println(name.length());
        String roomie= new String("akanksha");
        System.out.println(roomie);

        //STRINGS
        //concatenate
        String name2= " Goyal";
        String name3= name1+ name2;
        System.out.println(name3);
        //charAt
        System.out.println(name2.charAt(2)); // java is 0 index base lang
        //length
        System.out.println(name2.length());
        //replace
      String name4= name2.replace('y', 'p'); //doesnot make changes in the original string but makes a different string
        System.out.println(name4); //java strings are immutable
        //substring
        System.out.println(name3.substring(2,6)); // end index is not included

        //ARRAYS
        //also a non primitive data type
        //declaration
        int[] marks= new int[3];
        marks[0]=132;
        marks[1]=22;
        marks[2]=323;
        //or
        int[] ages= {12,34,32};
        System.out.println(marks[0]); //in java if a variable is not given any value, it is initialised with null value or 0 but in c++ it was initialised with the garbage value
        boolean[] hello= new boolean[2];
        System.out.println(hello[1]); // in case of boolean its false
        //length
        System.out.println(marks.length); //here no parenthesis is needed with length as its a property in  arrays and not a function
        //sort
        Arrays.sort(marks);
        System.out.println(marks[0]);
        //2D arrays
        int[][] finalMarks = {{21,34,67},{65,34,65}};
        System.out.println(finalMarks[1][0]);

        //CASTING
        //implicit casting // is done automatically
        double price= 100.00;
        double finalPrice= price + 18;
        System.out.println(finalPrice);

        //explicit casting
        int p= 100;
//        int fp= p+ 18.0; //error
        int finalp= p+ (int)18.13; //after decimal all the numbers are removed without roundoff
        System.out.println(finalp);

        //CONSTANTS
        final float PI= 3.14F; //constants are usually stored in capital lettered variables

        //OPERATORS
        //arithmetic operators
        int a= 1;
        int b=5;
        int c=a+b;
        int d= a-b;
        int e= a*b;
        int f=b/a;
        int g= b%a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //assignment operators like =
        //unary operators
        int n=1;
        System.out.println(n++); //1
        System.out.println(n); //2
        System.out.println(++n); //3
        System.out.println(n); //3

        //MATH CLASS
        //max
        System.out.println(Math.max(4,8));
        //min
        System.out.println(Math.min(4,8));
        //random
        System.out.println((int)(Math.random()*100)); //gives a random value between 0.0 to 1.0

        //INPUT
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int ageofChild  = sc.nextInt(); //used to input int
//        System.out.println(ageofChild); //input lena hi tough h isme to
//
//        String st = sc.next(); //used to input string (tokens only i.e. only a single word
//        String st= sc.nextLine(); //take input of the whole line
//        System.out.println(st);
//        System.out.println(st);

        //CONDITIONAL STATEMENTS
        boolean isSunUp= true;
        if(isSunUp==true)
            System.out.println("day");
        else
            System.out.println("night");

        //LOGICAL OPERATORS
        //&&
        // ||
        // !

        //LOOPS
        // FOR LOOP
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        //  WHILE LOOP
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        //DO-WHILE LOOP
        int k=1;
        do{
            System.out.println(k);
            k++;
        }
        while (k<3);

        //BREAK
        int m=0;
        while(true){
            if(m==3){
                m++;
                continue;
            }
            System.out.println("m=" + m);
            m++;
            if(m>5){
                break;
            }
        }
        //EXCEPTION HANDLING
        //try catch
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException exception) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        printJava();
    }

    public static void printJava(){
        System.out.println("helo");
    }


}
//methods are the functions written in classes
//println gives a line space after printing the output but if we write only print no space is given