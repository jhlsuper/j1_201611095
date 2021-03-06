package headfirst.factory.pizza;

public class PizzaTestDrive {
 
 public static void main(String[] args) {
  SimplePizzaFactory factory = new SimplePizzaFactory();
  PizzaStore store = new PizzaStore(factory);

  Pizza pizza = store.orderPizza("cheese");
  System.out.println("We ordered a " + pizza.getName() + "\n");
 
  pizza = store.orderPizza("pepperoni");
  System.out.println("We ordered a " + pizza.getName() + "\n");
  
  pizza = store.orderPizza("clam");
  System.out.println("We ordered a " + pizza.getName() + "\n");
  
  pizza = store.orderPizza("veggie");
  System.out.println("We ordered a " + pizza.getName() + "\n");
  
  pizza = store.orderPizza("potato");
  System.out.println("We ordered a " + pizza.getName() + "\n");
  } 
}