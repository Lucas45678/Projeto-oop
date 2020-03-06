package poo;

public class Employee {

	private Integer id; 
	private String nome;
	private Double salario; 
	
	public Employee(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario; 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	/* Esse metodo vai ficar inativo, pois o salario n�o 
	 * pode ser alterado diretamento atraves de um metodo
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	*/ 
	
	
	
}
