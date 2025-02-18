# Usa a imagem oficial do OpenJDK 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia todos os arquivos do projeto para dentro do contêiner
COPY . /app

# Expõe a porta que o Spring Boot usará
EXPOSE 8081

# Comando para rodar o projeto
CMD ["./mvnw", "spring-boot:run"]
