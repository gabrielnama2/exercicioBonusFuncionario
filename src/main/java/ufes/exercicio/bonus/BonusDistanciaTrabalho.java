package ufes.exercicio.bonus;
import ufes.exercicio.funcionarios.Funcionario;

public class BonusDistanciaTrabalho implements IMetodoCalculoBonus{
    
    @Override
    public double calcular(Funcionario funcionario) {
        if(funcionario.getDistanciaTrabalho() > 50){
            funcionario.addBonusRecebido(new Bonus("Distancia do trabalho", 50.0));
            return 50.0;
        }
        return 0;
    }
}