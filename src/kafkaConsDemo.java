public class kafkaConsDemo {

    public static void main(String[] args) {

        consumer consumer = new consumer();
        consumer.connect("10.112.112.176","9092");
        consumer.consume("homework1");
    }
}
