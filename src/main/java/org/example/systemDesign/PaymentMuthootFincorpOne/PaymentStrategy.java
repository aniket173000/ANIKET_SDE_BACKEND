package org.example.systemDesign.PaymentMuthootFincorpOne;

public class PaymentStrategy {
    void processStrategy(PaymentDto paymentDto, PaymentServiceProvider paymentServiceProvider){
        paymentServiceProvider.processPayment(paymentDto);
    }

    PaymentServiceProvider getServiceProvider(){
        Integer rate = getRate();

            return new SBIServiceProvider();
    }

    private  Integer getRate(){
        int max = 100;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;

            // Output is different everytime this code is executed
            return rand;
        }
        return 0;
    }
}





