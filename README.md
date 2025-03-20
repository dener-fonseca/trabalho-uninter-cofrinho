Cofrinho Digital - Uninter

Este é um projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos na Universidade Centro Universitário Internacional UNINTER. O projeto consiste em um cofrinho digital, que permite ao usuário realizar operações relacionadas à adição, remoção e consulta de moedas, além de converter o total armazenado para reais.

🛠 Tecnologias e Conceitos Utilizados

O projeto foi desenvolvido em Java e aplica os seguintes conceitos da programação orientada a objetos (POO):

Classes e Objetos: Representação de diferentes tipos de moedas e do cofrinho digital.

Herança: Moedas específicas (Real, Dólar, Euro, Libra, Iene, Yuan) herdando características da classe base Moeda.

Polimorfismo: Implementação de métodos que se comportam de forma diferente dependendo da moeda selecionada.

Encapsulamento: Uso de atributos privados e métodos públicos para controle das informações.

Pacotes: Organização do código em pacotes Main, Cofrinho e Moedas.

Listas (ArrayList): Utilizadas para armazenar as moedas adicionadas ao cofrinho.

Scanner (java.util.Scanner): Para capturar entradas do usuário.

Estruturas de Repetição e Condicionais: Para controle do menu e das operações do cofrinho.

Conversão de Moedas: Implementação de métodos para converter os valores das moedas para reais.

Manipulação de Objetos: Adição e remoção dinâmica de moedas dentro do cofrinho.



---

📋 Descrição

O Cofrinho Digital permite que o usuário gerencie moedas de diferentes tipos e valores, realizando as seguintes operações:

✅ Adicionar Moedas: O usuário pode escolher entre diferentes tipos de moedas e especificar o valor a ser adicionado.

✅ Remover Moedas: O usuário pode selecionar uma moeda específica e remover um valor dela. Se o valor chegar a zero, a moeda é excluída do cofrinho.

✅ Listar Moedas: Exibe todas as moedas armazenadas no cofrinho, junto com seus valores acumulados.

✅ Exibir Total Convertido: Mostra o valor total do cofrinho convertido para reais.

✅ Menu Interativo: O sistema possui um menu principal e submenus para facilitar a interação do usuário.

✅ Encerramento do Programa: Opção para sair do programa.


---

📂 Estrutura do Projeto

O projeto segue a seguinte organização de pacotes e classes:

cofrinho-digital/
│── src/
│   ├── main/
│   │   ├── Main.java
│   ├── cofrinho/
│   │   ├── Cofrinho.java
│   ├── moedas/
│   │   ├── Moeda.java
│   │   ├── Real.java
│   │   ├── Dolar.java
│   │   ├── Euro.java
│   │   ├── Libra.java
│   │   ├── Iene.java
│   │   ├── Yuan.java

📌 Descrição das Classes

Main.java: Classe principal que executa o programa e gerencia o menu interativo.

Cofrinho.java: Gerencia a lista de moedas e implementa operações como adicionar, remover e exibir o total convertido.

Moeda.java: Classe abstrata que define a estrutura base para todas as moedas.

Real.java, Dolar.java, Euro.java, Libra.java, Iene.java, Yuan.java: Classes que representam diferentes tipos de moedas e implementam os métodos de conversão.



---

🏃‍♂️ Como Rodar o Projeto

Pré-requisitos

Ter o Java JDK instalado na máquina.

Ter um ambiente de desenvolvimento configurado (IDE como IntelliJ, Eclipse, ou VS Code) ou executar via terminal.


Passos para execução

1. Clone o repositório ou baixe os arquivos do projeto:



git clone https://github.com/SEU_USUARIO/cofrinho-digital.git

2. Acesse o diretório do projeto:



cd cofrinho-digital

3. Compile o código:



javac src/main/java/Main.java

4. Execute o programa:



java src.main.java.Main

5. O menu interativo será exibido no console para que o usuário possa interagir com o cofrinho.




---

🎯 Objetivo do Projeto

Este projeto foi desenvolvido para:

Praticar os conceitos de Programação Orientada a Objetos (POO).

Implementar herança, encapsulamento e polimorfismo na criação de classes.

Trabalhar com listas e manipulação dinâmica de objetos.

Criar um menu interativo e intuitivo para o usuário.

Aplicar conversão de moedas para fins de aprendizado.



---

✍️ Contribuindo

Se deseja contribuir com melhorias para o projeto:

1. Faça um fork do repositório.


2. Crie uma nova branch para suas alterações:

git checkout -b minha-melhoria


3. Faça as modificações e realize um commit:

git commit -m "Adicionando nova funcionalidade"


4. Envie um pull request para revisão.




---

📞 Contato

Este projeto foi desenvolvido como parte do curso da Universidade Uninter. Para dúvidas ou sugestões, entre em contato:

📧 Email: darkx@hotmail.com.br
🔗 LinkedIn: https://www.linkedin.com/in/dener-fonseca
