CREATE DATABASE  IF NOT EXISTS `sistema_venda` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sistema_venda`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema_venda
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alteracao_preco`
--

DROP TABLE IF EXISTS `alteracao_preco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alteracao_preco` (
  `id_alteracao_preco` int NOT NULL AUTO_INCREMENT,
  `preco_novo` decimal(10,2) DEFAULT NULL,
  `preco_antigo` decimal(10,2) DEFAULT NULL,
  `id_produto` int NOT NULL,
  PRIMARY KEY (`id_alteracao_preco`),
  KEY `id_produto` (`id_produto`),
  CONSTRAINT `alteracao_preco_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alteracao_preco`
--

LOCK TABLES `alteracao_preco` WRITE;
/*!40000 ALTER TABLE `alteracao_preco` DISABLE KEYS */;
INSERT INTO `alteracao_preco` VALUES (1,11.50,8.99,1),(2,5.00,11.50,1),(3,33.00,25.00,4),(4,29.99,33.00,4),(5,5.99,7.99,2),(6,29.90,25.00,6),(7,29.99,29.99,4),(8,5.99,5.99,2),(9,29.90,29.90,6);
/*!40000 ALTER TABLE `alteracao_preco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atendente`
--

DROP TABLE IF EXISTS `atendente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `atendente` (
  `id_atendente` int NOT NULL AUTO_INCREMENT,
  `matricula` varchar(45) DEFAULT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  `id_pessoa` int NOT NULL,
  PRIMARY KEY (`id_atendente`),
  KEY `id_pessoa` (`id_pessoa`),
  CONSTRAINT `atendente_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atendente`
--

LOCK TABLES `atendente` WRITE;
/*!40000 ALTER TABLE `atendente` DISABLE KEYS */;
INSERT INTO `atendente` VALUES (1,'A001',2500.00,'A',1),(2,'A002',3000.00,'A',2),(3,'A003',2800.00,'A',3),(4,'A004',3200.00,'A',4),(5,'A005',2700.00,'A',5);
/*!40000 ALTER TABLE `atendente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `auditoria_pessoa`
--

DROP TABLE IF EXISTS `auditoria_pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auditoria_pessoa` (
  `id_auditoria` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_auditoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auditoria_pessoa`
--

LOCK TABLES `auditoria_pessoa` WRITE;
/*!40000 ALTER TABLE `auditoria_pessoa` DISABLE KEYS */;
/*!40000 ALTER TABLE `auditoria_pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id_categoria` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Bebidas'),(2,'Sorvetes'),(3,'Alimentos'),(4,'Biscoito'),(5,'Balas');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `telefone` varchar(45) DEFAULT NULL,
  `saldo` decimal(10,2) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  `id_pessoa` int NOT NULL,
  PRIMARY KEY (`id_cliente`),
  KEY `id_pessoa` (`id_pessoa`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'999999999',100.00,'joão@exemplo.com','A',10),(2,'888888888',200.00,'maria@exemplo.com','A',11),(3,'777777777',150.00,'carlos@exemplo.com','A',12),(4,'666666666',300.00,'ana@exemplo.com','A',13),(5,'555555555',50.00,'rafael@exemplo.com','A',14);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_venda`
--

DROP TABLE IF EXISTS `item_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_venda` (
  `id_item_venda` int NOT NULL AUTO_INCREMENT,
  `quantidade` int DEFAULT NULL,
  `preco` decimal(10,2) DEFAULT NULL,
  `total_bruto` decimal(10,2) DEFAULT NULL,
  `desconto` decimal(10,2) DEFAULT NULL,
  `acrescimo` decimal(10,2) DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `cancelado` char(1) DEFAULT NULL,
  `id_produto` int NOT NULL,
  `id_venda` int NOT NULL,
  PRIMARY KEY (`id_item_venda`),
  KEY `id_produto` (`id_produto`),
  KEY `id_venda` (`id_venda`),
  CONSTRAINT `item_venda_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`),
  CONSTRAINT `item_venda_ibfk_2` FOREIGN KEY (`id_venda`) REFERENCES `venda` (`id_venda`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_venda`
--

LOCK TABLES `item_venda` WRITE;
/*!40000 ALTER TABLE `item_venda` DISABLE KEYS */;
INSERT INTO `item_venda` VALUES (1,3,8.99,26.97,0.00,0.00,26.97,'N',1,1),(2,5,25.00,125.00,5.00,0.00,120.00,'S',4,1),(3,5,25.00,125.00,0.00,0.00,125.00,'N',4,3),(4,7,25.00,175.00,0.00,0.00,175.00,'N',6,3),(5,2,12.00,24.00,0.00,0.00,24.00,'S',8,3),(12,2,5.00,10.00,0.00,0.00,10.00,'N',1,3),(13,2,29.99,59.98,0.00,0.00,59.98,'N',4,3),(14,2,29.99,59.98,0.00,0.00,59.98,'N',4,3),(15,2,29.99,59.98,0.00,0.00,59.98,'N',4,3),(16,2,29.99,59.98,0.00,0.00,59.98,'N',4,3),(17,2,29.99,59.98,0.00,0.00,59.98,'N',4,3),(18,20,5.99,119.80,0.00,0.00,119.80,'N',2,3),(19,3,5.00,15.00,0.00,0.00,15.00,'S',1,4),(20,3,5.00,15.00,0.00,0.00,15.00,'N',1,4),(21,1,5.00,5.00,0.00,0.00,5.00,'S',1,4),(22,1,5.00,5.00,0.00,0.00,5.00,'S',1,4),(23,1,5.00,5.00,0.00,0.00,5.00,'N',1,4),(24,1,5.00,5.00,0.00,0.00,5.00,'N',1,4),(25,1,5.00,5.00,0.00,0.00,5.00,'N',1,4),(26,1,5.00,5.00,0.00,0.00,5.00,'N',1,4),(27,1,5.00,5.00,0.00,0.00,5.00,'N',1,4),(28,1,5.00,5.00,0.00,0.00,5.00,'N',1,4);
/*!40000 ALTER TABLE `item_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoa` (
  `id_pessoa` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `idade` int DEFAULT NULL,
  `cpf_cnpj` int DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,'João Silva',30,123456789,'A'),(2,'Maria Oliveira',25,987654321,'A'),(3,'Carlos Santos',40,111222333,'A'),(4,'Ana Paula',35,555666777,'A'),(5,'Rafael Lima',28,999888777,'A'),(6,'Ana Costa',28,112234556,'A'),(7,'Pedro Santos',35,223344556,'A'),(8,'Luiza Almeida',22,33445569,'A'),(9,'Roberto Lima',45,445566770,'A'),(10,'Fernanda Rocha',32,556788901,'A'),(11,'Mariana Dias',27,667789012,'A'),(12,'Ricardo Pinto',50,778899123,'A'),(13,'Juliana Martins',29,889901234,'A'),(14,'Fábio Nascimento',38,990022345,'A'),(15,'Tatiane Ferreira',31,101113141,'A'),(16,'Herminio',35,1521561561,'A'),(17,'Marcos',43,123131231,'A'),(18,'Ana',33,213123123,'A'),(19,'Adriano',33,23423423,'B'),(20,'Andreia',23,242,'A'),(21,'Marcio Ribeiro',36,12121516,'I'),(22,'Ana Clara Soares',45,64181564,'A'),(23,'Maria Oliveira',25,324242432,'A'),(24,'João Pedro Silva',21,432423423,'A');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id_produto` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(45) DEFAULT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  `preco` decimal(10,2) DEFAULT NULL,
  `situacao` varchar(45) DEFAULT NULL,
  `id_categoria` int NOT NULL,
  `quantidade_estoque` int DEFAULT NULL,
  PRIMARY KEY (`id_produto`),
  KEY `id_categoria` (`id_categoria`),
  CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'P001','Coca Cola 2L',5.00,'A',1,80),(2,'P002','Fanta Uva 2L',5.99,'A',1,100),(3,'P003','Mineiro 2L',5.99,'A',1,99),(4,'P004','Sorvete Kibon',29.99,'A',2,100),(5,'P009','Sorvete Nestle',20.00,'A',2,33),(6,'P005','Arroz Italianão',29.90,'A',3,200),(7,'P006','Biscoito PassaTempo',3.99,'A',4,66),(8,'P007','Bala Freegells/Com 50',12.00,'A',5,99);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `id_venda` int NOT NULL AUTO_INCREMENT,
  `total_bruto` decimal(10,2) NOT NULL,
  `desconto` decimal(10,2) DEFAULT NULL,
  `acrescimo` decimal(10,2) DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `situacao` char(1) DEFAULT NULL,
  `id_cliente` int NOT NULL,
  `id_atendente` int NOT NULL,
  `numero_cupom` int DEFAULT NULL,
  PRIMARY KEY (`id_venda`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_atendente` (`id_atendente`),
  CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  CONSTRAINT `venda_ibfk_2` FOREIGN KEY (`id_atendente`) REFERENCES `atendente` (`id_atendente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,26.97,0.00,0.00,26.97,'P',1,1,1),(3,729.90,0.00,0.00,729.90,'P',2,2,2),(4,45.00,0.00,0.00,45.00,'P',1,2,3);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

CREATE TABLE login(
	id_login INT PRIMARY KEY AUTO_INCREMENT,
    usuario VARCHAR(45) NOT NULL,
    senha VARCHAR(45) NOT NULL,
    situacao CHAR(1) NOT NULL
);

INSERT INTO login(usuario, senha, situacao) VALUES
("admin", "12345", "A");
SELECT * FROM login;
UPDATE login SET senha = UPPER(MD5(MD5(MD5(MD5(MD5("12345")))))) WHERE id_login = 1 AND usuario = "admin";

-- Dump completed on 2024-11-21  8:26:46
USE sistema_venda;
SELECT * FROM produto;
SELECT * FROM pessoa;
SELECT * FROM cliente;
SELECT * FROM atendente;
SELECT * FROM categoria;
SELECT * FROM item_venda;
SELECT * FROM venda;
SELECT * FROM tb_item_venda;

SELECT * FROM categoria ORDER BY id_categoria DESC;

CREATE VIEW tb_item_venda AS
SELECT 
v.id_venda AS codigo, 
pr.descricao AS produto, 
pr.preco, 
iv.quantidade, 
iv.valor_total AS total, 
pa.nome AS atendente, 
pc.nome AS cliente, 
iv.cancelado 
FROM item_venda iv 
INNER JOIN venda v ON v.id_venda = iv.id_venda 
INNER JOIN cliente c ON c.id_cliente = v.id_cliente 
INNER JOIN pessoa pc ON pc.id_pessoa = c.id_pessoa 
INNER JOIN atendente a ON a.id_atendente = v.id_atendente 
INNER JOIN pessoa pa ON pa.id_pessoa = a.id_pessoa 
INNER JOIN produto pr ON pr.id_produto = iv.id_produto