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

