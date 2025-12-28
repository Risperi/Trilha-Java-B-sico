# 📌 Desafio Controle de Fluxo – Java

Este projeto foi desenvolvido como parte do **Desafio de Controle de Fluxo** em Java, com o objetivo de praticar conceitos fundamentais da linguagem, como entrada de dados, estruturas de repetição, tratamento de exceções e criação de exceções personalizadas.

---

## 🧠 Descrição do Desafio

O sistema recebe **dois números inteiros via terminal** e realiza uma contagem baseada na diferença entre eles.

### Regras:
- O segundo parâmetro deve ser **maior que o primeiro**
- Caso contrário, o sistema lança uma **exceção personalizada**
- Se os parâmetros forem válidos, o programa imprime no console uma sequência numérica usando um laço `for`

---

## ⚙️ Tecnologias Utilizadas

- Java
- Scanner (entrada de dados)
- Estrutura de repetição `for`
- Tratamento de exceções (`try / catch`)
- Exceção personalizada

---

## 📂 Estrutura do Projeto

DesafioControleFluxo

└── src

└── Contador

├── contador.java

└── ParametrosInvalidosException.java

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git

2. Abra o projeto em uma IDE Java (Eclipse, IntelliJ ou VS Code)

3. Execute a classe contador.java

4. Insira os valores solicitados no terminal
```
✅ Exemplo de Execução Válida

Entrada:

Digite o primeiro parâmetro
12
Digite o segundo parâmetro
30


Saída:

Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 18

❌ Exemplo de Execução Inválida

Entrada:

Digite o primeiro parâmetro
30
Digite o segundo parâmetro
12


Saída:

O segundo parâmetro deve ser maior que o primeiro

## 🚀 Aprendizados

Uso correto de estruturas de controle de fluxo

Criação e lançamento de exceções personalizadas

Boas práticas de organização de código em Java

Leitura de dados pelo terminal

## 👨‍💻 Autor

André Thiago
Estudante de Análise e Desenvolvimento de Sistemas
Foco em Backend e Java ☕

📄 Licença

Este projeto é de uso educacional.
