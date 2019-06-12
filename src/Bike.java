public class Bike {

    private Colors color;
    private int tireThickness;
    private Frames frame;
    private double price;
    private int days;

    public Bike(Colors color, int tireThickness, Frames frame, int days) {
        this.color = color;
        this.tireThickness = tireThickness;
        this.frame = frame;
        this.days = days;
    }


    @Override
    public String toString() {
        return String.format("(%s,%d, %s) -> %.2f", color.getName(),tireThickness, frame.getName(), price);
    }


    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getTireThickness() {
        return tireThickness;
    }

    public void setTireThickness(int tireThickness) {
        this.tireThickness = tireThickness;
    }

    public Frames getFrame() {
        return frame;
    }

    public void setFrame(Frames frame) {
        this.frame = frame;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
