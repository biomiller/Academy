import java.util.HashMap;

public class MemberManager implements Updateable{
	
	private HashMap <Integer,Member> memberMap;
	
	public MemberManager() {
		this.memberMap = new HashMap <Integer,Member> ();
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}



	
	public HashMap<Integer, Member> removeMemberById(int id){
		memberMap.remove(id);
		return memberMap;
	}
	
	public HashMap<Integer, Member> addNewMember(Member newMember){
		memberMap.put(newMember.getId(),newMember);
		return memberMap;
	}
	
	public Member getMemberById(int id){
		memberMap.get(id);
		return memberMap.get(id);
	}
	
	
	public HashMap<Integer, Member> getMemberMap() {
		return memberMap;
	}

	public void setMemberMap(HashMap<Integer, Member> memberMap) {
		this.memberMap = memberMap;
	}
	
	
	

}
