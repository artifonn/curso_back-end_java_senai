const form = document.querySelector("form");
const botao = document.querySelector("#botao");

const calc = () => {
  let nome = document.querySelector("#nome");
  let peso = document.querySelector("#peso");
  let altura = document.querySelector("#altura");

  
		let calculo = peso / (altura * altura);
    document.querySelector("#result").innerHTML = nome + " o seu imc é " + calculo;

    document.querySelector("#result").innerHTML = 'Não foi possível calcular o seu imc';
  

  form.reset();
};

// 

form.addEventListener('submit', function(event) {
	event.preventDefault();
	
	calc();
})