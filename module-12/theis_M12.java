//Rachel Theis
//Module 12 Assignment
//CSD 402
//3.9.25

public class AutoService {
    private static final double standardService = 300.00;
    
    public static double yearlyService() {
        return standardService;
    }
    
    public static double yearlyService(double oilChange) {
        return standardService + oilChange;
    }
    
    public static double yearlyService(double oilChange, double tireRotation) {
        return standardService + oilChange + tireRotation;
    }
    
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        return standardService + oilChange + tireRotation - coupon;
    }
    
    public static void main(String[] args) {
        System.out.println("Test 1:");
        System.out.println("Annual Standard Service: $" + yearlyService());
        System.out.println("Annual Standard Service + Oil Change: $" + yearlyService(60.00));
        System.out.println("Annual Standard Service + Oil Change + Tire Rotation: $" + yearlyService(60.00, 70.00));
        System.out.println("Annual Standard Service + Oil Change + Tire Rotation - Coupon: $" + yearlyService(60.00, 70.00, 100));
        
        System.out.println("Test 2:");
        System.out.println("Annual Standard Service: $" + yearlyService());
        System.out.println("Annual Standard Service + Oil Change: $" + yearlyService(75.00));
        System.out.println("Annual Standard Service + Oil Change + Tire Rotation: $" + yearlyService(75.00, 100.00));
        System.out.println("Yearly service with all services and coupon - Coupon: $" + yearlyService(75.00, 100.00, 50.00));
    }
}
