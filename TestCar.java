import components.Audio;
import components.Car;
import components.UsbFlash;

public class TestCar {
  public static void main(String[] args) {
    Car car = new Car();

    car.replaceWheel();

    Audio newAudio = new Audio();
    car.installAudio(newAudio);

    UsbFlash usb = new UsbFlash();
    car.playMusic(usb);

  }
}
