public interface IdCardRepository
{
  public Idcard getPanCardByNumber(String panNo);
  public Idcard getAdharCardByNo(long adharno);
  public Idcard addIdCard(Idcard idcard);
}