const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
	// cancela o evento submit
	event.preventDefault();

	// declaração de variável
	let nome = document.querySelector('#nome').value;

	if(nome == '') {
		alert('Informe um nome!');
	} else {
		alert(nome);
	}

	form.reset();
});



alert(nome);