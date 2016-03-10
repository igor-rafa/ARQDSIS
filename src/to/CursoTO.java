package Curso;

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
}
