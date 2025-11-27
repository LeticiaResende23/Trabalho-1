# Trabalho Prático 1 - TDD

**Universidade de Brasília (UnB)**
**Disciplina:** Técnicas de Programação para Plataformas Emergentes (TPPE)

## Integrantes

| Nome | Matrícula |
| :--- | :--- |
| Catlen Cleane Ferreira de Oliveira | 211031664 |
| Letícia Resende da Silva | 211031118 |
| Julia Vitoria Freire Silva | 211031083 |

## Descrição

Este diretório contém a **Etapa 1** do trabalho prático. O objetivo desta etapa foi desenvolver a lógica de negócio de um sistema para o Campeonato Brasileiro Série A 2025 utilizando a metodologia **TDD (Test-Driven Development)**.

O projeto foi construído seguindo o ciclo **Red-Green-Refactor**, garantindo que cada funcionalidade fosse guiada por testes automatizados.

## Funcionalidades Implementadas

Conforme os requisitos do Trabalho Prático 1, o sistema é capaz de:

1.  **Gerenciamento de Times:**
    * Criação de times com seus atributos iniciais zerados.
    * Identificação única de times pelo nome.

2.  **Geração de Jogos (Campeonato):**
    * Geração automática de todos os confrontos do campeonato (Turno e Returno).
    * Garantia de que não existem jogos duplicados (mesmo mandante e visitante).
    * Garantia de que um time não joga contra si mesmo.

3.  **Sistema de Pontuação:**
    * Cálculo automático de pontos após o registro de uma partida:
        * **Vitória:** +3 pontos.
        * **Empate:** +1 ponto.
        * **Derrota:** +0 pontos.

4.  **Estatísticas e Classificação:**
    * Cálculo acumulativo de:
        * Número de vitórias.
        * Gols marcados.
        * Gols sofridos.
        * Saldo de gols.
    * **Critério de Desempate:** Ordenação da tabela de classificação primeiramente por **Pontos** e, em caso de empate, pelo **Número de Vitórias**.

## Testes Automatizados

A garantia da qualidade e o cumprimento dos requisitos são assegurados pela suíte de testes JUnit 5.

* **Suíte Principal:** `brasileirao.teste.AllTests` (Executa todos os testes abaixo em conjunto).
* **Testes Unitários:**
    * `TimeTest`: Verifica a criação, inicialização e atualização de status dos times.
    * `PartidaTest`: Verifica a criação correta de objetos de partida.
    * `CampeonatoTest`: Verifica a geração da grade de jogos (quantidade e regras de negócio).
    * `TabelaTest`: Verifica a lógica de ordenação e classificação dos times.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Testes:** JUnit 5
* **IDE:** Eclipse

---
*Este código representa o estado do projeto ao final da Etapa 1 (TDD), servindo de base para as refatorações aplicadas na Etapa 2.*