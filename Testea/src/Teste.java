
public class Teste {

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
