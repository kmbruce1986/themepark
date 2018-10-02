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

    public boolean checkHeight(Customer customer){
        if (customer.getHeight() >= this.minimumHeight){
            return true;
        }
        else {
            return false;
        }
    }

    public void takePayment(Customer customer){
        if (customer.getMoney() >= this.price){
        customer.payMoney(this.price);}
    }
}
