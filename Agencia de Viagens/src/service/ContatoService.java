package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connector.ConexaoBanco;
import model.Contato;

public class ContatoService {
	
	public static void save() {
		Scanner sc = new Scanner(System.in);
		
		Contato contato = new Contato();
		
		System.out.println("Digite um nome de contato : ");
		contato.setNome(sc.nextLine());
		
		System.out.println("Informe um email valido : ");
		contato.setEmail(sc.nextLine());
		
		System.out.println("Informe o seu numero de telefone com ddd ; ");
		contato.setTelefone(sc.nextInt());
		
		System.out.println("Descreva a sua dúvida ou reclamação : ");
		contato.setTexto(sc.nextLine());
		
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
			
			System.out.println("Entraremos em contato com você o mais rápido possivel! Obrigada..");
			
			pstm.execute();
			pstm.close();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
