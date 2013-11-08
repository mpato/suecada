package org.pato.suecada;

import org.pato.gamearena.Match;
import org.pato.gamearena.Player;

public class SuecadaMatch extends Match
{
  public final static int CMD_JOIN = 1;
  public final static int CMD_PAIR_WITH = 2;
  public final static int CMD_PUT_CARD = 3;
  public final static int CMD_GET_STATE = 4;
  public final static int CMD_CLOSE = 5;
  public final static byte RESP_PLAYER_REJECTED = 1;


  public byte[] runCommand(Player player, byte[] command)
  {
    if (!players.contains(player) && command[0] != CMD_JOIN)
      return createReponse(RESP_PLAYER_REJECTED);

    switch(command[1]) { // index 0 is reserved for the number of the match
      case CMD_JOIN:

    }
    return new byte[1];
  }

}
