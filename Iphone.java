package aparelhoTelefônico;

public class Iphone 
{

	public static void main(String[] args) 
	{
		ReprodutorMusical reprodMusica = new ReprodutorMusical();
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		NavegadorInternet navegador = new NavegadorInternet();
		
		reprodMusica.tocar();
		reprodMusica.pausar();
		reprodMusica.selecionarMusica("Jorge Vercillo - Felicidade");
		
		telefone.atender();
		telefone.iniciarCorreioVoz();
		telefone.ligar("PEDRO");
		
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		navegador.exibirPagina("GOOGLE");
		
	}

}
