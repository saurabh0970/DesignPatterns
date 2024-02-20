package component;

public abstract class Beverage {
    public enum Size {NO_SIZE, SMALL, MEDIUM, LARGE};
    Size size = Size.NO_SIZE;
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
