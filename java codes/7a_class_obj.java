class lamp{
  boolean isOn;
  void turnOn(){
    isOn = true;
    System.out.println("LightOn? "+isOn);
  }
  void turnOff(){
    isOn = false;
    System.out.println("LightOn? "+isOn);
  }
}
public class Priyanshu{
  public static void main(String args[]) {
    lamp led = new lamp();
    lamp halogen=new lamp();
    led.turnOn();
    halogen.turnOff();
  }
}