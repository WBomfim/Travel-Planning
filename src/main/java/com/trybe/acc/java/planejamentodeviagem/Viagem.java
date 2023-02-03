package com.trybe.acc.java.planejamentodeviagem;

/**
 * Class Viagem.
 *
 */
public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   * 
   */
  public Viagem(String embarque, String origem, String destino, double distanciaKm) {
    this.embarque = embarque;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    this.voo = new Voo();
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem = new Tempo(
        this.embarque, this.origem, this.destino, this.retornarDuracaoVoo()
    );
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    return this.voo.retornarTempoVoo(this.distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem = new Tempo(
        this.embarque, this.origem, this.destino, this.retornarDuracaoVoo()
    );
    
    StringBuilder informacaoViagem = new StringBuilder();

    informacaoViagem.append(this.voo.retornarInformacaoVoo(
        this.embarque,
        this.origem,
        tempoViagem.retonarDesembarqueHorarioLocalDestino(),
        this.destino
    ));
    informacaoViagem.append("\n" + "\n");
    informacaoViagem.append("Atenção:\n");
    informacaoViagem.append("O desembarque em " + this.destino + " será: ");
    informacaoViagem.append(tempoViagem.retonarDesembarqueHorarioLocalDestino());
    informacaoViagem.append(" no horário de " + this.destino + " e ");
    informacaoViagem.append(tempoViagem.retonarDesembarqueHorarioLocalOrigem());
    informacaoViagem.append(" no horário de " + this.origem + ".");

    return informacaoViagem.toString();
  }
}
