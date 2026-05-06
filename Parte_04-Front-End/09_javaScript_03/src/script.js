const form = document.querySelector('form');

// arrow function

const maiorIdade = () => {
	// declarar variaveis

	let nome = document.querySelector("#nome").value;
	let idade = document.querySelector("#idade").value;

	// saida de dados

	// (idade >= 18) ? document.querySelector('#result').innerHTML = nome + ' é maior de idade!' :
	// 	document.querySelector('#result').innerHTML = nome + ' é menor de idade!';

	if(idade >= 18) {
		document.querySelector('#result').innerHTML = nome + ' é maior de idade!'
	} else {
		document.querySelector('#result').innerHTML = nome + ' é menor de idade!';
	}

	form.reset();
}

// evento
form.addEventListener('submit', function(event) {
	event.preventDefault();

	// chama a arrow funtion
	maiorIdade();
})