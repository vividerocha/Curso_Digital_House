//  
  function contagem(){
      return new Promise((resolve, reject) => {
        var numeros;
        for(var i = 10; i >= 0; i--){
          numeros = numeros + "\n" + i;
        }
          resolve({
            success: true,
            msg: numeros
          })
      });
  }

  function mensagem(funcao){
    return new Promise((resolve, reject) => {
      resolve({
        success: true,
        msg: "FELIZ ANO NOVO!"
      })
    })
  }
  
  async function fazer(){        
        const executa = await contagem();
        console.log(executa);
        const executaMais = await mensagem(executa);
        console.log(executaMais);
  }

  

  



