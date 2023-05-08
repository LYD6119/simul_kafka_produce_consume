public class request {
    private String topic;
    private message ms;

    public request() {
    }

    public request(String topic, message ms) {
        this.topic = topic;
        this.ms = ms;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setMs(message ms) {
        this.ms = ms;
    }

    public String getTopic() {
        return topic;
    }
    public message getMs() {
        return ms;
    }

}
