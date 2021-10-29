public class PizzaClass {
    // Default
    private String toppings = "";
    private int slices = 0;
    private String size = "";



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
}
