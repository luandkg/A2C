# Especificação de Caso de uso: Pagamento

## 1 - Pagamento

### 1.1 - Breve descrição

Operações relacionadas ao subsistema de pagamentos, que contem métodos para criar,editar e excluir formas de pagamentos, além de realixar pagamento e visulizar o histórico de transações realizadas pelo usuário.

## 2 - Fluxo de Eventos

### 2.1 - Fluxo Básico

Esse caso de uso inicia-se quando o usuário clica na função PAGAMENTOS, no qual mostra uma interface com os menus:

- Criar
- Editar
- Excluir
- Realizar Pagamento
- Consultar Transações


### 2.2 - Fluxos Alternativos

#### 2.2.1 - Criar Método de Pagamento

Essa método permite a criação de uma nova forma de pagamento:
- Cartão de Debito
- Cartão de Credito
- Dinheiro

#### 2.2.2 - Editar Método de Pagamento

Esse método permite trocar a forma de pagamento cadastrar anteriormente para: 
- Cartão de Debito
- Cartão de Credito
- Dinheiro

#### 2.2.3 - Excluir Método de Pagamento

Essa método permite a remoção de uma forma de pagamento já cadastrada pelo usuário.

#### 2.2.4 - Realizar Pagamento

Esse método realiza o pagamento da caronas realizadas e com status de pagamento : "NAO REALIZADO".

#### 2.2.5 - Consultar Transações

Esse método lista todas as transações de pagamentos realiadas, mostra por agrupamento de 10 em 10 pagamentos.

## 3 - Requisitos Especiais 

### 3.1 - Confirmação de Senha

A operação Realizar Pagamento requer a confirmação da senha para realização do pagamento.

## 4 - Precondições

Usuário já logado.