
# Cadastro de Produtos - API REST

Este projeto implementa uma **API REST** para o gerenciamento de um cadastro de produtos, utilizando **Spring Boot**. A aplicação permite as operações básicas de **CRUD** (Criar, Listar, Atualizar e Remover) para produtos, com validação de dados para garantir a integridade dos registros.

---

## Tecnologias Utilizadas

- **Java 17** (ou superior)
- **Spring Boot 2.x**
  - **Spring Web** para a criação da API REST
  - **Spring Data JPA** para persistência de dados
  - **Spring Validation** para validação de campos
- **Banco de Dados H2 (em memória)** para desenvolvimento e testes
- **Maven** como gerenciador de dependências

---

## Funcionalidades da API

Esta aplicação permite realizar as seguintes operações com produtos:

1. **Cadastrar um novo produto** (POST)
2. **Listar todos os produtos** (GET)
3. **Atualizar um produto existente** (PUT)
4. **Remover um produto** (DELETE)

A API também garante que os dados estejam validados antes de serem armazenados:

- **Preço** não pode ser negativo
- **Quantidade em estoque** não pode ser menor que zero
- **Nome do produto** não pode ser vazio

---

## Como Rodar a Aplicação

### Pré-requisitos

1. **JDK 17** ou superior
2. **Maven** (opcional, caso não queira usar o Maven Wrapper)

### Passos para rodar a aplicação

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/cadastro-produtos.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd cadastro-produtos
   ```

3. Compile o projeto utilizando o Maven:

   ```bash
   mvn clean install
   ```

4. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```

5. A API estará disponível no endereço: `http://localhost:8080`

---

## EndPoints da API

### 1. Criar um Produto

- **Método**: `POST`
- **URL**: `/produtos`
- **Corpo da requisição (JSON)**:

   ```json
   {
     "nome": "Produto Exemplo",
     "preco": 99.99,
     "quantidadeEmEstoque": 50
   }
   ```

- **Resposta (sucesso)**:

   ```json
   {
     "id": 1,
     "nome": "Produto Exemplo",
     "preco": 99.99,
     "quantidadeEmEstoque": 50
   }
   ```

### 2. Listar Todos os Produtos

- **Método**: `GET`
- **URL**: `/produtos`
- **Resposta**:

   ```json
   [
     {
       "id": 1,
       "nome": "Produto Exemplo",
       "preco": 99.99,
       "quantidadeEmEstoque": 50
     },
     {
       "id": 2,
       "nome": "Produto Outro",
       "preco": 29.99,
       "quantidadeEmEstoque": 20
     }
   ]
   ```

### 3. Atualizar um Produto

- **Método**: `PUT`
- **URL**: `/produtos/{id}`
- **Corpo da requisição (JSON)**:

   ```json
   {
     "nome": "Produto Atualizado",
     "preco": 109.99,
     "quantidadeEmEstoque": 40
   }
   ```

- **Resposta (sucesso)**:

   ```json
   {
     "id": 1,
     "nome": "Produto Atualizado",
     "preco": 109.99,
     "quantidadeEmEstoque": 40
   }
   ```

### 4. Remover um Produto

- **Método**: `DELETE`
- **URL**: `/produtos/{id}`
- **Resposta**:
  - **Código HTTP 204 (No Content)** quando o produto for removido com sucesso.

---

## Banco de Dados H2

Esta aplicação utiliza um banco de dados **H2** em memória, que é útil para desenvolvimento e testes rápidos.

Você pode acessar o **console do H2** para visualizar os dados diretamente através da URL:

- **URL do Console H2**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: `password`








