function validade() {
	let nome = contactForm.nome.value
	let fone = contactForm.fone.value
	
	if(nome === "") {
		alert("Preencha o campo Nome")
		contactForm.nome.focus()
		return false
	} else if (fone === "") {
		alert("Preencha o campo Fone")
		contactForm.fone.focus()
		return false
	} else {
		document.forms["contactForm"].submit()
	}
}