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

