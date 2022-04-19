package ch.edu.gbssg.twintexampleapi.transaction;

public class TransactionUrl {
    private String successUrl;
    private String cancelUrl;
    private String errorUrl;

    public TransactionUrl() {
    }

    public TransactionUrl(String successUrl, String cancelUrl, String errorUrl) {
        this.successUrl = successUrl;
        this.cancelUrl = cancelUrl;
        this.errorUrl = errorUrl;
    }

    public String getSuccessUrl() {
        return this.successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getCancelUrl() {
        return this.cancelUrl;
    }

    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    public String getErrorUrl() {
        return this.errorUrl;
    }

    public void setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
    }

}
