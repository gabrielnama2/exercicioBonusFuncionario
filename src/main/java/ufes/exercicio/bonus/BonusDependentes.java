package ufes.exercicio.bonus;
import ufes.exercicio.funcionarios.Funcionario;

public class BonusDependentes implements IMetodoCalculoBonus{
    
    @Override
    public double calcular(Funcionario funcionario) {
        if(funcionario.getNumDependentes() > 3){
            funcionario.addBonusRecebido(new Bonus("Número de Dependentes", 75.0));
            return 75.0;
        }
        return 0;
    }
}