//FUNÇÃO FAZ CONTAGEM REGRESSIVA E EXIBE MENSAGEM USANDO PROMISE

function contagem(){
    for(var i = 10; i >= 0; i--){
        console.log(i);
    }
    return true;
}

function mensagem(func){        
      return func();
}

let p = new Promise((resolve, reject) => {
  resolve(mensagem(contagem));
  });
p.then((message) => {
    console.log("Feliz Ano Novo!");
})