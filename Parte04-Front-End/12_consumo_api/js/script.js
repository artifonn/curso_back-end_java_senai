const form = document.querySelector('form');
const campoCpf = document.querySelector('#cpf');
const campoTelefone = document.querySelector('#telefone');
const campoCep = document.querySelector('#cep');
const consultaCep = document.querySelector('#cep');
const dados = document.querySelector('#dados');

const cepValido = /^\d{5}-?\d{3}$/;
const emailValido = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
const cpfValido = /^\d{3}\.\d{3}\.\d{3}\-\d{2}$/;

const campoEmail = document.querySelector('#email');

const limparFormulario = () => {
	document.querySelector('#estado').value = '';
	document.querySelector('#cidade').value = '';
	document.querySelector('#bairro').value = '';
	document.querySelector('#logradouro').value = '';
	document.querySelector('#complemento').value = '';
};

const meuCallback = (conteudo) => {

	if (!('erro' in conteudo)) {

		document.querySelector('#estado').value = conteudo.uf;
		document.querySelector('#cidade').value = conteudo.localidade;
		document.querySelector('#bairro').value = conteudo.bairro;
		document.querySelector('#logradouro').value = conteudo.logradouro;
		document.querySelector('#complemento').value = conteudo.complemento;

	} else {

		limparFormulario();
		alert('CEP inválido.');

	}
};

consultaCep.addEventListener('blur', () => {

	const valorCep = campoCep.value.replace(/\D/g, '');

	if (cepValido.test(valorCep)) {

		document.querySelector('#estado').value = 'Buscando...';
		document.querySelector('#cidade').value = 'Buscando...';
		document.querySelector('#bairro').value = 'Buscando...';
		document.querySelector('#logradouro').value = 'Buscando...';
		document.querySelector('#complemento').value = 'Buscando...';

		const script = document.createElement('script');

		script.src = `https://viacep.com.br/ws/${valorCep}/json/?callback=meuCallback`;

		document.body.appendChild(script);

	} else {

		limparFormulario();
		alert('CEP inválido.');

	}
});

form.addEventListener('submit', (e) => {

	e.preventDefault();

	const nome = document.querySelector('#nome').value;
	const email = campoEmail.value;
	const cpf = campoCpf.value;
	const telefone = campoTelefone.value;
	const cep = campoCep.value;

	const estado = document.querySelector('#estado').value;
	const cidade = document.querySelector('#cidade').value;
	const bairro = document.querySelector('#bairro').value;
	const logradouro = document.querySelector('#logradouro').value;
	const numero = document.querySelector('#numero').value;
	const complemento = document.querySelector('#complemento').value;

	if (!emailValido.test(email)) {
		alert('E-mail inválido.');
		return;
	}

	if (!cpfValido.test(cpf)) {
		alert('CPF inválido.');
		return;
	}

	dados.innerHTML = `
		<b>Nome:</b> ${nome} <br>
		<b>E-mail:</b> ${email} <br>
		<b>CPF:</b> ${cpf} <br>
		<b>Telefone:</b> ${telefone} <br>
		<b>CEP:</b> ${cep} <br>
		<b>Estado:</b> ${estado} <br>
		<b>Cidade:</b> ${cidade} <br>
		<b>Bairro:</b> ${bairro} <br>
		<b>Logradouro:</b> ${logradouro} <br>
		<b>Número:</b> ${numero} <br>
		<b>Complemento:</b> ${complemento} <br>
	`;

	form.reset();
});