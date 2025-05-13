
# 💰 Projeto Financeira

Este projeto foi desenvolvido como parte de um curso de Java, com o objetivo de praticar e aplicar conceitos fundamentais da **Programação Orientada a Objetos (POO)**. Ele simula um sistema de solicitação de **financiamentos** e **pagamento de bônus**, envolvendo diferentes tipos de clientes e regras de negócio.

## 🧠 Objetivo do Projeto

Simular o comportamento de uma financeira que:

- Analisa pedidos de financiamento feitos por empresas ou propriedades rurais.
- Calcula o limite aprovado e aplica juros com base no valor solicitado.
- Realiza o pagamento de bônus para funcionários com base no desempenho.

## 🛠️ Conceitos de Orientação a Objetos Aplicados

O projeto demonstra de forma prática vários pilares da POO:

### ✅ Abstração

- Uso de **interfaces** como `ClienteFinanciavel` e `PessoaBonificavel` para representar comportamentos genéricos e contratos que diferentes tipos de entidades devem cumprir.

### ✅ Encapsulamento

- Cada classe encapsula seus próprios atributos e comportamentos, como `Fazenda`, `Industria`, `Varejista`, `Funcionario` etc., protegendo os dados internos.

### ✅ Herança

- Não há herança direta entre classes, mas o projeto usa **interfaces para herança de comportamentos**, o que é uma prática comum em Java moderna.

### ✅ Polimorfismo

- Métodos como `solicitarFinanciamento(ClienteFinanciavel)` e `pagar(PessoaBonificavel)` demonstram **polimorfismo**, permitindo que diferentes classes implementem o mesmo comportamento de formas distintas.

## 📦 Estrutura do Projeto

```
algaworks/
├── Main.java                      # Demonstra o uso do serviço de financiamento
├── Main2.java                    # Demonstra o uso do serviço de pagamento de bônus
├── servico/
│   ├── ServicoFinanciamento.java     # Lógica de aprovação de financiamento
│   └── ServicoPagamentoBonus.java    # Lógica de cálculo de bônus
├── tipo/
    ├── ClienteFinanciavel.java       # Interface para entidades financiáveis
    ├── PessoaBonificavel.java        # Interface para pessoas que recebem bônus
    ├── Fazenda.java                  # Classe que representa uma fazenda
    ├── Industria.java                # Classe que representa uma indústria
    ├── Varejista.java                # Classe que representa o comércio
    ├── Funcionario.java              # Funcionário que pode receber bônus
```

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/hugopleme/Projeto_Financeira.git
   ```

2. Abra o projeto em sua IDE Java preferida (IntelliJ, Eclipse, VSCode, etc).

3. Navegue até o diretório `src/com/algaworks` e execute os arquivos `Main.java` e `Main2.java` para testar os dois fluxos principais.

## 📚 Aprendizados

Durante o desenvolvimento do projeto, foram reforçados os seguintes tópicos:

- Criação e implementação de **interfaces**
- Aplicação de **boas práticas de design**
- Uso de **tipos genéricos para abstração de comportamento**
- Trabalho com **regras de negócio orientadas a serviços**
- Compreensão prática do **polimorfismo em Java**

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
