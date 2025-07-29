# Springboot-Jpa-Hibernate-Web-Api

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Diego-Cruz-github/webservice-spboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Este é um projeto de backend Spring Boot Java que implementa um modelo de domínio UML detalhado, abrangendo entidades de negócio complexas e seus respectivos relacionamentos. A arquitetura do projeto é cuidadosamente estruturada em camadas lógicas (resources, services, repositories), seguindo as melhores práticas de desenvolvimento.

* **Resources:** Camada responsável por expor os endpoints da API RESTful e receber as requisições HTTP.
* **Services:** Camada que contém a lógica de negócios da aplicação, realizando as operações necessárias e interagindo com a camada de repositórios.
* **Repositories:** Camada que abstrai o acesso ao banco de dados, utilizando o JPA/Hibernate para persistir e recuperar os dados.

- O projeto também implementa tratamento de exceções robusto e inclui testes de unidade e de integração, garantindo a qualidade e a confiabilidade da aplicação.

## Funcionalidades Principais

* **Controladores REST:** A API RESTful expõe endpoints bem definidos para interagir com as entidades do domínio.
* **Persistência de Dados:** O projeto utiliza o Hibernate para mapear as entidades Java para um banco de dados relacional, permitindo a criação automática do esquema do banco de dados e a persistência dos dados.
* **População Inicial:** A base de dados é populada com dados de exemplo durante a inicialização da aplicação, facilitando os testes e a demonstração das funcionalidades.
* **CRUD Completo:** A API oferece operações completas de Create, Read, Update e Delete (CRUD) para todas as entidades do domínio.
* **Tratamento de Exceções:** O projeto implementa um tratamento de exceções robusto, garantindo que os erros sejam tratados de forma adequada e que as respostas da API sejam informativas.
* **Testes:** O projeto inclui testes de unidade e de integração, utilizando o banco de dados H2 para testes em memória.

## Modelo conceitual
![Domain Model](https://github.com/Diego-Cruz-github/webservice-spboot3-jpa/blob/23ffbee3bc47c67a07f5af7e8cce7decd0c2f96b/Captura%20de%20tela%202025-03-19%20004822.png)
![Domain Instance](https://github.com/Diego-Cruz-github/webservice-spboot3-jpa/blob/23ffbee3bc47c67a07f5af7e8cce7decd0c2f96b/Captura%20de%20tela%202025-03-19%20005317.png)
![Logical Layers](https://github.com/Diego-Cruz-github/webservice-spboot3-jpa/blob/23ffbee3bc47c67a07f5af7e8cce7decd0c2f96b/Captura%20de%20tela%202025-03-19%20005347.png)


# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Apache
- H2 Database
- Postman
- UML

- ## Como executar o projeto

1.  **Clone o repositório:**

    ```bash
    git clone [https://github.com/Diego-Cruz-github/webservice-spboot3-jpa.git](https://github.com/Diego-Cruz-github/webservice-spboot3-jpa.git)
    ```

2.  **Navegue até o diretório do projeto:**

    ```bash
    cd springboot-jpa-hibernate-api
    ```

    * **Observação:** Substitua `springboot-jpa-hibernate-api` pelo nome correto da pasta do seu projeto, caso seja diferente.

3.  **Execute o projeto com Maven:**

    ```bash
    ./mvnw spring-boot:run
    ```

4.  **A API estará disponível em `http://localhost:8080`.**

5.  **Banco de Dados:**

    * A aplicação utiliza o banco de dados H2 para testes em memória.
    * **Importante:** Em um ambiente de produção, um banco de dados externo (como PostgreSQL, MySQL, etc.) deve ser configurado no arquivo `application.properties` ou `application.yml`. Configure as propriedades de conexão adequadamente.

6.  **Testes com Postman:**

    * Utilize o Postman para testar os endpoints da API.
    * Importe a coleção do Postman (se disponível) para facilitar os testes.
    * Realize requisições para os endpoints REST para verificar as funcionalidades da API.

**Observações Adicionais:**

* **Arquivo `application.properties` ou `application.yml`:**
    * Verifique o arquivo de configuração para quaisquer propriedades adicionais que precisem ser configuradas, como variáveis de ambiente ou configurações de segurança.

* **Coleção do Postman:**
    * Se você tiver uma coleção do Postman pronta para uso, considere adicionar um link para ela no README para facilitar a vida de quem for testar a API.
 
      ## Endpoints da API

* **GET /products:** Retorna uma lista de todos os produtos.
    * Exemplo de requisição: `http://localhost:8080/products`
    * Exemplo de resposta: `[{"id": 1, "name": "Produto 1", ...}, {"id": 2, "name": "Produto 2", ...}]`

* **POST /orders:** Cria um novo pedido.
    * Exemplo de requisição:
        ```json
        {
            "userId": 1,
            "items": [{"productId": 1, "quantity": 2}]
        }
        ```
    * Exemplo de resposta: `{"id": 1, "userId": 1, "items": [{"productId": 1, "quantity": 2}], "status": "PENDING"}`

* **GET /orders/{id}:** Retorna um pedido específico pelo ID.
    * Exemplo de requisição: `http://localhost:8080/orders/1`
    * Exemplo de resposta: `{"id": 1, "userId": 1, "items": [{"productId": 1, "quantity": 2}], "status": "PENDING"}`


## 👨‍💻 Autor
**Diego Fonte**  
📌 [LinkedIn](https://www.linkedin.com/in/diegof90)

