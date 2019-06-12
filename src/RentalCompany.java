package WypozyczalniaRowerow;

import java.util.ArrayList;
import java.util.List;

public class RentalCompany {

    //private List<Bike> bikes = new ArrayList<>();

    private double revenue;

    public Bike orderBike(int days, Frames frame, Colors color, int tireThickness) {

        Bike bike = new Bike(color, tireThickness, frame, days);

        double price;

        price = bike.getDays() * bike.getFrame().getPrice() * (bike.getColor().getValue() + bike.getTireThickness() / 3) / 20;

        bike.setPrice(price);

        this.revenue += price;

        return bike;
    }


//    public List<Bike> orderBike(List<Bike> bikes) {
//
//        //int days, Frames frame, Colors color, double tireThickness
//        double price;
//        List<Bike> orderedBikes = new ArrayList<>();
//
//        for (Bike bike : bikes) {
//            price = bike.getDays() * bike.getFrame().getPrice() * (bike.getColor().getValue() + bike.getTireThickness() / 3) / 20;
//            bike.setPrice(price);
//            orderedBikes.add(bike);
//            revenue += price;
//        }
//        return orderedBikes;
//    }
//
//    public List<Bike> getBikes() {
//        return bikes;
//    }
//
//    public void setBikes(List<Bike> bikes) {
//        this.bikes = bikes;
//    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
