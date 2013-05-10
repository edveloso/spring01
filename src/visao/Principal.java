package visao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.CalculoSalario;
import modelo.Funcionario;
import modelo.FuncionarioHorista;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CalculoSalario calc = ctx.getBean(CalculoSalario.class); 
		calc.calcularSalario();
		
		Funcionario func = (Funcionario) ctx.getBean("funcHorista");
		calc.setFuncionario(func);
		calc.calcularSalario();
		
		
		
	}

}
