package model;

public class Cadastro {
	
	private Integer id;
	private static String nome;
	private static String email;
	private static Integer senha;

public Cadastro() {
	
}

public Cadastro(String nome, String email, Integer senha) {
	this.nome = nome;
	this.email = email;
	this.senha = senha;
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

public static Integer getSenha() {
	return senha;
}

public void setSenha(Integer senha) {
	this.senha = senha;
}

}
