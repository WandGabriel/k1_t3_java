# k1_t3_java

Pontos de atenção.

Como primeiro contato com a linguagem foi identificado algumas dificuldades para realizar algumas ações dentro do projeto.

O mesmo está funcional, contudo ainda assim apresentado pontos de possíveis melhorias.

1 - Foi criado o campo de Data utilizando uma String, e não uma variável de data.

2 - A parte de implementação da classe inicial era criar uma classe de Categoria separada, fazendo com o que a mesma pudesse receber o conteúdo e armazenar em uma lista,
contudo tive dificuldade para implementar o método, desse modo utilizei if e else para realizar as ações.

3 - Alguns códigos estão se repetindo, então acredito que poderia criar novos métodos para reutilização de códigos, conforme sugerido em código limpo.

4 - Acredito que em certos pontos a lógica implementada pode ser melhorada, porém devido ao curto tempo não foi possível realizar algo dessa magnitude.

5 - Não foram inseridos os try catch dos possíveis erros de digitação de usuário, dessa forma é algo que deve ser implementado em um segundo momento, após
uma refatoração do código.

6 - Não foi implementado a opção de escrever transformar o objeto em texto e repassar para um arquivo .txt ou vice-versa, fazendo com que o usuário não perdesse
o conteúdo já escrito no programa, dessa forma ao finalizar o programa o mesmo será encerrado sem leitura de arquivo ao reabrir.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

A ideia é que o próprio programa criado seja refatorado ao longo do tempo inserindo assim suas correções com o conhecimento adquirido, dessa forma melhorando
a entrega do produto final.

Para execução do programa não tem algum tipo de alteração, apenas se atentar com os campos de data pois como é uma String pode ser inserido qualquer informação
e/ou questionamentos do menu, pois como não tem os try criando a exception assim que o problema for apresentado o mesmo será encerrado automaticamente.
