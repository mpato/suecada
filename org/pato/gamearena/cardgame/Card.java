package org.pato.gamearena.cardgame;

public class Card
{
  public final static int NAIPE_COPAS = 1;
  public final static int NAIPE_OUROS = 2;
  public final static int NAIPE_PAUS = 3;
  public final static int NAIPE_ESPADAS = 4;
  public final static int KNIGHT = 11;
  public final static int QUEEN = 12;
  public final static int KING = 13;
  public final static int ACE = 14;

  public static byte toByte(int naipe, int value)
  {
    return (byte)((naipe << 4) | value);
  }
}
