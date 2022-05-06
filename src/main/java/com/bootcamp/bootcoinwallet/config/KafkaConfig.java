package com.bootcamp.bootcoinwallet.config;

import com.bootcamp.bootcoinwallet.model.BootCoinTnx;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.kafka.core.*;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {
  private static final String SERVER_URL = "192.168.0.121:29092";
    public ProducerFactory<String, BootCoinTnx> TransactionFactory(){
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, SERVER_URL);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(config);
    }
    @Bean(name = "transactionTemplate")
    public KafkaTemplate<String, BootCoinTnx> registationTemplate(){
        return new KafkaTemplate<>(TransactionFactory());
    }

    @Bean
    public ConsumerFactory<String, String> consumerFactory()
    {
        Map<String, Object> config = new HashMap<>();

        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, SERVER_URL);
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        return new DefaultKafkaConsumerFactory<>(config);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory concurrentKafkaListenerContainerFactory()
    {
        ConcurrentKafkaListenerContainerFactory<String,String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return  factory;
    }
}
