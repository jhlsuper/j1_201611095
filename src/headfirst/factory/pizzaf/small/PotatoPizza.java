package headfirst.factory.pizzaf.small;

public class PotatoPizza extends Pizza {
  PizzaingredientFactory inFac;

 public PotatoPizza(PizzaingredientFactory ingredientFac) { 
  name = "NY Style Sauce and Potato Pizza";
  this.inFac=ingredientFac;
  //dough = "Thin Crust Dough";
  sauce = "Marinara Sauce";
  toppings.add("potato");
 }
 void prepare(){
   System.out.println("Preparing"+name);
   dough=inFac.createDough();
   cheese=inFac.createCheese();
}
}