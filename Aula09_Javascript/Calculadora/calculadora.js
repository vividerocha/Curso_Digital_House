function calcular(){
    var operacao = document.getElementById('operacao').value;

    var num1 = document.getElementById('num1').value;
    var num2 = document.getElementById('num2').value;
    var resultado;

    if(num1 == '' || num2 == ''){
        alert('Preencha todos os campos!');
    }else{
        if(operacao != ''){
            switch(operacao){
                case '1':
                    resultado = parseFloat(num1) - parseFloat(num2);
                    break;
                case '2':
                    resultado = parseFloat(num1) + parseFloat(num2);
                    break;
                case '3':
                    resultado = parseFloat(num1) * parseFloat(num2);
                    break;
                case '4':
                    resultado = parseFloat(num1) / parseFloat(num2);
                    break;
            }

            document.getElementById('resultado').value = resultado;
            
        }else{
            alert('Selecione um valor para Operação!');
        }

        
    }

}
    