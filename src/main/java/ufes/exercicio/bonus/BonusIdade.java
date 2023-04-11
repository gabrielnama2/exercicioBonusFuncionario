package ufes.exercicio.bonus;
import ufes.exercicio.funcionarios.Funcionario;

public class BonusIdade implements IMetodoCalculoBonus{
    
    @Override
    public double calcular(Funcionario funcionario) {
        if(funcionario.getIdade() > 40){
            funcionario.addBonusRecebido(new Bonus("Idade", 25.0));
            return 25.0;
        }
        return 0;
    }
}