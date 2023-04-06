public class BonusDistanciaTrabalho implements IMetodoCalculoBonus{
  @Override
  public void calcular(Funcionario funcionario){
    if(funcionario.distanciaTrabalho > 50){
      funcionario.tipoBonus.add(new Bonus("Distancia do trabalho", 50));
    }
  }
}