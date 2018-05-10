import java.util.ArrayList;

public class Vertex {
    private ArrayList<Vertex> adjacencies;
    private ArrayList<String> messagesSent;
    private ArrayList<String> messagesReceived;
    private char name;
    private boolean visited;

    public Vertex(char name) {
        this.name = name;
        adjacencies = new ArrayList<>();
        messagesSent = new ArrayList<>();
        messagesReceived = new ArrayList<>();
    }

    public void addNewMessageSent(String message) {
        messagesSent.add(message);
    }

    public void addNewMessageRecieved(String message) {
        messagesReceived.add(message);
    }

    public void addAjaceny(Vertex vertex) {
        adjacencies.add(vertex);
    }

    public ArrayList<Vertex> getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(ArrayList<Vertex> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ArrayList<String> getMessagesSent() {
        return messagesSent;
    }

    public ArrayList<String> getMessagesReceived() {
        return messagesReceived;
    }

    @Override
    public String toString() {
        return name+"";
    }
}

