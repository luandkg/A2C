# Documento de Visão

Template de Origem: OpenUp/Basic -> Work Products -> Requirements -> [Vision](http://ndpsoftware.com/OpenUpBasic/openup_basic/guidances/templates/resources/vision.dot)

## 1 - Introdução

Esta introdução fornece uma visão geral de todo o documento de visão. Ela inclui o propósito, escopo, definições, referências e visão geral de todo o documento.

### 1.1 Propósito

O propósito deste documento é expor as necessidades e funcionalidades gerais do produto, definindo os requisitos de alto nível em termos de necessidades dos usuários finais. Os detalhes de como o Aplicativo para Caronas Compartilhadas ou A2C, atinge essas necessidades são descritos no Documento de Requisitos e no Documento de Regras de Negócio

### 1.2 Escopo

Esse produto permitirá conectar motoristas com lugares vazios em seus veículos e passageiros viajando para o mesmo destino.

## 2 - Posicionamento

### 2.1 - Instrução do Problema

<table>
    <tr>
        <th>O problema de</th>
        <td>transporte entre cidades</td>
    </tr>
    <tr>
        <th>afeta</th>
        <td>diversas pessoas nas cidades brasileiras</td>
    </tr>
    <tr>
        <th>o impacto do problema é</th>
        <td>enorme para as pessoas que dependem do sistema público de transporte atual que é deficitário em diversas formas. Além disso, congestionamentos quilométricos aumentando o tempo de deslocamento necessário para chegar ao seu destino, causados por excessos de veículos onde a média de passageiros por veículo é entre 1 e 2 pessoas.</td>
    </tr>
    <tr>
        <th>Uma solução bem sucedida seria</th>
        <td> desenvolvimento de um aplicativo que disponibilize uma forma alternativa de meio de transporte para que usuários do sistema de transporte público (passageiros) possam chegar a seu destino mais rápido e com maior conforto. E, permite aos motoristas (de carros particulares) ajudar a desafogar o transito e ao mesmo tempo receber auxílio financeiro para manter seu trajeto.</td>
    </tr>
</table>

### 2.2 - Instrução de Posição do Produto

<table>
    <tr>
        <th>For</th>
        <td>o problema de transporte entre cidades</td>
    </tr>
    <tr>
        <th>Who</th>
        <td>causa congestionamento que aumentam o tempo de viagem média, tanto para usuários do sistema público (passageiros), quanto para proprietários de veículos particulares (motoristas)</td>
    </tr>
    <tr>
        <th>The A2C</th>
        <td>é um aplicativo de caronas compartilhadas</td>
    </tr>
    <tr>
        <th>That</th>
        <td>conecta proprietários de veículos particulares (motoristas) com usuários do sistema público ou outros proprietários de veículos (passageiros) para reduzir o tempo de chegada dos passageiros e gerar retorno financeiro sobre o trajeto usual do motorista e reduzir a quantida de veículos nas vias</td>
    </tr>
    <tr>
        <th>Unlike</th>
        <td>do Uber, 99, Cabify e outros</td>
    </tr>
    <tr>
        <th>Our product</th>
        <td>é destinado apenas a motoristas interessados em compartilhar vagas dentro do trajeto que precisam realizar para ir a algum destino (trabalho, escola, academia, etc...) e passageiros que queiram chegar mais rápido, comparado ao sistema público de transporte, mas que não queiram pagar um valor mais alto para um motorista dedicado apenas ao seu trajeto.</td>
    </tr>
</table>

## 3 - Descrição da Parte Interessada e do Usuário

### 3.1 - Resumo da Parte Interessada

<table>
    <tr>
        <th>Nome</th>
        <th>Descrição</th>
        <th>Responsabilidades</th>
    </tr>
    <tr>
        <td>Passageiro</td>
        <td>São pessoas interessadas em chegar ao seu destino (trabalho, escola, academia, etc...), mas que não possuem veículos próprios e/ou não querem utilizar o sistema público de transporte</td>
        <td>Agendar carona de acordo com o oferecido pelos motoristas; Estar presente no ponto de encontro marcado no horário correto; Realizar os pagamentos corretamente na plataforma; Não atrapalhar o motorista durante a viagem; Ser educado com o motorista na viagem; Respeitar e preservar o veículo e pertences do motorista.</td>
    </tr>
    <tr>
        <td>Motorista</td>
        <td>São pessoas que a fonte de renda principal não é de motorista particular (de empresas e/ou aplicativos de trasportes) e que querem compartilhar vagas em seu veículo para percorrer sua rota habitual (trabalho, escola, academia) com outras pessoas e em troca receber um valor que o faça voltar a oferecer caronas.</td>
        <td>Disponibilizar lista de dias, horários e trajetos que possui interesse em compartilhar; Estar presente no dia e hora marcada no aplicativo; Ser educado com o passageiro; Respeitar os pertences do passageiro; Deixar o passageiro no local solicitado previamente pelo aplicativo</td>
    </tr>
</table>

### 3.2 - Ambiente do Usuário

Tanto os passageiros quanto os motoristas utilizarão um aplicativo para smartphone (Android ou IOS) para, no caso de motoristas, criar/manter caronas, quanto para os passageiros, para agendar caronas oferecidas. Logo, tanto motoristas quanto passageiros precisam ter um dispositivo smartphone que tenha os requisitios mínimos de instalação exigidos pelo app.

## 4 - Visão Geral do Produto

### 4.1 - Perspectiva do Produto

O produto é destinado a competir em mercado parecido aos aplicativos como Uber, 99 e Cabify, mas focado apenas em trajetoa já realizados pelos motoristas. Ou seja, o nosso público alvo diverge quando os motoristas não possuem interesse criar uma renda consistente dentro do aplicativo. Da mesma forma, diverge quando passageiros não possuem a exigência de viajarem sozinhos e que o motorista o pegue e deixe em locais marcados obrigatoriamente pelo passageiro, caracterizando um serviço de transporte mais tradicional.   

### 4.2 - Suposições e Dependência

O aplicativo é destinado aos sistemas operacionais voltados aos sistemas operacionais de smartphones mais populares: Android e IOS. No caso da existência de outro sistema operacional, será necessário alterar o documento de visão. 

Também é estritamente necessário a presença de internet nos dispositivos móveis, pois toda a comunicação entre os atores (motoristas e passageiros) é feita pelo aplicativo online com a internet. O produto não engloba soluções voltadas para interações offline.

Do ponto de vista da oferta do serviço, os usuários podem fazer uso do aplicativo 24 horas por dia, 7 dias por semana. Dessa forma, precisamos de servidores de alto desempenho (armazenamento e processamento), acesso contínuo e initerrupto à internet e sala de servidores ou utilização de locação de dispositivos em nuvem.

### 4.3 - Resumo das Capacidades

<table>
    <tr>
        <th>Necessidade</th>
        <th>Prioridade</th>
        <th>Recursos</th>
        <th>Realease Planejado</th>
    </tr>
    <tr>
        <td>Criar/Manter caronas</td>
        <td>Alta</td>
        <td>Criar, alterar, cancelar e deletar caronas dentro do aplicativo pelo motorista</td>
        <td>10/11/2019</td>
    </tr>
    <tr>
        <td>Agendar caronas</td>
        <td>Alta</td>
        <td>Passageiro pode selecionar e agendar caronas disponibilizadas pelos motoristas</td>
        <td>10/11/2019</td>
    </tr>
</table>

### 4.4 - Alternativas e Concorrentes

**BlaBlaCar**

Concorrente direto com diversas funcionalidades similares. Permite a motoristas dar caronas à pessoas interessadas. Todo o contato e negociação é feito via aplicativo. Como já está há algum tempo no mercado global, já possui uma boa base de usuários e tempo de maturação do software.
Mas apesar disso, como a empresa é estrangeira e sua base de usuários ainda é pequena, eles não possuem uma forma segura de realizar pagamentos.
Outro problema do Blablacar é a sua verificação de segurança do perfil de cada usuário do sistema. Essa verificação é baseada apenas no perfil do facebook do usuário. Que, mesmo com histórico dentro da plataforma, esse histórico pode ser montado com o tempo pelo próprio usuário mal-intencionado.