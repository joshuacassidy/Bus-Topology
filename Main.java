public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus(5);
        for (int i = 'a'; i < 'f'; i++) {
            bus.sendMessage('a', (char) i, "message");

        }
    }
}