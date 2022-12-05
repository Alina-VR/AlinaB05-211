

public class PortableComputer extends ComputerImpl {
    private final Display display;
    private final Keyboard keyboard;

    public PortableComputer(String processor, String RAM, String HardDrive, String display, String keyboard) {
        super(processor, RAM, HardDrive);
        this.display = new Display(display);
        this.keyboard = new Keyboard(keyboard);
    }

    public String toString() {
        return super.toString() + " " + display + " " + keyboard;
    }
}


