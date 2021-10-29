public class PizzaClass {
    // Default
    private String toppings = "";
    private int slices = 0;
    private String size = "";

    public PizzaClass (String toppings, int slices, String size){
        this.toppings = toppings;
        this.slices = slices;
        this.size = size;
    }

    // Methods
    public String setTopping(String top){
        toppings = top;
        return toppings;
    }

    public int setSlice(int slice){
        slices = slice;
        return slices;
    }

    public String setSize(String sizze){
        size = sizze;
        return size;
    }

    public int getSlices() {
        return slices;
    }
    public String getToppings() {
        return toppings;
    }
    public String getSize() {
        return size;
    }
    public void getOrder(){
        System.out.println("Your order is on the way!");
        System.out.println("Here are the details of your order: ");
        System.out.println();
        System.out.println("Size: " + getSize());
        System.out.println("Topping: " + getToppings());
        System.out.println("Slices: " + getSlices());
    }
}
