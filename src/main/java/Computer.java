public interface Computer {
    void turn_on();

    void turn_off();

    void connect_with_internet();
}

class ComputerImpl implements Computer {
    String processor;
    String RAM;
    String HardDrive;

    public ComputerImpl(String processor, String RAM, String HardDrive) {
        this.processor = processor;
        this.RAM = RAM;
        this.HardDrive = HardDrive;
    }

    public String toString() {
        return String.valueOf(getClass()).split(" ")[1] + " with " + processor + " " + RAM + " " + HardDrive;
    }

    public void turn_on() {
        System.out.println(this + " turn on");
    }

    public void turn_off() {
        System.out.println(this + " turn off");
    }

    public void connect_with_internet() {
        System.out.println(this + " connect to internet");
    }
}

class ServerComputer extends ComputerImpl {

    public ServerComputer(String processor, String RAM, String HardDrive) {
        super(processor, RAM, HardDrive);
    }
}
