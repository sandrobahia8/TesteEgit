
public class Teste {
	
	/*
	Modificação da classe bem sucedida no repositorio.
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
