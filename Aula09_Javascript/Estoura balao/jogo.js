function comecarJogo(){
					
	var nivelJogo = document.getElementById('nivelJogo').value;
	window.location.href = "jogo.html?" + nivelJogo;
}

var timer = null;  

function iniciarJogo(argument){
	
	var url = window.location.search;
	var nivel_jogo = url.replace("?", " ");

	var tempoJogo = 0;
	
	if (nivel_jogo == 1){ // 1 facil -> 120 seg
		tempoJogo = 120;
	}

	if (nivel_jogo == 2){ // 2 medio -> 60 seg
		tempoJogo = 60;
	}

	if (nivel_jogo == 3){ // 3 dificil -> 30 seg
		tempoJogo = 30;
	}

	document.getElementById("cronometro").innerHTML = tempoJogo;
	var qtde_baloes = 80;
	cria_baloes(qtde_baloes);
	document.getElementById("baloes_inteiros").innerHTML= qtde_baloes;
	document.getElementById("baloes_estourados").innerHTML= 0;

	cronometro(tempoJogo);

}

function cronometro(segundos){
	
	document.getElementById("cronometro").innerHTML = segundos;
	timer = setTimeout("cronometro("+ (segundos - 1) +")", 1000);
	if (segundos == -1){
		clearTimeout(timer);
		game_over();
		document.getElementById("cronometro").innerHTML = 0;
		return false;
	}

}

function game_over(){
	alert('Fim de Jogo, O tempo acabou!');
}
function cria_baloes(qtde_baloes) {
	
	for(var i= 1; i<= qtde_baloes; i++){
		var balao = document.createElement("img");
		balao.src = 'imagens/balao_azul_pequeno.png';
		balao.style.margin = '10px';
		balao.id = 'b'+i;
		balao.onclick = function(){ estourar(this);}

		document.getElementById("cenario").appendChild(balao);
	}
}

function estourar(e){
	segundos = document.getElementById("cronometro").innerHTML;
	if(segundos != 0){
		var id_balao = e.id; 
		document.getElementById(id_balao).setAttribute("onclick", "");
		document.getElementById(id_balao).src = 'imagens/balao_azul_pequeno_estourado.png';

		pontuacao(-1);
	}
	
}

function pontuacao(acao){
	var baloes_inteiros = document.getElementById("baloes_inteiros").innerHTML;
	var baloes_estourados = document.getElementById("baloes_estourados").innerHTML;

	baloes_inteiros = parseInt(baloes_inteiros);
	baloes_estourados = parseInt(baloes_estourados);

	baloes_inteiros = baloes_inteiros + acao;
	baloes_estourados = baloes_estourados - acao;


	document.getElementById('baloes_inteiros').innerHTML = baloes_inteiros;
	document.getElementById('baloes_estourados').innerHTML = baloes_estourados;

	if(baloes_inteiros	== 0 ){
		alert	('Parabéns, você conseguiu!');
		clearTimeout(timer);
	}
}

function pausar(){
	var acao = document.getElementById("btnPausar").innerHTML;
	var segundos = document.getElementById("cronometro").innerHTML;

	if(acao == "Pausar"){	
		clearTimeout(timer);
		document.getElementById("cronometro").innerHTML = segundos;
		document.getElementById("btnPausar").innerHTML = "Continuar";
	}else{
		cronometro(segundos);
		document.getElementById("btnPausar").innerHTML = "Pausar";
	}
	
}

function reiniciar(){
	window.location.href = "index.html";
	
}
