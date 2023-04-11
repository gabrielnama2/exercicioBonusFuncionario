package ufes.exercicio.bonus;
import ufes.exercicio.funcionarios.Funcionario;
import java.util.ArrayList;

public class CalculoSalarioFinalService{
  private ArrayList<IMetodoCalculoBonus> todosBonus;

  public CalculoSalarioFinalService(Funcionario funcionario){
    this.todosBonus = new ArrayList<>();
    this.todosBonus.add(new BonusIdade());
    this.todosBonus.add(new BonusDistanciaTrabalho());
    this.todosBonus.add(new BonusDependentes());
    //this.calcularSalarioFinal(funcionario);
  }

  public void calcularSalarioFinal(Funcionario funcionario){
    double bonusTotal = 0;
    for(int i=0; i<this.todosBonus.size(); i++){
        bonusTotal += this.todosBonus.get(i).calcular(funcionario);
    }
    funcionario.informarDados();
    System.out.println("Salário Final: " + (funcionario.getSalarioBase() + bonusTotal) + " R$");
  }
  
}