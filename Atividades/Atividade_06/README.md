# Atividade 06: Sistema de Veículos (POO)

Este projeto consiste na implementação de um sistema de cadastro de veículos em **Java**, aplicando os pilares da Programação Orientada a Objetos: **Abstração, Herança e Encapsulamento**.

## 🛠️ Especificações Técnicas

### 1. Estrutura de Classes (Package `models`)
* **Superclasse Abstrata:** `Veiculo` (Serve como molde para todos os tipos de veículos).
* **Subclasses Finais:** `Moto`, `Carro`, `Onibus` e `Caminhao`.
    * *Nota:* O uso do modificador `final` impede que estas classes sejam estendidas novamente.

### 2. Atributos e Encapsulamento
Todos os atributos devem ser **privados**, acessíveis apenas através de métodos públicos (getters e setters).

**Atributos Comuns (Classe `Veiculo`):**
* Fabricante
* Modelo
* Cor
* Ano
* Placa
* **Categoria:** (Definido automaticamente pelo programa, sem intervenção do usuário).

**Atributos Específicos:**
* **Carro:** Bagageiro.
* **Ônibus:** Tipo de serviço (Leito ou não).
* **Caminhão:** Tipo de carroceria.
* **Moto:** (Atributo à escolha, ex: Cilindradas).

---

## 🚀 Fluxo de Funcionamento (Classe Principal)

1.  O sistema deve apresentar um menu para o usuário escolher qual tipo de veículo deseja instanciar.
2.  O programa deve solicitar os dados gerais e os dados específicos do veículo escolhido.
3.  A categoria deve ser atribuída internamente pela lógica das subclasses.
4.  **Saída:** O programa deve exibir todos os dados do veículo cadastrado de forma organizada.

---

> **Requisitos Obrigatórios:**
> - Utilizar **Herança** para reaproveitamento de código.
> - Utilizar **Abstração** para a classe base.
> - Garantir o **Encapsulamento** total dos dados.