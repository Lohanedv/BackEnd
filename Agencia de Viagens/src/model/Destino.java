package model;

public class Destino {
	
	private Integer id;
	private static String destino;
	private static Integer dataIda;
	private static Integer dataVolta;
	private static Integer quantPessoas;

public Destino() {
	
}

public Destino(String destino, Integer dataIda, Integer dataVolta, Integer quantPessoas) {
	this.destino = destino;
	this.dataIda = dataIda;
	this.dataVolta = dataVolta;
	this.quantPessoas = quantPessoas;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public static String getDestino() {
	return destino;
}

public static void setDestino(String destino) {
	Destino.destino = destino;
}

public static Integer getDataIda() {
	return dataIda;
}

public static void setDataIda(Integer dataIda) {
	Destino.dataIda = dataIda;
}

public static Integer getDataVolta() {
	return dataVolta;
}

public static void setDataVolta(Integer dataVolta) {
	Destino.dataVolta = dataVolta;
}

public static Integer getQuantPessoas() {
	return quantPessoas;
}

public static void setQuantPessoas(Integer quantPessoas) {
	Destino.quantPessoas = quantPessoas;
}

}