package lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Price");
        this.price = price;
    }

    public Samosa() {
    }

    @Override
    public String toString() {
        return "{" +
            " price='" + getPrice() + "'" +
            "}";
    }

    public void init(){
        System.out.println("Inside init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }


    
}
