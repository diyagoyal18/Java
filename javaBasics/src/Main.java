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
    }
}
//methods are the functions written in classes
//println gives a line space after printing the output but if we write only print no space is given