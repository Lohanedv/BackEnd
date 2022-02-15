import service.CadastroService;
import service.ContatoService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		service.CadastroService cadastroService = new CadastroService();
		cadastroService.save();
		
		service.ContatoService contatoService = new ContatoService();
		contatoService.save();
		
		

	}

}
