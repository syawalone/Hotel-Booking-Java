package JavaProject;
//Test

public class BookingHotel {
    private String packageofHotel;
    private double price;
    private int days;
    private double total;

    public BookingHotel(String packageofHotel, double price, int days) {
        this.packageofHotel = packageofHotel;
        this.price = price;
        this.days = days;
    }

    public String getPackageofHotel() {
        return packageofHotel;
    }

    public void setPackageofHotel(String packageofHotel) {
        this.packageofHotel = packageofHotel;
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

    public void CalculateTotal() {
        total = price * days;
    }

    

    public static void main(String[] args) {
        BookingHotel sc = new BookingHotel("Package Rahmah", 10.50, 4);
        System.out.println("Package of Hotel :" + sc.getPackageofHotel());
        System.out.println("Price of Hotel : RM" + sc.getPrice());
        System.out.println("Days of Hotel : " + sc.getDays());
        sc.CalculateTotal();
        System.out.println("Total Price of Hotel : RM" + sc.total);

    }
}
