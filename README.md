# CRUD de Contatos

Este projeto é uma aplicação Java para gerenciar contatos, permitindo operações de criação, leitura, atualização e exclusão (CRUD) utilizando banco de dados MySQL.

![java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![mysql](https://img.shields.io/badge/mysql-%234ea94b.svg?style=for-the-badge&logo=mysql&logoColor=white)

## 📹 Vídeo de Execução do CRUD

Assista ao vídeo de execução do CRUD clicando no link abaixo:

[Assistir vídeo no LinkedIn](https://www.linkedin.com/feed/update/urn:li:activity:7304919383103971329/)


## 🚀 Começando

Aqui estão as instruções para executar o projeto localmente.

### Pré-requisitos

Antes de executar o projeto, você precisará ter os seguintes programas instalados:

- **Java JDK 20**: Necessário para compilar e executar o código Java. Versões anteriores podem não ser compatíveis.
- **MySQL**: Para o banco de dados do projeto.
- **XAMPP ou WAMP**: Para executar o servidor MySQL e Apache localmente.

### Clonando o Repositório

Para começar, clone o repositório para o seu ambiente local:


git clone https://github.com/levyycarlo/crud-contacts.git


### Configuração do Banco de Dados

1. Certifique-se de ter o MySQL instalado e em execução.
2. Caso esteja utilizando **XAMPP** ou **WAMP**, inicie o servidor Apache e o MySQL.
3. Execute o script `script.sql` localizado na pasta `resources/` para criar o banco de dados e a tabela de contatos.

### Compilando e Executando o Projeto

1. Navegue até o diretório do projeto:

```bash
cd crud-contacts/crud_java
```

2. Compile o projeto:

```bash
javac -cp .:resources/mysql-connector-j-9.2.0.jar SRC/br/com/agenda/aplicacao/Main.java
```

3. **Execute o código principal**:

Para rodar a aplicação, execute o arquivo `Main.java`, que é o código principal do projeto:

```bash
java -cp .:resources/mysql-connector-j-9.2.0.jar SRC.br.com.agenda.aplicacao.Main
```

Esse comando inicia a execução da aplicação, permitindo realizar as operações de CRUD com os contatos.

## 📍 Funcionalidades

- **Adicionar Contato**: Permite adicionar um novo contato 
- **Listar Contatos**: Exibe uma lista de todos os contatos cadastrados.
- **Atualizar Contato**: Possibilita a atualização das informações de um contato existente.
- **Excluir Contato**: Permite remover um contato da lista.

## 📝 Documentações que podem ajudar

Aqui estão algumas documentações que podem ajudar a entender melhor como usar e configurar o projeto:

- [MySQL Documentation](https://dev.mysql.com/doc/) - Para aprender como criar e gerenciar bancos de dados, tabelas e executar comandos SQL básicos.
- [JDBC (Java Database Connectivity)](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/) - Documentação sobre como configurar a conexão entre Java e MySQL, além de realizar operações CRUD no banco de dados.
- [Git Documentation](https://git-scm.com/doc) - Para entender como usar o Git para clonar o repositório, trabalhar com branches e enviar contribuições através de pull requests.
- [Java Documentation](https://docs.oracle.com/en/java/) - Para aprender sobre a linguagem Java, suas bibliotecas e recursos para trabalhar com banco de dados, entrada/saída, exceções e muito mais

## 🤝 Contribuição

Contribuições são bem-vindas! Caso tenha algum feedback ou sugestão, entre em contato diretamente.

## Autor

Desenvolvido por Levy Carlo 👨🏽‍💻

Você pode me encontrar nas redes sociais ou me contactar por e-mail:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/levy-carlo-798497222/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:levycrp3@gmail.com)
