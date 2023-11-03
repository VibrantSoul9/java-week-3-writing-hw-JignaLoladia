import java.util.Scanner;

/**
 * WAP to input employee id. name, basic salary then find HRA, TA,DA,PF and Gross salary
 * HRA = basic salry 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF = Basic salary 20%
 * Gross Salary = basic salary + HRA + TA + DA -PF
 * print in following format
 * ________________________________
 * | Salary Slip                  |
 * |______________________________|
 * | Employee Id : 2564           |
 * | Employee Name : Jay          |
 * |______________________________|
 * | Basic Salary : 25000.0       |
 * | HRA 10% : 2500.0             |
 * | DA 8% : 2250.0               |
 * | TA 9% : 2000.0               |
 * | PF - 20%; : 5000.0           |
 * |______________________________|
 * | Gross Salary : 26750.0       |
 * |==============================|
 */
public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your EmployeeID:");
        int employeeId = scanner.nextInt();
        System.out.println("Enter basic salary:");
        double basicSalary = scanner.nextDouble();
        //Calculating HRA, DA,TA and Pf
        double hRA = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double pf = calculatePF(basicSalary);
        // Calculating the gross salary
        double grossSalary = basicSalary + hRA + da + ta - pf;
        System.out.println("______________________________");
        System.out.println("|Salary Slip                  |");
        System.out.println("|_____________________________|");
        System.out.println("|Employee ID: " + employeeId + "       |");
        System.out.println("|Employee Name: " + name + "           |");
        System.out.println("|______________________________|");
        System.out.println("|Basic Salary: " + basicSalary + "     |");
        System.out.println("|HRA 10% : " + hRA + "          |");
        System.out.println("|TA 8% : " + ta + "             |");
        System.out.println("|DA 9% : " + da + "             |");
        System.out.println("|PF -20% : " + pf + "             |");
        System.out.println("|_______________________________|");
        System.out.println("|Gross Salary : " + grossSalary + "    |");
        System.out.println("|_______________________________|");
        // Closing scanner object
        scanner.close();
    }

    //calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    // Calculating DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    // Calculating TA
    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    //calculating PF
    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }
}

