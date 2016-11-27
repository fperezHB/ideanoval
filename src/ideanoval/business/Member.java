package ideanoval.business;

public class Member {

	private boolean isActiveMember;

	public boolean isActiveMember() {
		return isActiveMember;
	}

	public void setActiveMember(boolean isActiveMember) {
		this.isActiveMember = isActiveMember;
	}

	@Override
	public String toString() {
		return "Member [isActiveMember=" + isActiveMember + "]";
	}

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

}
