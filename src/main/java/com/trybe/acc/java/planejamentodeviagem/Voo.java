package com.trybe.acc.java.planejamentodeviagem;

/**
 * Class Voo.
 *
 */
public class Voo {

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {
    Double duracaoDouble = distanciaKm / 700.0;
    return duracaoDouble.intValue();
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(
      String embarque,
      String origem,
      String desembarque,
      String destino
  ) {
    StringBuilder informacaoVoo = new StringBuilder();
    informacaoVoo.append("Partida: " + embarque + "\n");
    informacaoVoo.append("Origem: " + origem + "\n");
    informacaoVoo.append("\n" + "\n");
    informacaoVoo.append("Chegada: " + desembarque + "\n");
    informacaoVoo.append("Destino: " + destino + "\n");

    return informacaoVoo.toString();
  }

}
