package headfirst.factory.pizzaf.small;

public class CheesePizza extends Pizza {
  PizzaingredientFactory inFac;

 public CheesePizza(PizzaingredientFactory ingredientFac) { 
  name = "NY Style Sauce and Cheese Pizza";
  this.inFac=ingredientFac;
  //dough = "Thin Crust Dough";
  sauce = "Marinara Sauce";
  toppings.add("Grated Reggiano Cheese");
 }
 void prepare(){
   System.out.println("Preparing"+name);
   dough=inFac.createDough();
   cheese=inFac.createCheese();
}
}