package to;

public class CursoTO {
	private int codigo, numeroDeVagas;
	   private String nome, tipo, dataDeInicio, dataDeTermino, horario, tipoLab, softwares, livros, descricaoMaterial;
	   private double valor;
	//Métodos de acesso
	   public int getCodigo(){
	   
	      return codigo;   
	   }
	   
	   public String getNome(){
	      
	      return nome;    
	   }
	   
	   public String getTipo(){
	   
	      return tipo;
	   }
	   
	   public String getDataDeInicio(){
	   
	      return dataDeInicio;
	   }
	   
	   public String getDataDeTermino(){
	      
	      return dataDeTermino;
	   }
	   
	   public String getHorario(){
	   
	      return horario;
	   }
	   
	   public int getNumeroDeVagas(){
	   
	      return numeroDeVagas;
	   }
	   
	   public double getValor(){
	   
	      return valor;
	   }
	 
	   public String getTipoLab(){
	   
	      return tipoLab;
	   }
	   
	   public String getSoftwares(){
	   
	      return softwares;
	   }
	   
	   public String getLivros(){
	   
	      return livros;
	   }
	   
	   public String getDescricao(){
	   
	      return descricaoMaterial;
	   }
	   
	   //Métodos de Modificação
	   public void setCodigo(int cod){
		      codigo = cod;
		   }
	   
	   public void setNome(String nvNome){
	   
	      nome = nvNome;
	   }
	   
	   public void setTipo(String nvTipo){
	   
	      tipo = nvTipo;
	   }
	   
	   public void setDataDeInicio(String nvDataDeInicio){
	   
	      dataDeInicio = nvDataDeInicio;
	   }
	   
	   public void setDataDeTermino(String nvDataDeTermino){
	   
	      dataDeTermino = nvDataDeTermino;
	   }
	   
	   public void setHorario(String nvHorario){
	   
	      horario = nvHorario;
	   }
	   
	   public void setNumeroDeVagas(int nvNumeroDeVagas){
	   
	      numeroDeVagas = nvNumeroDeVagas;
	   }  
	   
	   public void setValor(double nvValor){
	   
	      valor = nvValor;
	   }
	   
	   public void setTipoLab(String nvTipoLab){
	   
	      tipoLab = nvTipoLab;
	   }
	   
	   public void setSoftwares(String nvSoftwares){
	   
	      softwares = nvSoftwares;
	   }
	   
	   public void setLivros(String nvLivros){
	   
	      livros = nvLivros;
	   }
	   
	   public void setDescricao(String nvDescricao){
	   
	      descricaoMaterial = nvDescricao;
	   }
}
