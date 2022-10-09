 class Main {
    public static void main(String[] args) {
        Computer[] array = {new Desktop("intel i5", "16GB", "512GB", "Nvidia"),
                new Laptop("intel i5", "16GB", "512GB", "Display1", "Keyboard1"),
                new Netbook("intel i5", "16GB", "512GB", "Display2", "Keyboard2"),
                new MonoBlock("intel i5", "16GB", "512GB", "Display3"),
                new ServerComputer("intel i5", "16GB", "512GB"),
                new Nettop("intel i5", "16GB", "512GB")};
        for (Computer i : array) {
            i.turn_on();
            i.connect_with_internet();
            i.turn_off();
        }
    }



}
