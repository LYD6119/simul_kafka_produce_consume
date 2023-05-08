import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class producer implements interfaceProducer {
    private String ip;
    private String port;
    private request rq;
    private KafkaProducer<String, String> producer;

    public void connect(String ip, String port) {
        this.ip=ip;
        this.port=port;
        // 配置生产者属性
        Properties producerProps = new Properties();
        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, ip+':'+port);
        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //创建生产者
        producer = new KafkaProducer(producerProps);
    }


    public void produce(request rq) {
        producer.send(new ProducerRecord(rq.getTopic(), rq.getMs().toString()));
        System.out.println("Sent message: " + rq.getMs().toString());

        producer.close();
    }
}
