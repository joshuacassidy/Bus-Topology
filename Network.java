public interface Network {
    public void createModel();
    public Vertex find(char sourceName, char destinationName);
    public void sendMessage(char sourceName, char destinationName, String message);
}
