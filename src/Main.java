package WypozyczalniaRowerow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

//        Bike bike1=new Bike();
//        Bike bike2=new Bike();
//        Bike bike3=new Bike();

//        List<Bike> bikes =new ArrayList<>();
//        bikes.addAll(Arrays.asList(bike1,bike2,bike3));

        RentalCompany rentalCompany=new RentalCompany();

        Bike bike1=rentalCompany.orderBike(15,Frames.ST,Colors.RED,25);
        System.out.println("Ordered for 15 days: "  + bike1.toString());

        Bike bike2=rentalCompany.orderBike(40,Frames.AL,Colors.GREEN,85);
        System.out.println("Ordered for 40 days: "  + bike2.toString());

        Bike bike3=rentalCompany.orderBike(20,Frames.ST,Colors.BLUE,43);
        System.out.println("Ordered for 20 days: "  + bike3.toString());

        System.out.println(String.format("Rental income: %.2f", rentalCompany.getRevenue()));
    }

}
