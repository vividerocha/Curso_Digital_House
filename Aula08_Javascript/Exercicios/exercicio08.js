
function Aluno(nome, serie, aula){
    this.nome = nome;
    this.serie = serie;
    this.aula = aula;
}

var alunos = new Array();

alunos.push(new Aluno("João", 9, ""));
alunos.push(new Aluno("Maria", 8, ""));
alunos.push(new Aluno("Pedro", 9, ""));
alunos.push(new Aluno("Fernando", 8, ""));
alunos.push(new Aluno("Francisca", 9, ""));
    
    //console.log(alunos);

function distribuiAula(alunos){
    for(var i = 0; i <= alunos.length; i++){
        if(alunos[i].serie == 9){
            alunos[i].aula = "Física";
        }else{
            alunos[i].aula = "História";
        }
    }

    console.log(alunos);
}

distribuiAula(alunos);