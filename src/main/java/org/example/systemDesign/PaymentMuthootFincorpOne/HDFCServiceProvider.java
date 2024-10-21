package org.example.systemDesign.PaymentMuthootFincorpOne;

public class HDFCServiceProvider implements PaymentServiceProvider {

    @Override
    public void processPayment(PaymentDto paymentDto) {
        System.out.println("HDFC is processing payment");
        System.out.println("Payer: " + paymentDto.getPayer() + " Amount" + paymentDto.getAmount() + "to Payee" + paymentDto.getPayee());
    }
}
