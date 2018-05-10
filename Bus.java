public class Bus implements Network {
    private Vertex[] network;
    private int numberOfVertices;

    public Bus(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        createModel();
    }



    @Override
    public void createModel() {
        network = new Vertex[numberOfVertices];
        for (int i = 0, name = 'a'; i < numberOfVertices; i++, name++) {
            network[i] =  new Vertex((char)name);
        }
    }

    @Override
    public Vertex find(char sourceName, char destinationName) {
        for (Vertex v : network) {
            if (v == null) {
                throw new RuntimeException("Could not find vertex" + destinationName);
            }

            if (v.getName() == destinationName) {
                return v;
            }

        }
        throw new RuntimeException("Could not find vertex" + destinationName);
    }

    @Override
    public void sendMessage (char sourceName, char destinationName, String message){
        Vertex messageSentTo = find(sourceName, destinationName);
        messageSentTo.addNewMessageSent(message + " (" + sourceName + " sent a message to " + sourceName + ").");
        messageSentTo.addNewMessageRecieved(message + " ( " + destinationName + " received a message from " + sourceName + ").");
        System.out.println("Message successfully sent from " + sourceName + " to " + destinationName);

    }

}