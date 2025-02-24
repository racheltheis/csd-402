public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String nameDiv, int acctNum, String country, String language) {
        super(nameDiv, acctNum);
        this.country = country;
        this.language = language;
    }

    public void display() {
        System.out.println("International Division Name: " + nameDiv);
        System.out.println("Account #: " + acctNum);
        System.out.println("Country: " + country);
        System.out.println("Primary Language: " + language);
        System.out.println();
    }
}
