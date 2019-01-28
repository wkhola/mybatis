import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Test;

import java.util.Properties;
public class ProducerTest {
//    @Test
//    public void test() {
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "40.125.170.251:9092,40.125.170.251:9093,40.125.170.251:9094");
//        props.put("acks", "all");
//        props.put("retries", 0);
//        props.put("batch.size", 16384);
//        props.put("linger.ms", 1);
//        props.put("num.network.threads", 100);
//        props.put("num.io.threads", 32);
//        props.put("buffer.memory", 33554432);
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//
//        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
//        for (int i = 0; i < 1000; i++)
//            producer.send(new ProducerRecord<String, String>("test2", Integer.toString(i),
//                    "wukai" + i + Thread.currentThread().getName()));
//        producer.close();
//    }
}
