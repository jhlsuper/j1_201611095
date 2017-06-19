package headfirst.singleton.stat;

public class SingletonClient{
  public static void main(String[] args){
    Singleton singleton1 = Singleton.getinstance();
    Singleton singleton2 = Singleton.getinstance();
  }
}