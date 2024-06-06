# CRUD e Tratamento de Exceções

Este é um projeto desenvolvido em Spring Boot com Java, utilizando o banco de dados H2 para implementar um CRUD completo de web services REST para acessar recursos de clientes. O Maven é utilizado como gerenciador de dependência.

Este sistema foi criado como parte de um desafio do curso Java Spring Professional e faz parte da avaliação para conclusão do curso.



## Funcionalidades

O sistema oferece as seguintes operações básicas através de web services REST:

- Busca paginada de recursos de clientes
- Busca de recurso de cliente por ID
- Inserção de novo recurso de cliente
- Atualização de recurso de cliente
- Remoção de recurso de cliente



## Tratamento de Exceções

O projeto trata as seguintes exceções:

- Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.

- Erro de validação, retornando código 422 e mensagens customizadas para cada campo inválido. As regras de validação são:

  - Nome: não pode ser vazio

  - Data de nascimento: não pode ser data futura

    

## Tecnologias Utilizadas

* Spring Boot: Framework para criação de aplicativos em Java.

* H2 Database: Banco de dados em memória para desenvolvimento e testes.

* Maven: Gerenciador de dependência para o projeto.



## Competências avaliadas

* Implementação de operações de CRUD

* Tratamento de exceções

* Customização de respostas HTTP

* Validação de dados com Bean Validation



## Contato

[Linkedin ](https://www.linkedin.com/in/pativilaka/)