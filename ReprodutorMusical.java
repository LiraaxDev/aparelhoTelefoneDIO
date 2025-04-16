package aparelhoTelefônico;

import java.util.Scanner;

public class ReprodutorMusical
{
	public void tocar()
	{
		System.out.println("TOCANDO MUSICA");
	}
	public void pausar()
	{
		System.out.println("PAUSANDO MUSICA");
	}
	public void selecionarMusica(String musica)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ESCOLHA A SUA MÚSICA");
		System.out.println("Tocando: " + musica);
		sc.close();
	}
}
