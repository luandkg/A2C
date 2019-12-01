# Architecture Notebook

Informações de Origem: OpenUP -> Work Products -> Architecture -> Architecture Notebook

## 1 - Propósito

Este documento descreve todo o processo de filosofia, decisões, justificativas, elementos significativos e todos os outros aspectos acerca do sistema.

## 2 - Objetivo da arquitetura e filosofia

A arquitetura da A2C precisa se adequar a algumas realidades visto que o objetivo maior é, além do ganho financeiro, estimular o compartilhamento de veículos. Então é preciso atender a demandas de aplicativos em locais remotos, com baixíssima qualidade de sinal de internet (com respostas de requisições mais leves possíveis)

## 3 - Suposições e Dependências

Para que possamos oferecer um serviço 24 horas por dia, 7 dias da semana precisamos de servidores de alto desempenho (armazenamento e processamento), acesso contínuo e initerrupto à internet e sala de servidores ou utilização de locação de dispositivos em nuvem.

## 4 - Requisitos significativos da Arquitetura

Para esse projeto será de suma importância que a arquitetura possa suportar e manter uma integração com o OpenStreetMap (https://wiki.openstreetmap.org/wiki/API). OpenStreetMap é um projeto de mapeamento colaborativo para criar um mapa livre e editável do mundo, inspirado por sites como a Wikipédia

## 5 - Decisões, Constrastes e Justificativas

### 5.1 - CLiente-Servidor

O projeto visa a otimização de recursos do lado do usuário (motorista ou passageiro) de todas as formas possíveis. Visto isso, adotaremos um modelo cliente-servidor onde teremos centralizado na arquitetura do servidor todas as operações necessárias de calculos, comunicação e etc. Para o lado cliente, unica e exclusivamente, teremos a apresentação dos dados pelas aplicações, com exceção da locomoção geográfica que será calculada pela aplicação cliente junto com cache do trajeto fornecido pelo OpenStreetMap.

## 6 - Mecanismos de Arquitetura

### 6.1 - Resource Management

Afim de nos adequarmos a esse arquitetura cliente-servidor proposta, vamos adotar como padrão de projeto o MVC (Model-View-Controller). A adoção desse padrão nos permitirá atingir uma boa separação de responsabilidades nas aplicações clientes, já que a maioria da responsabilidade é do servidor.