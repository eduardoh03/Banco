# Banco
Faça um programa que simule um controle bancário. Os clientes que podem
abrir conta no banco devem ser devidamente cadastrados, sendo armazenados
os seguintes dados em sua “ficha”: código, nome, e-mail e telefone. A abertura
de uma nova conta deve conter um número, o cliente proprietário dessa conta e
o saldo inicial. Não pode haver dois clientes com o mesmo código, nem duas
contas com o mesmo número.
O sistema deve apresentar o seguinte menu:
Menu Principal
1. Cadastrar cliente
2. Listar clientes
3. Abrir conta
4. Efetuar depósito
5. Efetuar saque
6. Relatório de contas
7. Finalizar o programa
1. A opção “Listar clientes” deve apresentar a relação dos clientes
cadastrados no sistema.
2. Para abrir uma nova conta, deve ser solicitado o código do cliente, que deve
ser pesquisado no sistema e, assim, permitir a criação da conta com o
número e o saldo inicial informado pelo usuário.
3. Para efetuar um depósito, deve-se solicitar o número da conta e o valor a
ser depositado. Se a conta não estiver cadastrada, deverá ser exibida uma
mensagem correspondente e voltar ao menu. Se a conta existir, o saldo
deve ser atualizado;
4. Para efetuar saque, deve-se solicitar o número da conta e valor a ser
sacado. Se a conta não estiver cadastrada, deverá ser exibida uma
mensagem ao usuário e voltar ao menu. Se a conta existir, o programa deve
verificar se o saldo é suficiente para o valor do saque. Se o saldo for
suficiente, realizar o saque, atualizar o saldo e voltar ao menu. Caso
contrário, mostrar uma mensagem de saldo insuficiente e voltar ao menu;
5. O relatório de contas deve listar, para cada conta cadastrada, o número da
conta, o nome e o telefone do cliente e o respectivo saldo;
6. O programa só será finalizado ao ser informada a opção 7.
