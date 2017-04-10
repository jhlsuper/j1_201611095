package headfirst.decorator.starbuzz;

public class Caramel_Syrup extends CondimentDecorator {
 Beverage beverage;

 public Caramel_Syrup(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + "adding caramel syrup";
 }

 public double cost() {
  return beverage.cost()+0.2;
 }
}