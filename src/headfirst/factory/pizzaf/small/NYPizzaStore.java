package headfirst.factory.pizzaf.small;

public class NYPizzaStore extends PizzaStore {
 Pizza createPizza(String item) {
   Pizza pizza = null;
   PizzaingredientFactory inFac= new NYPizzaingredientFactory();
   
  if (item.equals("cheese")) {
   //return  new NYStyleCheesePizza();
    pizza= new CheesePizza(inFac);
  }
  else if (item.equals("potato")) {
    pizza = new PotatoPizza(inFac);
  }
  return pizza;
 }
   
}
