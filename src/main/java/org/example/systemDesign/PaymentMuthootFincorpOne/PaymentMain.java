package org.example.systemDesign.PaymentMuthootFincorpOne;

public class PaymentMain {
    public static void main(String[] arg){
        System.out.println("Hey we are testing payment service");
        PaymentStrategy paymentStrategy = new PaymentStrategy();
        PaymentDto paymentDto = new PaymentDto("aniket", "mohit", 100.00);
        PaymentServiceProvider paymentServiceProvider = paymentStrategy.getServiceProvider();
        paymentStrategy.processStrategy(paymentDto, new SBIServiceProvider());
    }


}
