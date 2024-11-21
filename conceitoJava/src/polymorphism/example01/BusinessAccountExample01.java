package polymorphism.example01;

public class BusinessAccountExample01  extends AccountExample01{

    private Double loanLimit;

    public BusinessAccountExample01() { super(); }

    public BusinessAccountExample01 (Integer number, String holder, Double balance, Double loanLimit) {
        super (number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit () {
        return loanLimit;
    }

    public void setLoanLimit (Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) { deposit(amount);
        }
    }
}
