public class response {
    private String id;
    private String name;
    private String topic;
    private message ms;

    public response() {
    }

    public response(String id, String name, String topic, message ms) {
        this.id = id;
        this.name = name;
        this.topic = topic;
        this.ms = ms;
    }
}
