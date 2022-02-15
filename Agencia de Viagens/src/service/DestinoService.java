package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connector.ConexaoBanco;
import model.Destino;

public class DestinoService {
	
	public static void save() {
		Scanner sc = new Scanner(System.in);
		
		Destino destino = new Destino();
		
		System.out.println("DEstino: ");
		destino.setDestino(sc.nextLine());
		
		System.out.println("dataIda : ");
		destino.setdataIda(sc.nextInt());
		
		System.out.println("Informe o seu numero de telefone com ddd ; ");
		destino.setdataVolta(sc.nextInt());
		
		System.out.println("Descreva a sua d�vida ou reclama��o : ");
		destino.setQuantPessoas(sc.nextInt());
		
		String sql = "INSERT INTO Contato(nome, email, telefone, texto)VALUES(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConexaoBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, Contato.getNome());
			pstm.setString(2, Contato.getEmail());
			pstm.setInt(3, Contato.getTelefone());
			pstm.setString(4, Contato.getTexto());
			
			System.out.println("Entraremos em contato com voc� o mais r�pido possivel! Obrigada..");
			
			pstm.execute();
			pstm.close();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
