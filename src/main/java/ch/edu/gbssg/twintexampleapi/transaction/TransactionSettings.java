package ch.edu.gbssg.twintexampleapi.transaction;

import java.util.List;

public class TransactionSettings {
    private String currency;
    private String refno;
    private int amount;
    private List<String> paymentMethods;


    public TransactionSettings() {
    }


    public TransactionSettings(String currency, String refno, int amount, List<String> paymentMethods) {
        this.currency = currency;
        this.refno = refno;
        this.amount = amount;
        this.paymentMethods = paymentMethods;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRefno() {
        return this.refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<String> getPaymentMethods() {
        return this.paymentMethods;
    }

    public void setPaymentMethods(List<String> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

}
