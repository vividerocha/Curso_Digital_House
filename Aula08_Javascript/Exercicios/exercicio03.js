//FUNÇÃO FAZ CONTAGEM REGRESSIVA E IMPRIME MENSAGEM USANDO CALLBACK

function contagem(){
    for(var i = 10; i >= 0; i--){
        console.log(i);
    }
    return true;
}

function mensagem(func){        
      return func();
}

let a = mensagem(contagem);
console.log("Feliz ano Novo!");