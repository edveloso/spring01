package modelo;



public class FuncionarioHorista extends Funcionario {
   
	
	//Colocar os m�todos espec�ficos de horista
	
	@Override
	public Double getSalario() {
		return super.getSalario() * 220;
	}
	
}
