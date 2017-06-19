package headfirst.singleton.classic;

public class SingletonMain {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getinstance();
    Singleton singleton2 = Singleton.getinstance();
    Singleton singleton3 = Singleton.getinstance();
  }
}