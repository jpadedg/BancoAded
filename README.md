🏦 Banco Aded — Java (Console / CLI)

Aplicação em Java (linha de comando) que simula operações básicas de uma conta bancária, incluindo saldo, depósitos, saques e gerenciamento de cheque especial.
Projeto desenvolvido para praticar fundamentos de Java, POO, validações e interação via terminal.

📌 Funcionalidades

- Criar conta bancária com nome do titular e limite de cheque especial

- Consultar saldo atual

- Realizar depósitos

- Realizar saques, considerando saldo + cheque especial

- Menu de Cheque Especial:

- Consultar limite liberado

- Consultar quanto do cheque especial está sendo utilizado

- Ajustar limite do cheque especial (com validações)

🧠 Regras de Negócio

O nome do titular não pode ser vazio

O limite do cheque especial não pode ser negativo

Depósitos e saques devem ser maiores que zero

Não é permitido sacar valores maiores que saldo + cheque especial

O limite do cheque especial não pode ser reduzido abaixo do valor já utilizado

🗂️ Estrutura do Projeto
src/
├── App.java
└── model/
    └── ContaBancaria.java


App.java → Interface com o usuário (menus e entrada de dados)

ContaBancaria.java → Regras de negócio e validações da conta

▶️ Como Executar (VS Code)
Pré-requisitos

Java JDK 11 ou superior

VS Code com as extensões:

Extension Pack for Java

Passos

Abra o VS Code

Vá em File → Open Folder e selecione a pasta do projeto

Abra o arquivo App.java

Clique em Run Java

O programa será executado no Terminal

🖥️ Menu Principal (Exemplo)
=== Bem vindo ao Banco Aded ===
1 - Criar conta
2 - Consultar saldo
3 - Depositar
4 - Sacar
5 - Cheque especial
6 - Sair

🧪 Conceitos Praticados

Classes e objetos

Encapsulamento

Construtores

Tratamento de exceções (IllegalArgumentException)

Estruturas de controle (switch, do-while)

Pacotes (package e import)

Entrada de dados com Scanner

Separação entre lógica de negócio e interface

🚀 Possíveis Evoluções

Leitura de entradas totalmente segura (sem nextInt() / nextDouble())

Formatação de valores monetários (R$)

Suporte a múltiplas contas

Persistência de dados (arquivo ou banco)

Testes unitários (JUnit)

📚 Contexto

Projeto desenvolvido como parte de estudos em Java durante um bootcamp, com foco em consolidar fundamentos da linguagem e boas práticas iniciais.
