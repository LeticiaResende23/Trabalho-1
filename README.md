# Trabalho Prático - TPPE 2024/2

**Universidade de Brasília (UnB)**
**Faculdade de Ciências e Tecnologias em Engenharias (FCTE)**
**Disciplina:** Técnicas de Programação para Plataformas Emergentes (TPPE)

## Cenário: Campeonato Brasileiro 2025

Este repositório contém o desenvolvimento do Trabalho Prático da disciplina, focado no gerenciamento de um sistema para o Campeonato Brasileiro Série A. O projeto é dividido em etapas incrementais que aplicam diferentes técnicas de engenharia de software modernas.

## Grupo 3

| Nome | Matrícula |
| :--- | :--- |
| Catlen Cleane Ferreira de Oliveira | 211031664 |
| Letícia Resende da Silva | 211031118 |
| Julia Vitoria Freire Silva | 211031083 |

---

## Estrutura do Repositório

O trabalho está organizado em diretórios correspondentes a cada etapa de entrega, permitindo a visualização da evolução do código:

### 🔹 [Parte 1: TDD (Test-Driven Development)](./parte1)
> **Diretório:** `/parte1`

Nesta etapa, foi desenvolvida a lógica base da aplicação utilizando **TDD**. O foco foi garantir a corretude das funcionalidades principais (geração de partidas, pontuação, critérios de desempate) através de testes unitários rigorosos antes da implementação do código.
* **Ciclo utilizado:** Red-Green-Refactor.
* **Artefatos:** Código funcional original e suíte completa de testes.

### 🔹 [Parte 2: Refatoração](./parte2)
> **Diretório:** `/parte2`

Nesta etapa, foram aplicadas técnicas de **Refatoração** sobre o código da Parte 1 para melhorar seu design, legibilidade e manutenção, sem alterar o comportamento externo (garantido pelos testes da etapa anterior).
* **Operações Aplicadas (Grupo 3):**
    1.  **Extrair Método:** `Time::compareTo`
    2.  **Substituir Método por Objeto-Método:** `Time::registrarPartida` &rarr; `ProcessadorPartida`
    3.  **Extrair Classe:** `Time` &rarr; `Desempenho`

---

## Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Testes:** JUnit 5
* **IDE Recomendada:** Eclipse

## Como Executar

Cada pasta (`parte1` e `parte2`) funciona como um projeto Java/Eclipse independente.

1.  Clone este repositório.
2.  No Eclipse, vá em `File > Open Projects from File System...`.
3.  Selecione a pasta da etapa desejada (`parte1` ou `parte2`).
4.  Execute a classe `AllTests.java` localizada no pacote de testes para verificar o funcionamento.
