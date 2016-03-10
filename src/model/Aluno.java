public class Aluno {

	private String nome, dataNascimento, sexo, endereco, complemento, rg, cpf,
			email, telefone;
	private int codigo, numero;

	public Aluno() {

		codigo = 0;
		nome = "";
		dataNascimento = "";
		sexo = "";
		endereco = "";
		numero = 0;
		complemento = "";
		rg = "";
		cpf = "";
		email = "";
		telefone = "";

	}

	public Aluno(int codigo, String nome, String sexo,
			String dataNascimento, String nvEndereco, int numero,
			String complemento, String rg, String cpf, String telefone,
			String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.endereco = nvEndereco;
		this.numero = numero;
		this.complemento = complemento;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
	}

	// Métodos de acesso
	public int getCodigo() {

		return codigo;
	}

	public String getNome() {

		return nome;
	}

	public String getSexo() {

		return sexo;
	}

	public String getDataNascimento() {

		return dataNascimento;
	}

	public String getEndereco() {

		return endereco;
	}

	public int getNumero() {

		return numero;
	}

	public String getComplemento() {

		return complemento;
	}

	public String getRG() {

		return rg;
	}

	public String getCPF() {

		return cpf;
	}

	public String getEmail() {

		return email;
	}

	public String getTelefone() {

		return telefone;
	}

	// Métodos modificadores
	public void setNome(String nome) {

		this.nome = nome;
	}

	public void setSexo(String sexo) {

		this.sexo = sexo;
	}

	public void setDataNascimento(String nvData) {

		this.dataNascimento = nvData;
	}

	public void setCPF(String cpf) {

		this.cpf = cpf;
	}

	public void setRG(String rg) {

		this.rg = rg;
	}

	public void setEndereco(String nvEndereco) {

		this.endereco = nvEndereco;
	}

	public void setNumero(int numero) {

		this.numero = numero;
	}

	public void setComplemento(String complemento) {

		this.complemento = complemento;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public void setTelefone(String telefone) {

		this.telefone = telefone;
	}

}
