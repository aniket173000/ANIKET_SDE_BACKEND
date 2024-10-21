package org.example.systemDesign.PaymentMuthootFincorpOne;

public class IDFCServiceProvider implements PaymentServiceProvider {
    @Override
    public void processPayment(PaymentDto paymentDto) {
        System.out.println("IDFC Bank is processing payment");
        System.out.println("Payer: " + paymentDto.getPayer() + " Amount" + paymentDto.getAmount() + "to Payee" + paymentDto.getPayee());

    }
}
