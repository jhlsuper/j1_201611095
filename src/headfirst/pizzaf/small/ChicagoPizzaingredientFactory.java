package headfirst.factory.pizzaf.small;

public class ChicagoPizzaingredientFactory implements PizzaingredientFactory {
  public Dough createDough() {
    return new ThinCrustDough();
  }
  public Cheese createCheese() {
    return new ReggianoCheese();
}
  public Potato createPotato() {
    return new MashedPotato();
  }
}