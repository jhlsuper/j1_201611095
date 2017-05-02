package headfirst.factory.pizzaf.small;

public class PizzaTestDrive {
  public static void main(String[] ars) {
    PizzaStore nyStore = new NYPizzaStore();
    Pizza p = nyStore.orderPizza("cheese");
    //System.out.println(p.prepare());
    
    p = nyStore.orderPizza("potato");
  }
}