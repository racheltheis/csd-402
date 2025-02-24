public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String nameDiv, int acctNum, String state) {
        super(nameDiv, acctNum);
        this.state = state;
    }

    public void display() {
        System.out.println("Domestic Division Name: " + nameDiv);
        System.out.println("Account #: " + acctNum);
        System.out.println("State (USA): " + state);
        System.out.println();
    }
}
