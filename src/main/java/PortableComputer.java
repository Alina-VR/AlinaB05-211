

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

class Laptop extends PortableComputer {

    public Laptop(String processor, String RAM, String HardDrive, String display, String keyboard) {
        super(processor, RAM, HardDrive, display, keyboard);
    }
}

class Netbook extends PortableComputer {

    public Netbook(String processor, String RAM, String HardDrive, String display, String keyboard) {
        super(processor, RAM, HardDrive, display, keyboard);
    }
}