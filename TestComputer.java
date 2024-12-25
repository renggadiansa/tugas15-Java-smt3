import components.PersonalComputer;
import components.CompactDisk;
import components.Mouse;

  public class TestComputer {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        
        pc.installOS();
        
        CompactDisk cd = new CompactDisk();
        pc.readData(cd);
        
        Mouse mouse = new Mouse();
        pc.detectMouse(mouse);
    }
}
