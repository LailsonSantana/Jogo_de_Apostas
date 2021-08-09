/* ***************************************************************
* Autor: nome(s) do(s) autor(es) do codigo
* Matricula: numero de matricula(s)
* Inicio: 29/07/2021 22:50
* Ultima alteracao: data da ultima alteracao realizada no codigo
* Nome: Nome do programa
* Funcao: descricao do que eh o programa
*************************************************************** */

package modelo;

public class Jogador {

  private String nome;
  private String idade;
  private double pontuacao;

  public Jogador(String nome,String idade){
    this.nome = nome;
    this.idade = idade;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setIdade(String idade){
    this.idade = idade;
  }

  public String getIdade(){
    return this.idade;
  }

  public void setPontuacao(double pontuacao){
    this.pontuacao = pontuacao;
  }

  public double getPontuacao(){
    return this.pontuacao;
  }
  
}
