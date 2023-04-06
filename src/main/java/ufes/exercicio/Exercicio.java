package ufes.exercicio;
import ufes.exercicio.bonus.CalculoSalarioFinalService;
import ufes.exercicio.funcionarios.Funcionario;

public class Exercicio {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario ("Gabriel", 1000.00, 25, 80, 1);
        CalculoSalarioFinalService calculoSalarioFinal = new CalculoSalarioFinalService(funcionario);
        calculoSalarioFinal.calcularSalarioFinal(funcionario);
    }
}
