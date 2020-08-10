function salvar(){
    var preenchidos = true;
    if(document.getElementById("nome").value == ""){
        alert("O campo Nome é Obrigatório!");
        preenchidos = false;
    }
    if(document.getElementById("sobrenome").value == ""){
        alert("O campo SobreNome é Obrigatório!");
        preenchidos = false;
    }
    if(validaSenha() == false){
        preenchidos = false;
    }

    if(preenchidos == true){
        let data = {
            "nome": document.getElementById("nome").value,
            "sobrenome": document.getElementById("sobrenome").value,
            "senha": document.getElementById("senha").value
        }
        console.log(data);
    }
    
}

function campoNomeObrigatorio(){
    
    if(document.getElementById("nome").value == ""){
        var elemento = document.getElementById("msgNome");
        elemento.innerHTML = "Campo Obrigatório!";
    }
}

function campoSobreNomeObrigatorio(){
    if(document.getElementById("sobrenome").value == ""){
        var elemento = document.getElementById("msgSobreNome");
        elemento.innerHTML = "Campo Obrigatório!";
    }
}

function validaSenha(){
    var senha = document.getElementById("senha").value;
    var confirma = document.getElementById("confirma").value;
    var validada = true;

    if(senha != confirma){
        var elemento = document.getElementById("msgSenha");
        elemento.innerHTML = "As senhas não são iguais!";
        validada = false;
    }

    return validada;
}