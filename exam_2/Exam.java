import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();

        if (lastTwoDigits %2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        if (PrimeBa(lastDigit)) {                                                                                                                                                                                                                                                                                                                                          
            System.out.println(lastDigit + " is a prime number.");
        } else {
            System.out.println(lastDigit + " is a composite number.");
        }

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int NameLength = firstName.length() + surName.length();

        System.out.println("The sum is " + NameLength);
        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        largestNo(firstNumber, secondNumber, thirdNumber);

        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int lastSix = theSix(studentNumber);
        System.out.println("The last six digits is " + lastSix + ".");

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();

        if (studentNumber == 2022102256) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();

        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        // If BSIT
        if (course.equals("BSIT")) {
        System.out.print("Enter your specialization (MWAA or MAA): ");
        String specialization1 = scan.next();

            if((specialization1.equals("MWAA")) || (specialization1.equals("MAA"))) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        
        // If BSCS
        {
        }
    } else if (course.equals("BSCS")) {
        System.out.print("Enter your specialization (DF or ML): ");
        String specialization2 = scan.next();

        if((specialization2.equals("DF")) || (specialization2.equals("ML"))) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();
        switch (strand) {
            case "STEM":
            System.out.println("valid");
            break;
            case "ICT":
            System.out.println("valid");
            break;
            case "HUMSS":
            System.out.println("valid");
            break;
            case "HOME ECONOMICS":
            System.out.println("valid");
            break;
            case "ARTS AND DESIGN":
            System.out.println("valid");
            break;
            case "TVL MARITIME":
            System.out.println("valid");
            break;
            case "ABM":
            System.out.println("valid");
            break;
            default:
            System.out.println("invalid");
        }
        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        String surname = "lim";
        String domain = "@students.national-u.edu.ph";

        if (studentEmailAddress.contains(surname) && studentEmailAddress.contains(domain)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3

        // System.out.println("11. Mystery method! :-)");
        // System.out.print("Enter value of n: ");
        // int n = scan.nextInt();



        // Close scanner
        scan.close();
    }


    //1
    static String ltd(String lastTwoDigits) {
        return lastTwoDigits; 
    }

    //2
    static boolean PrimeBa(int num) {
        if(num<=1)
        {
            return false;
        }
        for(int i=2; i<=num/2;i++) {
            if((num%i)==0)
                return false;
        }
            return true;
    }

    //3
    static int nl(int NameLength) {
        return NameLength;
    }
   
    //4
    static void largestNo(int f, int s, int t) {
        if (f > s) {
            if (s > t)
                System.out.println(f);
            else
                System.out.println(t);
        } else {
            if (s > t)
                System.out.println(s);
            else
            System.out.println(t);
        }
    }

    //5
    static int theSix(int studentNumber) {
        return studentNumber - 2022000000;
    }
}
