import java.util.Scanner;
import java.lang.Math;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        /*
         * // Long exam 2
         * // Total points possible (100 pts)
         * // Methods and Conditions
         * 
         * // Part I
         * // 1. Create a method.
         * // 2. Call the method.
         * // 3. Print result of the method.
         * 
         * //
         * =============================================================================
         * =
         * // 1. Create a method that will:
         * // print "ODD" if the last two digits of your student number is an odd number
         * // print "EVEN" if the last two digits of your student number is an even
         * number.
         * // (10 pts)
         * 
         * oddOrEvenNumbers();
         * 
         * //
         * =============================================================================
         * =
         * 
         * // 2. Create a method that will:
         * // print "PRIME" if the last digit of your student number is a prime number
         * // print "COMPOSITE" if the last digit of your student number is a composite
         * // number.
         * // print "NEITHER" if the last digit of your student number is neither a
         * prime
         * // nor a composite number.
         * // (10 pts)
         * 
         * primeOrCompositeNumbers();
         * 
         * //
         * =============================================================================
         * =
         * 
         * // 3. Create a method that will return the sum of the character length of
         * your
         * // firstname and your surname. (10 pts)
         * 
         * lengthOfFullName();
         * 
         * //
         * =============================================================================
         * =
         * 
         * // 4. Create a method that will take three whole numbers and print the
         * largest
         * // number.
         * 
         * largestNumber();
         * 
         * //
         * =============================================================================
         * =
         * 
         * // 5. Create a method and think of a formula to get the last 6 digits of your
         * // student number. (10 pts)
         * 
         * lastSixDigits();
         * 
         * //
         * =============================================================================
         * ============================================
         * 
         * // Part II
         * // Print "valid" if the result is true.
         * // Print "invalid" if the result is false.
         * 
         * //
         * =============================================================================
         * =
         * // 6. Create a condition to check if the entered student number is your
         * student
         * // number. (10 pts)
         * 
         * studentNumberValidation();
         * 
         * //
         * =============================================================================
         * =
         * 
         * // 7. Create a condition to check if your firstname is in UPPERCASE and your
         * // lastname is in lowercase. (10 pts)
         * 
         * caseSensitivityCheck();
         * 
         * //
         * =============================================================================
         * =
         * 
         * // 8. Create a nested condition that will ask the specialization of the
         * student
         * // is taking
         * // depending if the student is a BSIT or BSCS student.
         * 
         * // Condition 1
         * // if the student is BSIT, ask again if the student is taking MWAA or MAA.
         * 
         * // Condition 2
         * // if the student is BSCS, ask again if the student is taking ML or DF.
         * 
         * nestedConditions();
         * 
         * //
         * =============================================================================
         * =
         * 
         * // 9. Create a condition to check if the answer belongs to one of the
         * possible
         * // answers. (10 pts)
         * 
         * // STEM
         * // ICT
         * // ABM
         * // HUMSS
         * // HOME ECONOMICS
         * // ARTS AND DESIGN
         * // TVL MARITIME
         * 
         * selection();
         * 
         * //
         * =============================================================================
         * =
         * 
         * // 10. Create a condition to check if your student email address contains the
         * // following pattern:
         * // - Your surname
         * // - The string "@students.national-u.edu.ph"
         * // (10 pts)
         * 
         * studentEmailValid();
         */
        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3

        mysteryMethod();

        // Close scanner
        scan.close();

    }

    // 1. ODD or EVEN numbers
    static void oddOrEvenNumbers() {
        System.out.println("\n1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        if (lastTwoDigits % 2 != 0) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    }

    // 2. PRIME or COMPOSITE number
    static void primeOrCompositeNumbers() {
        System.out.println("\n2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();

        if (isPrime(lastDigit)) {
            System.out.println("PRIME");
        } else if (lastDigit != 1 || lastDigit != 0) {
            System.out.println("COMPOSITE");

        } else {
            System.out.println("NEITHER");
        }
    }

    static boolean isPrime(int inVal) {
        if (inVal <= 1) {
            return false;
        }
        for (int i = 2; i <= inVal / 2; i++) {
            if ((inVal % i) == 0)
                return false;
        }
        return true;
    }

    // 3. Length of your fullname
    static void lengthOfFullName() {
        System.out.println("\n3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        scan.nextLine();
        System.out.print("Enter your surname: ");
        String surName = scan.next();

        int lengthOfFullName = firstName.length() + surName.length();

        System.out.printf("Your name has %d letters\n", lengthOfFullName);
    }

    // 4. Largest Number
    static void largestNumber() {
        System.out.println("\n4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        int largestNum = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        System.out.println(largestNum);
    }

    // 5. Last six digits
    static void lastSixDigits() {
        System.out.println("\n5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        int lastDigits = studentNumber % 1000000;

        System.out.println(lastDigits);
    }

    // 6. Student number validation
    static void studentNumberValidation() {
        System.out.println("\n6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        if (studentNumber == 2022102503) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

    }

    // 7. Case sensitivity check
    static void caseSensitivityCheck() {
        System.out.println("\n7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();

        if (firstName.equals(firstName.toUpperCase()) && surName.equals(surName.toLowerCase())) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    // 8. Nested conditions
    static void nestedConditions() {
        System.out.println("\n8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        if (course.equals("BSIT")) {
            // If BSIT
            System.out.print("Enter your specialization (MWAA or MAA): ");
            String specialization1 = scan.next();

            if (specialization1.equals("MWAA")) {
                System.out.printf("valid\n");

            } else if (specialization1.equals("MAA")) {
                System.out.printf("valid\n");
            } else {
                System.out.println("invalid");
            }
        }

        else if (course.equals("BSCS")) {

            // If BSCS
            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();

            if (specialization2.equals("DF")) {
                System.out.printf("valid\n");
            } else if (specialization2.equals("ML")) {
                System.out.printf("valid\n");
            } else {
                System.out.println("invalid");
            }

        } else {
            System.out.println("invalid");
        }

    }

    // 9. Selection
    static void selection() {

        System.out.println("\n9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        scan.nextLine();
        String strand = scan.nextLine();

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
            default:
                System.out.println("invalid");
                break;

        }
    }

    // 10. Validate student email address
    static void studentEmailValid() {
        System.out.println("\n10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (studentEmailAddress.contains("bonilla") && (studentEmailAddress.contains("@students.national-u.edu.ph"))) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    // 11. Mystery method! :-)
    static void mysteryMethod() {
        System.out.println("\n11. Mystery method! :-)");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum = (-n - (-n + i));
        }

        if (sum % 2 == 0) {
            System.out.println(-1 * sum);
        } else {
            System.out.println(sum);
        }
    }

}
