package thur.variableslab;

/**
 * @title Thursday Variables Lab
 * @author John Haley
 * @date 1/25/2018
 */
public class ThurVariablesLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bossSalary;
        short cookSalary;
        double bossPayPeriod;
        int cookPayPeriod;
        boolean bossIsAJerk;
        
        bossSalary = 120196;
        cookSalary = 20196;
        bossPayPeriod = 52.0;
        cookPayPeriod = 52;
        bossIsAJerk = true;
        
        System.out.println("Boss's Salary is " + bossSalary);
        System.out.println("Cook's Salary is " + cookSalary);
        System.out.println("It is " + bossIsAJerk + " that the " + 
                "boss is a jerk.");
        System.out.println("The Boss's paycheck is " +
                bossSalary / bossPayPeriod);
        System.out.println("The Cook's paycheck is " +
                cookSalary / cookPayPeriod);
        
        cookSalary = (short)bossSalary;
        
        System.out.println("The Cook's new salary is " + cookSalary);
    }
    
}
