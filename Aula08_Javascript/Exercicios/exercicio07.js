//FUNÇÃO QUE SOMA O TOTAL DOS PRODUTOS

function Produto(nome, preco) {
    this.nome = nome;
    this.preco = preco;
  }

  var produtos = new Array();

    produtos.push(new Produto("Arroz", 20.00));
    produtos.push(new Produto("Feijão",8.00));
    produtos.push(new Produto("Açúcar", 15.00));
    produtos.push(new Produto("Café", 7.00));

function totalProdutos(produtos){
    var total = 0;
    for(var i = 0; i < produtos.length; i++){
        total = total + produtos[i].preco;
    }
    console.log("O total da compra é: " + total);
}

totalProdutos(produtos);