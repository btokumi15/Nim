public class TokumiNim
{
  int numberOfPieces = 0;
  
  public TokumiNim()
  {
    numberOfPieces = 13;
  }
  
  public TokumiNim(int numPieces)
  {
    numberOfPieces = numPieces;
  }
  public int play(int pieces)
  {
    if (pieces > 3) return (pieces - 4) % 3;
    else if (pieces == 3) return 2;
    else return 1;
  }
  
}
