/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

/**
 *
 * @author johnson3yo
 */
public class FillingDTO {
    
    private int status;
    private double amount;
    private double tax;

    public FillingDTO(int status, double amount, double tax) {
        this.status = status;
        this.amount = amount;
        this.tax = tax;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

   
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
 
    
    
    
}
