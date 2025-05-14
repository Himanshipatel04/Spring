package com.example.demo.Entity;

public class PaymentEntity {
    private Long id;
    private double paymentAmount;
    private String paymentCurrency;
    private String userEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getpaymentAmount() {
        return paymentAmount;
    }

    public void setpaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getpaymentCurrency() {
        return paymentCurrency;
    }

    public void setpaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}
