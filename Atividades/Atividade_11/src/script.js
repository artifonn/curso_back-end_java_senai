const form = document.querySelector("form");
const diag = document.querySelector("#diag");

const calcularIMC = () => {
  let peso = document.querySelector("#peso").value.replace(',', '.');
  let altura = document.querySelector("#altura").value.replace(',', '.');

  let imc = peso / Math.pow(altura, 2);

  return imc.toFixed(2);
};

const limparInput = () => {
  form.reset();
}

const exiberDiag = (imc) => {
  return (imc < 18.5) ? 'Você está abaixo do peso.' :
         (imc < 25) ? 'Você está no peso ideal.' :
         (imc < 30) ? 'Você está acima do peso.' :
         (imc < 35) ? 'Você está obeso.' :
         (imc < 40) ? 'Você está com obesidade nível II.' :
         'Você está com obesidade mórbida.';
};

form.addEventListener("submit", function (event) {
  event.preventDefault();
  
  let imc = calcularIMC();

  diag.innerHTML = `Seu IMC é: ${imc} <br> ${exiberDiag(imc)}`;
  limparInput();
});