# Kafka Java Microservices Example

This project demonstrates a simple microservices architecture using Apache Kafka with Java. It includes a producer service and a consumer service that communicate through Kafka. Each service runs in its own Docker container. Kafka and Zookeeper are also containerized and orchestrated using Docker Compose.

## Project Structure

```text
kafka-java-microservices/
├── docker-compose.yml              # Coordinates Kafka, Zookeeper, producer and consumer containers
├── producer-service/
│   ├── Dockerfile                  # Defines Docker image for producer
│   ├── pom.xml                     # Maven build file
│   └── src/main/java/com/example/ProducerApp.java
├── consumer-service/
│   ├── Dockerfile                  # Defines Docker image for consumer
│   ├── pom.xml                     # Maven build file
│   └── src/main/java/com/example/ConsumerApp.java
```

## Technologies Used

- Java 17
- Apache Kafka
- Docker & Docker Compose
- Maven

## How It Works

1. The producer service sends messages to a Kafka topic.
2. The consumer service subscribes to the topic and prints received messages.
3. Kafka and Zookeeper are launched using Docker Compose.

## Getting Started

### 1. Prerequisites

Ensure the following tools are installed:

- Docker
- Docker Compose

### 2. Clone the Repository

```bash
git clone https://github.com/MehdiEsedov1/Microservices-Architecture-Example.git
cd Microservices-Architecture-Example/kafka-java-microservices
```

### 3. Start the Services

```bash
docker-compose up --build
```

This will start the following containers:

- Kafka broker
- Zookeeper
- Producer service
- Consumer service

### 4. Expected Output

You will see messages continuously produced and consumed in the terminal logs.

## Kafka Configuration

- **Topic Name**: `demo-topic`
- **Example Message**: `"Hello from Producer!"`

## Useful Commands

Stop containers:

```bash
docker-compose down
```

View service logs:

```bash
docker-compose logs -f producer
docker-compose logs -f consumer
```

## Folder Descriptions

| Path                 | Description                       |
|----------------------|-----------------------------------|
| `docker-compose.yml` | Docker Compose configuration file |
| `producer-service/`  | Kafka message producer in Java    |
| `consumer-service/`  | Kafka message consumer in Java    |

## Possible Extensions

- Add REST endpoints to control message flow
- Convert services to Spring Boot
- Add error handling and retry logic
- Enable dynamic topic management
