public class kafkaProdDemo {
    public static void main(String[] args) throws InterruptedException {
        producer producer = new producer();
        producer.connect("10.112.112.176","9092");
        // 发送消息到指定主题
        message ms=new message("lyd","2020210908","192.168.1.100","","TCP","");
        request rq=new request("homework1",ms);
        producer.produce(rq);

    }
}
