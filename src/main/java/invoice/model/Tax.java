package invoice.model;

public enum Tax {

    PROCENT5(1.05), PROCENT8(1.08), PROCENT18(1.18), PROCENT19(1.19), PROCENT23(1.23);
    private double tax;


    Tax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

}
