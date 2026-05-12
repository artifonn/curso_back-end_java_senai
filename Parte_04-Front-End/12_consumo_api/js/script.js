const form = document.querySelector('form');
const campoNome = document.querySelector('#nome');
const campoEmail = document.querySelector('#email');
const campoCpf = document.querySelector('#cpf');
const campoCep = document.querySelector('#cep');
const campoEstado = document.querySelector('#estado');
const campoCidade = document.querySelector('#cidade');
const campoBairro = document.querySelector('#bairro');
const campoLogradouro = document.querySelector('#logradouro');
const campoNumero = document.querySelector('#numero');
const campoComplemento = document.querySelector('#complemento');
const containerDados = document.querySelector('#dados');

const botaoEnviar = document.querySelector('.btn-success');

const emailValido = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
const cpfValido = /^\d{3}\.?\d{3}\.?\d{3}-?\d{2}$/;

const atualizarCamposEndereco = (estado = '', cidade = '', bairro = '', logradouro = '', complemento = '') => {
  campoEstado.value = estado;
  campoCidade.value = cidade;
  campoBairro.value = bairro;
  campoLogradouro.value = logradouro;
  campoComplemento.value = complemento;
};

campoCep.addEventListener('blur', async () => {
  const cepLimpo = campoCep.value.replace(/\D/g, '');

  if (cepLimpo.length !== 8) {
    if (cepLimpo.length > 0) alert('CEP inválido. Digite os 8 números.');
    atualizarCamposEndereco();
    return;
  }

  atualizarCamposEndereco('Buscando...', 'Buscando...', 'Buscando...', 'Buscando...', 'Buscando...');

  try {
    const resposta = await fetch(`https://viacep.com.br/ws/${cepLimpo}/json/`);
    const dadosCep = await resposta.json();

    if (dadosCep.erro) {
      atualizarCamposEndereco();
      alert('CEP não encontrado.');
      return;
    }

    atualizarCamposEndereco(
      dadosCep.uf,
      dadosCep.localidade,
      dadosCep.bairro,
      dadosCep.logradouro,
      dadosCep.complemento
    );

    campoNumero.focus();
  } catch (erro) {
    atualizarCamposEndereco();
    alert('Erro ao buscar o CEP. Verifique sua conexão.');
    console.error('Erro ViaCEP:', erro);
  }
});

const processarEnvio = () => {
  if (!form.checkValidity()) {
    form.reportValidity();
    return;
  }

  const email = campoEmail.value.trim();
  const cpf = campoCpf.value.trim();

  if (!emailValido.test(email)) {
    alert('E-mail inválido.');
    campoEmail.focus();
    return;
  }

  if (!cpfValido.test(cpf)) {
    alert('CPF inválido.');
    campoCpf.focus();
    return;
  }

  containerDados.innerHTML = '';

  containerDados.className = 'mt-5 p-4 fs-6 fw-normal alert alert-success shadow-sm';

  const listaDados = [
    { label: 'Nome', value: campoNome.value },
    { label: 'E-mail', value: email },
    { label: 'CPF', value: cpf },
    { label: 'CEP', value: campoCep.value },
    { label: 'Estado', value: campoEstado.value },
    { label: 'Cidade', value: campoCidade.value },
    { label: 'Bairro', value: campoBairro.value },
    { label: 'Logradouro', value: campoLogradouro.value },
    { label: 'Número', value: campoNumero.value },
    { label: 'Complemento', value: campoComplemento.value || 'Nenhum' }
  ];

  listaDados.forEach(item => {
    const linha = document.createElement('div');
    linha.className = 'mb-1';

    const negrito = document.createElement('strong');
    negrito.textContent = `${item.label}: `;

    linha.appendChild(negrito);
    linha.appendChild(document.createTextNode(item.value));
    containerDados.appendChild(linha);
  });

  form.reset();
};

form.addEventListener('submit', (e) => {
  e.preventDefault();
  processarEnvio();
});

botaoEnviar.addEventListener('click', processarEnvio);