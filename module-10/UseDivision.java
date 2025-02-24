public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision international1 = new InternationalDivision("Global Operations Headquarters", 20000, "South Korea", "Korean");
        InternationalDivision international2 = new InternationalDivision("Global Reverse Logistics Department", 21999, "Mexico", "Spanish");
        
        DomesticDivision domestic1 = new DomesticDivision("Southwest Distribution Center", 15560, "Arizona");
        DomesticDivision domestic2 = new DomesticDivision("Corporate Headquarters", 10000, "Minnesota");
        
        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}
