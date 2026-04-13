
# 🏠 Sistema de Casa Inteligente (Smart Home)

Este projeto foi desenvolvido como parte de um exercício acadêmico com o objetivo de praticar os conceitos de **Programação Orientada a Objetos em Java**, com foco em **interfaces**, **classes abstratas** e **múltiplos contratos de comportamento**.

---

## 🎯 Objetivo do Projeto

Simular um sistema básico de **Casa Inteligente (Smart Home)**, onde diferentes dispositivos possuem comportamentos específicos definidos por interfaces, garantindo organização, reutilização de código e flexibilidade.

---

## 🧩 Conceitos Utilizados

- Programação Orientada a Objetos (POO)
- Interfaces em Java
- Classe Abstrata
- Implementação de múltiplas interfaces
- Encapsulamento
- Polimorfismo
- Boas práticas de organização de código

---

## 📜 Interfaces Implementadas

### 🔐 Autenticavel
Define um contrato para dispositivos que exigem autenticação.

**Método:**
- `void validarAcesso(String senha)`

---

### 🔌 DispositivoLigavel
Define dispositivos que podem ser ligados ou desligados.

**Métodos:**
- `void ligar()`
- `void desligar()`

---

### 🌡️ SensorTemperatura
Define dispositivos capazes de realizar leitura de temperatura.

**Método:**
- `double lerTemperatura()`

---

## 🏗️ Classe Abstrata

### 🧱 Dispositivo
Classe base abstrata para os dispositivos do sistema, responsável por armazenar informações comuns.

**Atributo:**
- `String nome`

**Método:**
- `void mostrarNome()`

---

## 🏠 Classes Concretas

### 🔒 FechaduraEletronica
Implementa as interfaces `Autenticavel` e `DispositivoLigavel`.

**Funcionalidades:**
- Validação de acesso por senha
- Permite destrancar apenas após autenticação válida
- Pode ser trancada e destrancada

---

### 🌡️ TermostatoSmart
Implementa as interfaces `DispositivoLigavel` e `SensorTemperatura`.

**Funcionalidades:**
- Pode ser ligado e desligado
- Realiza leitura da temperatura ambiente quando está ligado

---
