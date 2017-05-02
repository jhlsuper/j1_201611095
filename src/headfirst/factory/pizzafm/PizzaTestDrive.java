package headfirst.factory.pizzafm;

public class PizzaTestDrive {
 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  PizzaStore smStore = new SMPizzaStore();
 
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("ordered a " + pizza.getName() + "\n");
 
  pizza = nyStore.orderPizza("pepperoni");
  System.out.println("ordered a " + pizza.getName() + "\n");
 
  pizza = nyStore.orderPizza("veggie");
  System.out.println("ordered a " + pizza.getName() + "\n");
 
   pizza = smStore.orderPizza("cheese");
  System.out.println("ordered a " + pizza.getName() + "\n");
 
  pizza = smStore.orderPizza("pepperoni");
  System.out.println("ordered a " + pizza.getName() + "\n");
 
  pizza = smStore.orderPizza("veggie");
  System.out.println("ordered a " + pizza.getName() + "\n");
 
  
  
 }
}