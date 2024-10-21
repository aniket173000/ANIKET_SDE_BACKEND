package org.example.systemDesign.PaymentMuthootFincorpOne;

public class BankFactory {

    public PaymentServiceProvider getServiceProvider(String bankName){
        if(bankName.equalsIgnoreCase("SBI"))
            return new SBIServiceProvider();
        else if(bankName.equalsIgnoreCase("HDFC"))
            return new HDFCServiceProvider();
        else if(bankName.equalsIgnoreCase("IDFC"))
            return new IDFCServiceProvider();
        else{
            System.out.println("Invalid Bank Name");
            return new SBIServiceProvider();
        }
    }
}
