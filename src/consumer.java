import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class consumer implements interfaceConsumer {
    private String ip;
    private String port;
    private response rp;
    private KafkaConsumer<String, String> consumer;

    public void connect(String ip, String port) {
        this.ip=ip;
        this.port=port;
        // 配置消费者属性
        Properties consumerProps = new Properties();
        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, ip+':'+port);
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, "my-group");
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        // 创建消费者
        consumer = new KafkaConsumer(consumerProps);


    }

    public void consume(String topic) {
        // 订阅指定主题
        consumer.subscribe(java.util.Collections.singleton(topic));
        // 接收消息并处理
        System.out.println("Consumer started, waiting for messages...");
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(TimeUnit.MILLISECONDS.toMillis(100));
            for (ConsumerRecord<String, String> record : records) {
                System.out.println("Received message: " + record.value());
            }
        }
    }
}

