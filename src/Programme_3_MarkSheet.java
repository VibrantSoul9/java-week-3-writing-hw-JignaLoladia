import java.util.Scanner;

/**
 * Write a java program to input student Name, roll no, and three subjects Math, Science and English marks
 * Marks is between 0 to 100 and if it is out of range print error message "Invalid Input, Marks should between 0 to 100"
 * and find out total, percentage and sesult.
 * if he is pass of fail on basis of percentage (pass>=35) and also give them grade if % > = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
 * Print Mark Sheet in following format
 * _________________________________
 * |                                |
 * |    Mark Sheet                  |
 * |________________________________|
 * |  Name : Jay                    |
 * |  Roll No. 08                   |
 * |________________________________|
 * |  Subjects : Marks              |
 * |________________________________|
 * |  Math : 98                     |
 * |  Science : 90                  |
 * |  Englis : 85                   |
 * |________________________________|
 * |  Total : 273                   |
 * |________________________________|
 * |  Percentage : 91.0             |
 * |  Result : Pass                 |
 * |  Grade : A+                    |
 * |________________________________|
 */

public class Programme_3_MarkSheet {
    public static void main(String[] args) {
    //Scanner declaration for reading input from console
    Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student Name  \t\t:\t");
        String name = scanner.next();
        System.out.print("Enter Student Roll Number \t\t\t");
        int rollNum = scanner.nextInt();
        System.out.print("Enter Marks of Subjects Maths \t:\t");
        int mathsMarks = scanner.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nplease enter correct marks\t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject Science\t:\t");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks <0 || scienceMarks> 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            scienceMarks= scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject English\t:\t");
            int englishMarks = scanner.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.print("\nInvalid input, Marks shuld between 0 to 100");
                System.out.print("\nplease enter correct marks\t\t:\t");
                englishMarks= scanner.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) /300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum,mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();
    }
    // calculating the sun
    public static int sum(int a, int b, int c) {
        return 1 + b + c;
    }
    // calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englisMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englisMarks< 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }
// calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
                grade = "-";
        }
        return grade;
    }
// Printing the Marks Sheet
public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double total, double percetage, String result, String grade) {
    System.out.println("_________________________");
    System.out.println("|                        |");
    System.out.println("| Mark Sheet             |");
    System.out.println("|________________________|");
    System.out.println("| Name : " + name + "          |");
    System.out.println("| Roll no: " + rollNum + "               |");
    System.out.println("|__________________________|");
    System.out.println("| Subjects : Marks           |");
    System.out.println("|____________________________|");
    System.out.println("|Math : " + mathsMarks + "               |");
    System.out.println("|Science : " + scienceMarks + "         |");
    System.out.println("|English: " + englishMarks + "          |");
    System.out.println("|___________________________|");
    System.out.println("|Total: " + total + "                  |");
    System.out.println("|____________________________|");
    System.out.println("| Percentage: "+ percetage+ "" + "      |");
    System.out.println("| Result: " + result + "            |");
    System.out.println("| Grade: " + grade + "                 |");
    System.out.println("|____________________________|");
}
}