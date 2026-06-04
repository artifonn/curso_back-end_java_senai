const form = document.querySelector("form");
const maskCpf= document.querySelector("#cpf");
const maskTel = document.querySelector("#telefone");
const maskCep = document.querySelector("#Cep");
const pesquisaCep = document.querySelector("#Cep");


maskCpf.addEventListener('input', function(){
    this.value = this.value
    .replace(/\D/g,'')
    .replace(/(\d{3})(\d)/, '$1.$2')
    .replace(/(\d{3})(\d)/, '$1.$2')
    .replace(/(\d{3})(\d{1,2})$/, '$1-$2');

});

maskTel.addEventListener('input', function(){
    this.value = this.value
    .replace(/\D/g,'')
    .replace(/(\d{2})(\d)/, '($1) $2')
    .replace(/(\d{4,5})(\d)/, '$1-$2')
    .replace(/(\d{4})\d+?$/, '$1');
    
});

maskCep.addEventListener('input', function(){
    this.value = this.value
    .replace(/\D/g,'')
    .replace(/(\d{5})(\d)/, '$1-$2')
    .replace(/(-\d{3})\d+?$/, '$1');
});


// consumo api
const limparFormularioCep = () =>{
    document.querySelector('#uf').value = ('');
    document.querySelector('#cidade').value = ('');
    document.querySelector('#bairro').value = ('');
    document.querySelector('#logradouro').value= ('');
    document.querySelector('#complemento').value = ('');

}

const meuCallback = (conteudo) => {
    if(!("erro" in conteudo)) {
        document.querySelector('#uf').value = (conteudo.uf);
        document.querySelector('#cidade').value = (conteudo.localidade);
        document.querySelector('#bairro').value = (conteudo.bairro);
        document.querySelector('#logradouro').value = (conteudo.logradouro);
        document.querySelector('#complemento').value = (conteudo.complemento);
    }
    else{
        limparFormularioCep();
        alert("CEP não encontrado.");
    }

   
}

pesquisaCep.addEventListener('blur', function() {
    let cep = document.querySelector('#Cep').value.replace(/\D/g, '');

    if (cep != '') {
        let validaCep = /^[0-9]{8}$/;

        if (validaCep.test(cep)) {
            document.querySelector('#uf').value = "buscando...";
            document.querySelector('#cidade').value = "buscando...";
            document.querySelector('#bairro').value = "buscando...";
            document.querySelector('#logradouro').value = "buscando...";
            document.querySelector('#complemento').value = "buscando...";

            let script = document.createElement('script');

            script.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=meuCallback';

            document.body.appendChild(script);
        }
        else {
            limparFormularioCep();
            alert("Formato do CEP inválido.");
        }
    }
    else {
        limparFormularioCep();
    }
});