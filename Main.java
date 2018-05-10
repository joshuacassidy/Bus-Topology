public class Main {

    public static void main(String[] args) {
        int numberOfConnectedDevices = 5;
        Bus bus = new Bus(numberOfConnectedDevices);
        for (int i = 'a'; i < 'a'+numberOfConnectedDevices; i++) {
            bus.sendMessage('a', (char) i, "message");

        }
    }
}