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

    public void turnOn() {
        System.out.println(this + " turn on");
    }

    public void turnOff() {
        System.out.println(this + " turn off");
    }

    public void connectWithInternet() {
        System.out.println(this + " connect to internet");
    }
}
