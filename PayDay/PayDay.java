
/**
 * Write a description of class PayDay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayDay
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PayDay
     */
    public PayDay()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public String pay(String name, double hourlyRate, double hoursWorked, 
    double deductionRate) {
        String result;
        
        double grossPay;
        double deduction =0.0;
        double netPay =0.0;
        
             grossPay = hourlyRate * hoursWorked;
             deduction = grossPay * deductionRate;
            netPay = grossPay - deduction; 
        result = String.format("%s %.2f %.2f %.2f", name, 
                      grossPay, deduction, netPay);
        return result;
        
        
        
    }
    
    
    }
     
  
 

