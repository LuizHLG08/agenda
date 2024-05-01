function validade() {
	let name = contactForm.name.value
	let phone = contactForm.phone.value
	
	if(name === "") {
		alert("Preencha o campo Nome")
		contactForm.name.focus()
		return false
	} else if (phone === "") {
		alert("Preencha o campo Fone")
		contactForm.phone.focus()
		return false
	} else {
		document.forms["contactForm"].submit()
	}
}