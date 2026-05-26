# 🚗 Motor de Precificação Dinâmica

Projeto desenvolvido para a disciplina de **Análise e Projeto de Software (APS)**, com foco na aplicação de **padrões de projeto GoF**, **princípios SOLID**, **GRASP**, **arquitetura em camadas** e **testes automatizados com JUnit**.

---

## 📌 Objetivo

O projeto simula um **motor de precificação dinâmica de corridas**, semelhante a aplicativos de mobilidade (ex: Uber), onde o valor final da corrida pode variar de acordo com fatores externos, como:

- 🌧️ Condição climática (chuva)
- 🚦 Horário de pico
- 🚘 Tipo de tarifa

O sistema foi desenvolvido visando **baixo acoplamento**, **alta coesão**, **facilidade de manutenção** e **escalabilidade**, seguindo boas práticas de Engenharia de Software.

---

## 🏛 Arquitetura

O sistema segue o padrão de **Arquitetura em Camadas (Layered Architecture)**:

```text
Controller
    ↓
Service / Domain
    ↓
Model / Decorators
```

### Camadas

- **Controller** → responsável por receber requisições e controlar o fluxo da aplicação.
- **Service/Domain** → responsável pelas regras de negócio e cálculos.
- **Model** → representação das entidades do domínio.
- **Decorator** → aplicação dinâmica de regras de precificação.

---

## 🧩 Padrões de Projeto Aplicados (GoF)

### 1. Structural Pattern — Decorator

O padrão **Decorator** foi utilizado para adicionar regras de precificação dinamicamente, sem alterar o código existente.

### Decorators implementados:

- `ChuvaDecorator`
- `PicoDecorator`

Exemplo de composição:

```text
TarifaBase
     ↓
ChuvaDecorator
     ↓
PicoDecorator
```

Isso permite adicionar novas regras no futuro, como:

- `FeriadoDecorator`
- `CarnavalDecorator`
- `DescontoDecorator`

sem modificar classes existentes.

---

## ⚙️ Princípios SOLID Aplicados

### SRP — Single Responsibility Principle

Cada classe possui apenas uma responsabilidade.

Exemplo:

- `Pedido` → armazena dados
- `ChuvaDecorator` → aplica taxa de chuva
- `PicoDecorator` → aplica taxa de horário de pico

---

### OCP — Open/Closed Principle

O sistema está aberto para extensão e fechado para modificação.

Novas regras de preço podem ser adicionadas sem alterar o código existente.

---

### DIP — Dependency Inversion Principle

O sistema depende de abstrações (`Tarifa`) ao invés de implementações concretas.

---

## 🧠 Padrões GRASP Aplicados

### Information Expert

A classe `Pedido` é responsável por armazenar informações relevantes para a precificação da corrida, como:

- distância
- condição climática
- horário de pico

---

### Controller

A classe `PrecificacaoController` atua como ponto de entrada do sistema, orquestrando o fluxo de execução.

---

## 🧪 Testes Automatizados

O projeto utiliza **JUnit 5** para testes unitários.

### Testes implementados:

✅ Tarifa base  
✅ Tarifa com chuva  
✅ Tarifa com horário de pico  
✅ Tarifa com chuva + pico

Exemplo validado:

```text
R$20
→ chuva (+15%)
→ pico (+25%)

Resultado: R$28,75
```

---

## 📂 Estrutura do Projeto

```text
src
│
├── controller
│   └── PrecificacaoController.java
│
├── model
│   └── Pedido.java
│
├── decorator
│   ├── Tarifa.java
│   ├── TarifaBase.java
│   ├── TarifaDecorator.java
│   ├── ChuvaDecorator.java
│   └── PicoDecorator.java
│
├── test
│   └── TarifaTest.java
│
└── Main.java
```

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **JUnit 5**
- **IntelliJ IDEA**
- **Git & GitHub**

---

## ▶️ Como Executar

### 1. Clone o repositório

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Abra no IntelliJ IDEA

Abra o projeto normalmente pelo IntelliJ.

### 3. Execute o sistema

Abra:

```text
Main.java
```

e clique em:

```text
Run Main
```

### 4. Executar testes

Abra:

```text
TarifaTest.java
```

e execute:

```text
Run TarifaTest
```

---

## 👥 Equipe

Projeto desenvolvido para a disciplina de **Arquitetura e Projeto de Software (APS)**.

**Integrantes do grupo:**

- João Pedro
- Maria Clara
- Maria Luiza
- Jhon Victor

---

## 📖 Considerações Finais

O projeto foi desenvolvido com foco na aplicação prática de conceitos de **Engenharia de Software**, demonstrando o uso de padrões arquiteturais, princípios SOLID, GRASP, testes automatizados e refatoração orientada a objetos para construção de um sistema modular e escalável.
