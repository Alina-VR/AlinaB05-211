public class DesktopComputer extends ComputerImpl {

    public DesktopComputer(String processor, String ram, String hardDrive) {
        super(processor, ram, hardDrive);
    }
}

class Desktop extends DesktopComputer {
    String video_card;

    Desktop(String processor, String RAM, String HardDrive, String video_card) {
        super(processor, RAM, HardDrive);
        this.video_card = video_card;
    }

    public String toString() {
        return super.toString() + " " + video_card;
    }
}

class Nettop extends DesktopComputer {

    public Nettop(String processor, String ram, String hardDrive) {
        super(processor, ram, hardDrive);
    }
}

class MonoBlock extends DesktopComputer {
    private final Display display;

    public MonoBlock(String processor, String ram, String hardDrive, String display) {
        super(processor, ram, hardDrive);
        this.display = new Display(display);
    }

    public String toString() {
        return super.toString() + " " + display;
    }
}