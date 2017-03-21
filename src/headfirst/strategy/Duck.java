package headfirst.strategy;

public abstract class Duck {
  Flybehavior flyBehavior;
  QuackBehavior quackBehavior;
  public Duck() {}
  public void setFlyBehavior(FlyBehavior fb){
  flyBehavior=fb;
  }
  public void setQuackBehavior(QuackBehavior qb) {
  quackBehavior = qb;
  }
  abstract void display();
 
 public void performFly() {
  flyBehavior.fly();
 }
 public void performQuack() {
   quackBehavior.quck();
 }
  
 

}