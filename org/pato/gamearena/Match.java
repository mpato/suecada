package org.pato.gamearena;

import java.util.Vector;

public abstract class Match
{
  public final static byte NO_MATCH = 0;
  public final static byte CMD_MATCH_CREATE = 0;
  public final static byte RESP_ERROR_FATAL = 0;
  public Vector<Player> players;
  public boolean isClosed;
  private byte matchNumber;
  private static byte matchesCounter = 0;

  public Match()
  {
    players = new Vector<Player>();
    isClosed = false;
    matchNumber = matchesCounter ++;
  }

  public byte getNumber()
  {
    return matchNumber;
  }

  protected byte[] createReponse(byte ...resp)
  {
    byte response[];
    response = new byte[resp.length + 1];//index 0 is reserved for the number of the match
    System.arraycopy(resp, 0, response, 1, resp.length);
    return response;
  }

  //command[0] and response[0] are reserved for the number of the macth
  synchronized public byte[] runSynchronizedCommand(Player player, byte[] command)
  {
    byte response[];
    try {
      response = runCommand(player, command);
      response[0] = matchNumber;
      return response;
    } catch (Exception e) {
      return new byte[] {NO_MATCH, RESP_ERROR_FATAL, matchNumber};
    }
  }

  abstract public byte[] runCommand(Player player, byte[] command);
}
