abstract class Division {
    private String divisionName;
    private String accountNumber;

    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public abstract void display();
}
