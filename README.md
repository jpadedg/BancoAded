# 🏦 Banco Aded — Java (Console / CLI)

Aplicação em **Java (linha de comando)** que simula operações básicas de uma conta bancária,
incluindo **saldo, depósitos, saques e gerenciamento de cheque especial**.

Projeto desenvolvido para praticar **fundamentos de Java, orientação a objetos e validações**.

---

## 📌 Funcionalidades

- Criar conta bancária com nome do titular e limite de cheque especial
- Consultar saldo atual
- Realizar depósitos
- Realizar saques considerando saldo + cheque especial
- Gerenciar cheque especial:
  - Consultar limite liberado
  - Consultar quanto do cheque especial está sendo utilizado
  - Ajustar limite do cheque especial

---

## 🧠 Regras de Negócio

- O nome do titular não pode ser vazio
- O limite do cheque especial não pode ser negativo
- Depósitos e saques devem ser maiores que zero
- Não é permitido sacar valores maiores que saldo + cheque especial
- O limite do cheque especial não pode ser reduzido abaixo do valor já utilizado

---

## 🗂️ Estrutura do Projeto

src/

├── App.java

└── model/

└── ContaBancaria.java


---

## ▶️ Como Executar (VS Code)

### Pré-requisitos
- Java JDK 11 ou superior
- VS Code com a extensão **Extension Pack for Java**

### Passos
1. Abra o VS Code
2. Selecione **File → Open Folder**
3. Abra a pasta do projeto
4. Abra o arquivo `App.java`
5. Clique em **Run Java**
6. O programa será executado no terminal

---

## 🖥️ Menu Principal (Exemplo)

=== Bem vindo ao Banco Aded ===
1 - Criar conta
2 - Consultar saldo
3 - Depositar
4 - Sacar
5 - Cheque especial
6 - Sair


---

## 🧪 Conceitos Praticados

- Classes e objetos
- Encapsulamento
- Construtores
- Tratamento de exceções
- Estruturas de controle (switch / do-while)
- Pacotes e imports
- Entrada de dados via Scanner
- Separação entre interface e regras de negócio

---

## 🚀 Possíveis Evoluções

- Leitura de entrada totalmente segura
- Formatação de valores monetários
- Suporte a múltiplas contas
- Persistência de dados
- Testes unitários

---

## 📚 Contexto

Projeto desenvolvido como parte de estudos em **Java**, com foco em consolidação dos fundamentos
da linguagem e boas práticas iniciais.

