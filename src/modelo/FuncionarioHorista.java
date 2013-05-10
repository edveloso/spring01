package modelo;



public class FuncionarioHorista extends Funcionario {
   
	
	//Colocar os métodos específicos de horista
	
	@Override
	public Double getSalario() {
		return super.getSalario() * 220;
	}
	
}
