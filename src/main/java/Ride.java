public abstract class Ride {
    private double price;
    private double minimumHeight;


    public Ride(double price, double minimumHeight) {
        this.price = price;
        this.minimumHeight = minimumHeight;
    }

    public double getPrice() {
        return price;
    }

    public double getMinimumHeight() {
        return minimumHeight;
    }

//    public boolean checkHeight(Customer customer){
//        if (customer.this.minimumHeight)
//    }
}
