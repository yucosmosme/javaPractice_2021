package ch5_14;

public class Member {

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member(int memberId, String memberName){ //생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {  //
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString(){   //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }

    // 이 메서드가 있으면 Member 요소 추가할때
    // 기존에 동일한 게 있는지 확인하여 있으면 추가 안해줌
    // equals 는 override 가능
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member){
            Member member = (Member) obj;
            //동일한 아이디면 true반환
            if (this.memberId == member.memberId){
                return true;
            }
            else return false;
        }
        return false;
    }

    // eqauls() 를 오버라이딩 해 올바른 결과를 돌려줄 수 있도록 하는데 이때
    // HashMap 이나 HashSet, HashTable 과 같은 객체들을 사용하는 경우, 객체의 의미상의 동등성 비교를 위해 hashCode() 를 호출한다.
    @Override
    public int hashCode() {
        return memberId;
    }
}
