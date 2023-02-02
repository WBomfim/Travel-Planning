package com.trybe.acc.java.planejamentodeviagem;

import java.time.ZoneId;

// TODO: Excluir essa classe ao final do desafio
public class testes {

  public static void main(String[] args) {
    String[] fusosHorarios = new String[ZoneId.getAvailableZoneIds().size()];
    ZoneId.getAvailableZoneIds().toArray(fusosHorarios);
    System.out.println(fusosHorarios);

    for (int i = 0; i < fusosHorarios.length; i++) {
      System.out.println(fusosHorarios[i]);
    }
  }
}
