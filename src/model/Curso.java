package Curso;

public class Curso {
	private int codigo, numeroDeVagas;
	   private String nome, tipo, dataDeInicio, dataDeTermino, horario, tipoLab, softwares, livros, descricaoMaterial;
	   private double valor;
	   
	   public Curso(){
	     
	      codigo = 0;
	      nome = "";
	      tipo = "";
	      dataDeInicio = "";
	      dataDeTermino = "";
	      horario = "";
	      numeroDeVagas = 0;
	      valor = 0.0;
	      tipoLab = "";
	      softwares = "";
	      livros = "";
	      descricaoMaterial = "";
	   }
	   
	   public Curso(int nvCodigo, String nvNome, String nvTipo, String nvDataDeInicio, String nvDataDeTermino, String nvHorario, double nvValor, int nvNumeroDeVagas, String nvTipoLab, String nvSoftwares, String nvLivros, String nvDescricao){  
	      
	      codigo = nvCodigo;
	      nome = nvNome;
	      tipo = nvTipo;
	      dataDeInicio = nvDataDeInicio;
	      dataDeTermino = nvDataDeTermino;
	      horario = nvHorario;
	      valor = nvValor;
	      numeroDeVagas = nvNumeroDeVagas;
	      tipoLab = nvTipoLab;
	      softwares = nvSoftwares;
	      livros = nvLivros;
	      descricaoMaterial = nvDescricao;
	   }
	   
	   
	   
	   //Métodos de Modificação
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
