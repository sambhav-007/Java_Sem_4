package OOPSPractice;

public class Practice1 {
    // Marked as static so they can be accessed in main
    public static class Rides {
        int dist;
        int baseCharge = 10;

        Rides(int distance) {
            this.dist = distance;
        }

        void totalCharge() {
            System.out.println("Total Charge: " + (baseCharge * dist));
        }
    }

    public static class Mini extends Rides {
        int miniCharge = 5;

        // Subclass must call the parent constructor
        Mini(int distance) {
            super(distance);
        }

        void totalCharge() {
            System.out.println("Mini Total Charge: " + (baseCharge * dist * miniCharge));
        }
    }

    public static class SUV extends Rides {
        int SuvCharge = 10;

        SUV(int distance) {
            super(distance);
        }

        void totalCharge() {
            System.out.println("SUV Total Charge: " + (baseCharge * dist * SuvCharge));
        }
    }
    public static class Sedan extends Rides{
        int SedanCharge=15;
        Sedan(int distance){
            super(distance);
        }
        void totalCharge() {
            System.out.println("Sedan Total Charge :"+baseCharge * dist*SedanCharge);
        }
    }

    public static void main(String[] args) {
        // Polymorphism: Reference type is Rides, Object type is Mini
        Rides r1 = new Mini(100);
        Rides r2 = new SUV(200);
        Rides r3 = new Sedan(150);
        // This will call the Mini version of totalCharge() at runtime
        r1.totalCharge();
        r2.totalCharge();
        r3.totalCharge();
    }
}
