
public class Teste {
	
	/*
	Modificação da classe bem sucedida no repositorio.
	Tentando recuperar os dados de commit perdidos com um CHECKOUT equivocado.
	Foi preciso apagar a pasta e clonar novamente.
	*/

	public String nome;
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		System.out.println("Teste 1");
		teste.setNome("Alessandro");
		System.out.print(teste.getNome());

	}

}
