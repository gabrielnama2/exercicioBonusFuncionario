package ufes.exercicio.funcionarios;
import ufes.exercicio.bonus.Bonus;
import java.util.ArrayList;
import ufes.exercicio.bonus.Bonus;

public class Funcionario{
  private String nome;
  private double salarioBase;
  private double salarioFinal = 0;
  private int idade;
  private double distanciaTrabalho;
  private int numDependentes;
  private ArrayList<Bonus> bonusRecebidos;

  public Funcionario(String nome, double salario, int idade, double distancia, int dependentes){
    this.nome = nome;
    this.salarioBase = salario;
    this.idade = idade;
    this.distanciaTrabalho = distancia;
    this.numDependentes = dependentes;
    this.bonusRecebidos = new ArrayList<>();
  }
  
  public void addBonusRecebido(Bonus bonus){
      this.bonusRecebidos.add(bonus);
  }
  
  public String getNome(){
      return this.nome;
  }
  public double getSalarioBase(){
      return this.salarioBase;
  }
  public double getDistanciaTrabalho(){
    return this.distanciaTrabalho;
  }
  public int getIdade(){
    return this.idade;
  }
  public int getNumDependentes(){
    return this.numDependentes;
  }
  public ArrayList<Bonus> getBonusRecebidos(){
      return this.bonusRecebidos;
  }
  public void informarDados(){
      System.out.println("Funcionário: " + this.getNome() + "\n"
              + "Salário Base: " + this.getSalarioBase() + " R$\n");
      if(this.bonusRecebidos.size() == 0){
          System.out.println("Bônus recebido: Não recebeu bônus.");
      }
      for (int i = 0; i < this.bonusRecebidos.size(); i++) {
          System.out.println(this.bonusRecebidos.get(i).toString()); 
      }
  }
}