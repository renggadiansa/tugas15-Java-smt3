package components;

public class Car {
  private Wheel wheels;
  private Audio audio;

  public Car() {
    new Engine();
    wheels = new Wheel();
    audio = new Audio();
  }

  public void replaceWheel() {
    wheels.replace();
    System.out.println("Car wheel replaced");
  }

  public void installAudio(Audio audio) {
    this.audio = audio;
    System.out.println("Audio installed in the car");
  }

  public void playMusic(UsbFlash usb) {
    usb.storeMusic();
    audio.playAudio();
    System.out.println("Playing music from USB flash");
  }
}
