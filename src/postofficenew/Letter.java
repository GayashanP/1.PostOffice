package postofficenew;

public class Letter {
    private final String receiverAddress;
    private final String body;
    private final int weight;
    private Stamp stamp;

    public Letter(String receiverAddress, String body, int weight) {
        this.receiverAddress = receiverAddress;
        this.body = body;
        this.weight = weight;
    }

    public void setStamp(Stamp stamp) {
        this.stamp = stamp;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public String getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public Stamp getStamp() {
        return stamp;
    }
}
