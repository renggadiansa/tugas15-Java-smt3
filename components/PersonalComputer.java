package components;

public class PersonalComputer {
    public MotherBoard motherBoard;
    public OperatingSystem os;
    public Mouse mouse;

    public PersonalComputer() {
        this.motherBoard = new MotherBoard();
        System.out.println("PersonalComputer created with MotherBoard.");
    }

    public void installOS() {
        this.os = new OperatingSystem();
        os.load();
        System.out.println("Operating System installed.");
    }

    public void readData(CompactDisk cd) {
        cd.read();
        System.out.println("Data read from Compact Disk.");
    }

    public void detectMouse(Mouse mouse) {
        this.mouse = mouse;
        mouse.connect();
        System.out.println("Mouse detected.");
    }
}
