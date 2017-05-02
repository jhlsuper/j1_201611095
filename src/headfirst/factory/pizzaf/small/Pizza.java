package headfirst.factory.pizzaf.small;
import java.util.ArrayList;
 public abstract class Pizza {
 String name;
 Dough dough;
 String sauce;
 Cheese cheese;
 
 ArrayList<String>toppings = new ArrayList<String>();

 //public String getName() {
 // return name;
 //}
 //public void prepare() {
 // System.out.println("Preparing " + name);
 //}
 abstract void prepare();
 
 public void bake() {
  System.out.println("Baking " + name);
 }
 public void cut() {
  System.out.println("Cutting " + name);
 }
 public void box() {
  System.out.println("Boxing " + name);
 }

}