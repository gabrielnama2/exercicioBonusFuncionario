package ufes.exercicio.bonus;

public class Bonus{
    private String tipo;
    private double valor;

    public Bonus(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Bônus recebido: " + tipo + ": " + valor + " R$";
    }
}