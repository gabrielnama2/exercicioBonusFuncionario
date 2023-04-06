public class CalculoSalarioFinalService{
  private ArrayList<IMetodoCalculoBonus> todosBonus;

  CalculoSalarioFinalService(Funcionario funcionario){
    this.todosBonus.add(new BonusDistanciaTrabalho(funcionario));
  }
  
  public calcularSalarioFinal(Funcionario funcionario){
    
  }
  
}