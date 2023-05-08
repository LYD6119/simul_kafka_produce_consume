import java.io.Serializable;

public class message implements Serializable {
    private String name;
    private String id;
    private String ip;
    private String status;
    private String content;
    private String uuid;
    private String topic;


    // 构造函数、Getter 和 Setter 方法

    public message() {
    }

    public message(String name, String id, String ip, String status, String content, String uuid) {
        this.name = name;
        this.id = id;
        this.ip = ip;
        this.status = status;
        this.content = content;
        this.uuid = uuid;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getUuid() {
        return uuid;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", ip='" + ip + '\'' +
                ", status='" + status + '\'' +
                ", content='" + content + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
