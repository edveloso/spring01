package modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculoSalario {

	@Autowired
	private Funcionario funcionario;
	
	public void calcularSalario(){
		System.out.println("Funcionario: " + funcionario.getNome());
		System.out.println(funcionario.getSalario()); 
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
}
