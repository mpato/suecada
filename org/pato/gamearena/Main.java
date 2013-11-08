package org.pato.gamearena;

import org.pato.gamearena.cardgame.Card;

public class Main
{
  public static void main(String args[])
  {
    System.out.println("Card : " + String.format("%c",Card.toByte(Card.NAIPE_OUROS, Card.ACE)));
  }
}
