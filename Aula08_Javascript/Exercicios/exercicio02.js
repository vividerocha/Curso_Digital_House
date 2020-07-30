//FUNÇÃO RETORNA SE NÚMERO É OU NÃO PRIMO

let primo = num =>{
    var divisores = 0;
    var resposta ="";

    if(num!=1){
        for(var count=1 ; count<=num ; count++)
        if(num % count == 0)
         divisores++;
    
        if(divisores==2)
            resposta='É primo';
        else
            resposta='Não é primo';
    }else{
        resposta='É primo';
    }
    
    console.log(resposta);
  };

  primo(13);