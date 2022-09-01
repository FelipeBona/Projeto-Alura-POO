
public class TesteFuncionario {

	public static void main(String[] args) {
	 
		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Seppat");
		nico.setCpf("124242");
		nico.setSalario(123.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
