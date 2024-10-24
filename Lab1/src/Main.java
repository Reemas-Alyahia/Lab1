import java.io.FilterOutputStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // System.out.println(" ////////////////////1th////////////");
        //Write a Java program to print the sum (addition), multiply,
        // subtract, divide and remainder of
        //two numbers , takes two numbers as input
//        System.out.println("Enter th first number: ");
//        int number1=input.nextInt();
//        System.out.println("Enter the second number: ");
//        int number2=input.nextInt();
//        System.out.println("the sum of tow numers is :"+(number1+number2));
//        System.out.println("the subtract  of tow numers is :"+(number1-number2));
//        System.out.println("the divide of tow numers is :"+(number1/number2));
//        System.out.println("the multiply  of tow numers is :"+(number1*number2));

        //  System.out.println(" ////////////////////2th////////////");
//. Write a Java program that takes a number as
// input and prints its multiplication table up to 10.
//        int multi=0;
//       int number;
//        System.out.println("put number and i will give you the multiply : ");
//        number=input.nextInt();
//        for (int i = 0; i <=10 ; i++) {
//            multi=i*number;
//            System.out.println(i + "X" + number + "=" + multi);
//        }
//        System.out.println(" ////////////////////3th////////////");
//Write a Java program to print the area and perimeter of a circle
//        System.out.println("enter the radius of a Circle that you have :");
//        double radius=input.nextDouble();
//        double area=0.0;
//        double  perimeter=0.0;
//        area = 3.14 * radius * radius;
//        perimeter=2 * 3.14 * radius;
//        System.out.println("Well The perimeter :"+ perimeter );
//        System.out.println("Well The Area:"+ area );

        //    System.out.println(" ////////////////////4th////////////");
        // Java program to find out the average of a set of integers
//        int numbertime;
//        int count = 1;
//        double number, averageF, sum = 0;
//        System.out.println("Enter the number of how many time u want tho repet?");
//        numbertime = input.nextInt();
//        while (count <= numbertime)
//        {
//            System.out.println("Enter the number?");
//            number = input.nextInt();
//            sum =sum+number;
//            ++count;
//        }
//        System.out.println("The Average is:  "+sum/numbertime +" !");


        //    System.out.println(" ////////////////////5th////////////");
        //. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.

//        System.out.println("enter three numbers here :");
//        System.out.println("enter the first number ");
//        int first_number=input.nextInt();
//        System.out.println("enter the second number ");
//        int second_number=input.nextInt();
//        System.out.println("enter the therd number ");
//        int therd_number=input.nextInt();
//        System.out.println("==========");
//       int sum2= first_number+second_number;
//       if(sum2==therd_number){
//           System.out.println("The result is: True ");}
//           else System.out.println("The result is: false ");

        //    System.out.println(" ////////////////////6th////////////");
//. Write a Java program to reverse a word
//        System.out.println("Enter word and i will revers for you :) ");
//        String revers=input.nextLine();
//        StringBuilder SB  =new StringBuilder(revers);
//    System.out.println("The  reverse word is : "+SB.reverse());
        //    System.out.println(" ////////////////////7th////////////");
//        //Java program to check whether the given number is even or odd
//        System.out.println("Enter number: ");
//        int number=input.nextInt();
//         if(number%2==0){
//             System.out.println("the number is even ! "); }
//else System.out.println("the number is odd ! ");

        //    System.out.println(" ////////////////////8th////////////");
        // Java program to convert the temperature in Centigrade to Fahrenheit
//°F = (c * 9/5) + 32;
//        System.out.println("Enter temperature in Centigrade ");
//       double celios=input.nextDouble();
//        double Fahrenheit= ( celios* 9/5) + 32;
//        System.out.print("Temperature in Fahrenheit is:  "+Fahrenheit );///**check check

        //    System.out.println(" ////////////////////9th////////////");
//        Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//        System.out.println("Input a string:");
//        String name=input.nextLine();
//        System.out.println("Input a number: ");
//        int number_indix=input.nextInt();
//        System.out.println("The index is :  "+name.charAt(number_indix));


        //    System.out.println(" ////////////////////10th////////////");

        //Write a Java program to print the area and perimeter of a rectangle

//        System.out.println("Enter Width");
//        double Width =input.nextDouble();
//        System.out.println("Enter Height");
//        double Height =input.nextDouble();
//        double Area=(Width*Height);
//        String result =String.format("%.2f",Area);
//        double Perimeter=2*(Width+Height);
//        System.out.println("Area is "+Width +"*"+ Height +"= " + Area);
//        System.out.println("Perimeter is:  "+ Perimeter);

        //    System.out.println(" ////////////////////11th////////////");
        // Write a Java program to compare two numbers.
//        System.out.println("Enter two number and i will compare :");
//        System.out.println("enter the first one :");
//        int first=input.nextInt();
//        System.out.println("enter the second one :");
//        int second=input.nextInt();
        //25 != 39 test
        // 25 < 39 test
        //25 <= 39 test
//        while (first!=second){
//            System.out.println(first+"!="+second);
//            break;
//        }
//        while (first<second){
//            System.out.println(first+"<"+second);
//            break;
//        }
//        while (first<=second){
//            System.out.println(first+"<="+second);
//            break;
//        }
        //    System.out.println(" ////////////////////12th////////////");
//Write a Java program to convert seconds to hours, minutes and seconds.
//        System.out.println(" now let's convert our seconds ! ");
//        int allseconds=input.nextInt();
//        ////////how to convert in math
//int hours = allseconds / 3600;
//int minutes = (allseconds % 3600) / 60;
//int seconds = allseconds % 60;
////Input seconds: 86399
////23:59:59
//        System.out.println(hours+ ": "+ minutes+ ": "+ seconds);

        //    System.out.println(" ////////////////////13th////////////");
        //Write a Java program that accepts four integers
        // from the user and prints equal if all
        //four are equal, and not equal otherwise.
//        System.out.println("i will print for you if all your numbers is equal  or not");
//        System.out.println("1th number :"); int number1=input.nextInt();
//        System.out.println("2th number :"); int number2=input.nextInt();
//        System.out.println("3th number :"); int number3=input.nextInt();
//        System.out.println("4th number :"); int number4=input.nextInt();
//        if(number1==number2&&number1==number3&&number1==number4){
//            System.out.println("all the four are equal");}
//        else if (number2==number1&&number2==number3&&number2==number4) {
//            System.out.println("all the four are equal"); }
//        else if (number3==number1&&number3==number2&&number3==number4) {
//            System.out.println("all the four are equal");
//        }
//        System.out.println("thay are not equal");
        //    System.out.println(" ////////////////////14th////////////");
//        Write a Java program that reads an integer and check
//        whether it is negative, zero, or
//        positive.
//        System.out.println("Enter integer and check  whether it is negative, zero, or positive :) " );
//             int number =input.nextInt();
//             if(number==0){
//                 System.out.println(" the number is zero");}
//             else if (number>0) {  System.out.println(" the number is positive");}
//             else System.out.println(" the number is negative");
        //    System.out.println(" ////////////////////15th////////////");
//        Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 ,
//                Don’t count -1).
//        int number=input.nextInt();
//        int sumeven=0;
//        int sumodd=0;
//        int sumzero=0;
//        String keywords;
//        do {
//            System.out.println("Enter number or * -1 * to quite");
//            number = input.nextInt();
//            if (number % 2 == 0) {
//                sumeven = sumeven + number;
//            } else if (number % 2 == 1&&number!= -1) {
//                sumodd = sumodd + number;
//            } else if (number == 0) {
//                sumzero = sumzero + number;
//            }
//            System.out.println("if you want to quite just put * -1 *");
////            keywords = input.nextLine();
//        } while (number!=-1);
//       System.out.println("the even is:  "+sumeven);
//       System.out.println("the odd is:   "+sumodd);
//       System.out.println("the Zeros is:   "+ sumzero);

        //    System.out.println(" ////////////////////16th////////////");
        //Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed

//        System.out.println("Enter number and i will revers it :");
//        String reversnumber=input.nextLine();
//        StringBuilder Sb  =new StringBuilder(reversnumber);
//        System.out.println("The revers of the number is "+Sb.reverse());


        //    System.out.println(" ////////////////////17th////////////");
//        Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.

//        int number;
//        int largest = Integer.MAX_VALUE;
//        int smallest = Integer.MIN_VALUE;
//
//        System.out.println("Please enter any number you want or 0 to stop");
//
//        do {
//            number = input.nextInt();
//            if (number != 0) {
//                if (number < smallest) {
//                    smallest = number;
//                }
//                if (number > largest) {
//                    largest = number;
//                }
//            }
//        } while (number != 0);
//
//        System.out.println("The largest number is: " + largest);
//        System.out.println("The smallest number is: " + smallest);
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//
//
//        while (true) {
//            System.out.print("Enter a number or *quit* to exit  ");
//            String word = input.nextLine();
//
//            if (word.equalsIgnoreCase("quit")) {break; }
//
//            int number = Integer.parseInt(word);
//            if (number > largest) { largest = number;}
//            if (number < smallest) { smallest = number;
//            }
//        }
//
//        System.out.println("Largest number: " + largest);
//        System.out.println("Smallest number: " + smallest);

        //    System.out.println(" ////////////////////18th////////////");
        //Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.
//        System.out.println("Enter any character : ");
//        String word = input.nextLine();
//        int count = 0;
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == 'a') {
//                count++;
//            }
//        }System.out.println("Number of a's: " +count);



    }}
