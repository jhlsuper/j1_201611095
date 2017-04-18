package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
 Pizza createPizza(String item) {
   
  if (item.equals("cheese")) {
   return  new SMStyleCheesePizza();
  } else if (item.equals("veggie")) {
   return  new SMStyleVeggiePizza();
  }
   else if (item.equals("pepperoni")) {
   return  new SMStylePepperoniPizza();
   } else return null;
 } 
}
