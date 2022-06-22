public interface MemberService{
  public int getMemberById();
  public long getMemberByAdharNo();
  public String getMemberByPanNo();
  public Member addMember();
  public Member updateMember();
  public boolean deleteMember();
}