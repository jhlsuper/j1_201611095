package headfirst.factory.pizzaf.small;

public interface PizzaingredientFactory {
  public Dough createDough();
  public Cheese createCheese();
  public Potato createPotato();
  
}