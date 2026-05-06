

const form = document.querySelector('form');

form.addEventListener("submit", function(event) {
    // anula o submit pois ainda não está integrado com o java
    event.preventDefault();

    // declaração de variavel
    let nome = document.querySelector('#nome').value;

    // exibe a caixa de diálogo

    alert(nome);

    // reseta o formulário
    form.reset();

});