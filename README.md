## kafka-spring-cloud-stream-example

Apache-Kafka Binary Distribution from  https://kafka.apache.org/downloads.

##### Start Zookeeper server
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

##### Start Kafka server
.\bin\windows\kafka-server-start.bat .\config\server.properties

##### Create Topic
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic topickafka

##### List down all available topics
kafka-topics.bat --list --zookeeper localhost:2181

##### Produce a message
kafka-console-producer.bat --broker-list localhost:9092 --topic topickafka

##### Consume a message
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topickafka
