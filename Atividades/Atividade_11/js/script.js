// TODO: Atividade 11
// Desenvolva uma página HTMl onde o usuário pode Calcular o seu IMC
// NOTE: Use BootStrap para fazer uma página bem bonita.


const form = document.querySelector("form");



const calcularImc = () => {


    let nome = document.querySelector("#nome").value;
    let idade = document.querySelector("#idade").value;
    let altura = parseFloat(document.querySelector("#altura").value);
    let peso = document.querySelector("#peso").value;

    let result = (peso/(altura*altura));

    if (result < 18) {
        document.querySelector("#result").innerHTML = nome + " Seu IMC é " + result.toFixed(2) + " , e você está abaixo do peso.";
    }
    else if (result < 30){
        document.querySelector("#result").innerHTML = nome + " Seu IMC é " + result.toFixed(2) + ", e você está no peso ideal."
    }
    else if (result < 35){
        document.querySelector("#result").innerHTML = nome + " Seu IMC é " + result.toFixed(2) + ", e você está obeso";
    }
    else if (result < 40) {
        document.querySelector("#result").innerHTML = nome + " Seu IMC é " + result.toFixed(2) + ", e você está com obesidade nível 2";
    }
    else if (result > 40){
        document.querySelector("#result").innerHTML = nome + " Seu IMC é " + result.toFixed(2) + ", você é um obeso Morbido";
    }  

}

// evento 
 form.addEventListener("submit", function(event) {
    // anular o submit
    event.preventDefault();

    //
    calcularImc();
 });
    
 