package model;

public class Contato {
	
	private Integer id;
	private static String nome;
	private static String email;
	private static Integer telefone;
	private static String texto;

public Contato() {
	
}

public Contato(String nome, String email, Integer telefone, String texto) {
	super();
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	this.texto = texto;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public static String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public static String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public static Integer getTelefone() {
	return telefone;
}

public void setTelefone(Integer telefone) {
	this.telefone = telefone;
}
public static String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

}
