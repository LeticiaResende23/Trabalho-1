# Trabalho Prático 2 - Refatoração

**Universidade de Brasília (UnB)**
**Disciplina:** Técnicas de Programação para Plataformas Emergentes (TPPE)
**Grupo:** 3

## Integrantes

| Nome | Matrícula |
| :--- | :--- |
| Catlen Cleane Ferreira de Oliveira | 211031664 |
| Letícia Resende da Silva | 211031118 |
| Julia Vitoria Freire Silva | 211031083 |

## Descrição

Este diretório contém a **Etapa 2** do trabalho prático. O código original da Etapa 1 (TDD) foi refatorado aplicando as técnicas exigidas para o **Grupo 3**, visando melhorar a coesão e a organização do código sem alterar seu comportamento externo.

## Refatorações Aplicadas

Conforme o enunciado, foram aplicadas as seguintes operações de refatoração no pacote `brasileirao.modelo`:

### 1. Extrair Método (Extract Method)
* **Alvo:** `Time::compareTo`
* **O que foi feito:** A lógica de comparação (regras de desempate por pontos e vitórias) foi extraída do método `compareTo` para um método privado auxiliar chamado `compararPorPontosEVitorias`.
* **Benefício:** Melhorou a legibilidade do método principal de ordenação.

### 2. Substituir Método por Objeto-Método (Replace Method with Method Object)
* **Alvo:** `Time::registrarPartida`
* **O que foi feito:** A lógica de processamento dos resultados de um jogo (cálculo de pontos, vitórias, gols) foi retirada da classe `Time` e movida para uma nova classe dedicada chamada **`ProcessadorPartida`**.
* **Benefício:** Removeu a complexidade de cálculo da entidade principal, delegando a responsabilidade para uma classe especialista.

### 3. Extrair Classe (Extract Class)
* **Alvo:** Classe `Time`
* **O que foi feito:** Os atributos relacionados às estatísticas do time (`pontos`, `vitorias`, `golsMarcados`, `golsSofridos`) foram extraídos para uma nova classe chamada **`Desempenho`**.
* **Detalhes:** A classe `Time` passou a ter uma instância de `Desempenho` e seus métodos `get...` e `adicionar...` foram atualizados para delegar as chamadas para essa nova classe.
* **Benefício:** Aumentou a coesão da classe `Time`, separando a identidade do clube dos seus dados mutáveis de performance.

## Verificação e Testes

A integridade do sistema após as refatorações foi garantida pela execução da suíte de testes criada na Etapa 1.

* **Suíte de Testes:** `brasileirao.teste.AllTests`
* **Status:** Todos os testes passaram (Barra Verde), confirmando que as refatorações não introduziram bugs nem alteraram o comportamento esperado do sistema.