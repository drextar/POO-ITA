
# Curso Orientação a Objetos com Java

Repositório criado com o intuido de salvar minhas implementações nos desafios semanais do curso de Orientação a Objetos com Java feito pelo Instituto Tecnológico da Aeronáutica(ITA) ministrado na plataforma da Coursera

Link do curso: https://www.coursera.org/learn/orientacao-a-objetos-com-java

---

## [Tarefa 1](https://github.com/drextar/POO-ITA/tree/main/Tarefa%201%20-%20CalculoIMC)

Implemente no Eclipse uma classe chamada Paciente que possui um construtor que recebe o seu peso em quilos e sua altura em metros, ambos utilizando o tipo double. Crie um método chamado calcularIMC() que calcula o índice de Massa Corporal de acordo com a fórmula IMC = peso (quilos) / (altura * altura (metros)). Crie também um método chamado diagnostico() que utiliza o método calcularIMC() e retorna uma String de acordo com as seguintes faixas de valor:

Baixo peso muito grave = IMC abaixo de 16 kg/m²

Baixo peso grave = IMC entre 16 e 16,99 kg/m²

Baixo peso = IMC entre 17 e 18,49 kg/m²

Peso normal = IMC entre 18,50 e 24,99 kg/m²

Sobrepeso = IMC entre 25 e 29,99 kg/m²

Obesidade grau I = IMC entre 30 e 34,99 kg/m²

Obesidade grau II = IMC entre 35 e 39,99 kg/m²

Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²

---

## [Tarefa 2](https://github.com/drextar/POO-ITA/tree/main/Tarefa%202%20-%20Pizzaria)

Crie uma classe Pizza que possua o método adicionaIngrediente() que recebe uma String com o ingrediente a ser adicionado. Essa classe também deve possuir o método getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.

É preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize uma variável estática na classe Pizza para guardar esse tipo de informação (dica: utilize a classe HashMap para guardar o ingrediente como chave e um Integer como valor). Crie o método estático contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro.

Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. Ela deve ter um método que retorna o valor total de todas as pizzas adicionadas. O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.

Crie uma classe Principal com o método main() que faz o seguinte:

- Cria 3 pizzas com ingredientes diferentes

- Adiciona essas Pizzas em um CarrinhoDeCompra

- Imprime o total do CarrinhoDeCompra

- Imprime a quantidade utilizada de cada ingrediente

--- 

## [Tarefa 3](https://github.com/drextar/POO-ITA/tree/main/Tarefa%203%20-%20PizzariaTeste)

Faça os testes de unidade da classe Pizza e verifique se o valor da Pizza está correto de acordo com a quantidade de ingredientes. Verifique também se o registro de ingredientes funcionou corretamente. Crie um método estático na classe Pizza que zera o registro de ingredientes e invoque ele em um método de inicialização ou finalização na classe de testes. Um método de teste deve ser independente do que aconteceu em outros métodos de teste!

Faça os testes da classe CarrinhoDeCompras, verificando se o preço das pizzas são somados corretamente e se ele impede a adição de uma pizza sem ingredientes.

Procure criar os testes de forma que cada método de testes verifique um cenário e uma funcionalidade. Evite por exemplo, em um mesmo teste, verificar o preço da pizza e o registro de ingredientes ao mesmo tempo.

---

## [Tarefa 4](https://github.com/drextar/POO-ITA/tree/main/Tarefa%204%20-%20Store)

Crie uma classe chamada Produto que deve possuir um nome, um código e um preço. Sobrescreva os métodos equals() e hashCode() de Object (veja seção sobre esses métodos), de forma a serem considerados iguais instancias de Produto que possuam o mesmo código.

Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto. Essa classe deve possuir uma informação adicional de tamanho. Um exemplo seria o tamanho de uma roupa ou a numeração de um calçado. Método equals() e hashCode() devem ser sobrescritos de forma que um produto com mesmo código e tamanhos diferentes são considerados diferentes.

Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo HashMap cada produto adicionado no carrinho e sua respectiva quantidade. O método adicionaProduto() deve receber a instancia do produto e a quantidade. Caso o produto já exista no HashMap, a quantidade deve ser somada a que já existe no carrinho. Deve haver também um método removeProduto() que também recebe a instancia do produto e a quantidade a ser removida. Observe que produtos de tamanhos diferentes devem ser considerados como produtos diferentes no carrinho. O carrinho deve possuir um método que calcula o valor total da compra.

Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e para a classe CarrinhoDeCompras. Os testes de cada classe devem ser colocados em classes separadas e devem estar em um diretório de código diferente das classes de produção.

Review

- Serão verificados se os itens pedidos no enunciado foram cumpridos. Procure entregar um código organizado pois isso também será avaliado.

---

## [Tarefa 5](https://github.com/drextar/POO-ITA/tree/main/Tarefa%205%20-%20FormaDeTratamento)

Crie uma interface chamada FormatadorNome que possui o método String formatarNome(String nome, String sobrenome).

Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome e uma instância de FormatadorNome. Essa classe deve possuir um método getTratamento() que delega a formatação do nome para a instância de FormatadorNome.

Crie a seguintes implementações da interface FormatadorNome:

Informal: retorna somente o primeiro nome

Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, e retornar "Sr." ou "Sra." seguido do sobrenome

ComTítulo: deve receber em seu construtor o título e retornar o título seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"

Crie testes de unidade que fazem os testes da classe Autoridade com cada uma das implementações da interface. 

Review
- Serão verificados se os itens pedidos no enunciado foram cumpridos. Procure entregar um código organizado pois isso também será avaliado.  

---
