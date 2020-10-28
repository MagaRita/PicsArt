package picsart.homework1;

public class Types {
    public static void main(String[] args) {

        System.out.println("The byte data type is an 8-bit signed integer.");
        System.out.print("An example: x = ");

        byte x = 30;
        System.out.println(x);

        x = -50;
        System.out.println("The x value can change: x = " + x);

        System.out.println("\nThe short data type is a 16-bit signed integer.");
        System.out.print("An example: y = ");

        short y = 3000;
        System.out.println(y);

        System.out.println("\nThe int data type is a 32-bit signed integer. It has a maximum value of 2,147,483,647.");
        System.out.print("An example: z = ");

        int z = 1000000;
        System.out.println(z);

        System.out.println("\nThe long data type is a 64-bit signed integer.");
        System.out.print("An example: a = ");

        long a = 345435345435L;
        System.out.println(a);

        System.out.println("\nThe float data type is a single-precision 32-bit floating point.");
        System.out.print("An example: b = ");

        float b = 345.234f;
        System.out.println(b);

        System.out.println("\nThe double data type is a double-precision 64-bit floating point.");

        double c = 453.23;
        System.out.println("An example: c = " + c);

        System.out.println("\nThe boolean data type has only two possible values: true and false.");

        boolean temp = true;
        System.out.println("An example: temp = " + temp);

        temp = false;
        System.out.println("The value of temp can change to: temp = " + temp);

        System.out.println("\nThe char data type is a single 16-bit Unicode character.");
        char ch = 'c';

        System.out.println("An example: ch = " + ch);

        ch = '\u00DF';
        System.out.println("The ch value can change to: ch = " + ch);

        System.out.println("\nString is not a primitive data type in Java.");

        String sentence = "This is your first PicsArt homework.";
        String message = "Congrats!";
        String name = "Maga";
        System.out.println("\nWelcome " + name + ",");
        System.out.println(sentence);
        System.out.println(message);

    }
}
