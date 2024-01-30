# Descrição do projeto
Projeto de construção de uma API que registra categorias e produtos de uma empresa, ao adicionar ou atualizar um produto uma mensagem é publicada no serviço SNS/SQS para notificar outros serviços. 
Foram utilizadas as tecnologias AWS Simple Queue Service, Simple Notification Service, Mongo DB, e Java Spring Boot. 

Projeto finalizado

![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)

# Índice 
* [Descrição do projeto](#descrição-do-projeto)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
  * [Java](#java)
  * [MongoDB](#mongodb)
  * [Spring Boot](#spring)
  * [AWS](#aws)
* [Como Utilizar](#como-utilizar)

# Como utilizar
1. Clone o repositório: <br>
`git clone https://github.com/victor-hto/anota-ai.git`;

2. Instale as dependencias do Maven;
   
3. Crie dentro do arquivo application.properties as seguintes variaveis para conexão com a AWS e altere as variáveis com seus dados:
<br>`aws.region=us-east-1`<br>
`aws.accessKeyId=${AWS_KEY_ID}`<br>
`aws.secretKey=${AWS_SECRET}`<br>
`aws.sns.topic.catalog.arn=arn:aws:sns:us-east-1:123456789:catalog-emit`

4. Inicie a aplicação com o Maven;

5. O projeto pode ser acessado através do link: http://localhost:8080
