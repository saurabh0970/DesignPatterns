package decorator;

import component.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case SMALL:
                cost += 0.1;
                break;
            case MEDIUM:
            case NO_SIZE:
                cost += 0.15;
                break;
            case LARGE:
                cost += 0.2;
                break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
