import java.util.*;
import java.ArrayList;
import java.List;

public class Funcionario{
  private double salarioInicial;
  private double salarioFinal;
  private int idade;
  private double distanciaTrabalho;
  private int numDependentes;
  private ArrayList<Bonus> bonusRecebidos;

  public Funcionario(double salario, int idade, double distancia, int dependentes){
    this.salarioInicial = salario;
    this.idade = idade;
    this.distanciaTrabalho = distancia;
    this.numDependentes = dependentes;
    this.salarioFinal = 0.0;
  }
  
  public calculaSalario(){
    
  }
  
  public double getDistanciaTrabalho(){
    return this.distanciaTrabalho;
  }
  public int getIdade(){
    return this.idade;
  }
  public int numDependentes(){
    return this.numDependentes;
  }
}