package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connector.ConexaoBanco;
import model.Cadastro;

public class CadastroService {
	
	public static void save() {
		Scanner sc = new Scanner(System.in);
		
		Cadastro cadastro = new Cadastro();
		
		System.out.println("Para fazer o login digite o seu nome : ");
		cadastro.setNome(sc.nextLine());
		
		System.out.println("Agora, informe o seu email para cadastro : ");
		cadastro.setEmail(sc.nextLine());
		
		System.out.println("Digite uma senha f?cil de lembrar ; ");
		cadastro.setSenha(sc.nextInt());
		
		String sql = "INSERT INTO Cadastro(nome, email, senha)VALUES(?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConexaoBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, Cadastro.getNome());
			pstm.setString(2, Cadastro.getEmail());
			pstm.setInt(3, Cadastro.getSenha());
			
			System.out.println("Parab?ns, cadastro efetuado com sucesso.");
			
			pstm.execute();
			pstm.close();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
