package exam.phase2.questiontwo;

import exam.phase2.questiontwo.decorator.CabinetDecorator;
import exam.phase2.questiontwo.decorator.ParkingDecorator;
import exam.phase2.questiontwo.decorator.TowelDecorator;

// Usign Decorator Desgin pattern
public class Client {
    public static void main(String[] args) {
        Booking badminton = new Badminton(); // client register class badminton
        System.out.println(badminton.getPrice());

        Booking badminton_Parking = new ParkingDecorator(badminton); // register parking for badminton
        System.out.println(badminton_Parking.getPrice());

        Booking badminton_Parking_Towel = new TowelDecorator(badminton_Parking); // register towel for badminton
        System.out.println(badminton_Parking_Towel.getPrice());

        Booking badminton_Parking_Towel_Carbinet = new CabinetDecorator(badminton_Parking); // register carbinet for badminton
        System.out.println(badminton_Parking_Towel_Carbinet.getPrice());

        Booking zumba = new Zumba(); // client register class zumba
        System.out.println(zumba.getPrice());

        Booking zuma_Carbinet = new CabinetDecorator(zumba); // register carbinet for zumba
        System.out.println(zuma_Carbinet.getPrice());
    }
}
