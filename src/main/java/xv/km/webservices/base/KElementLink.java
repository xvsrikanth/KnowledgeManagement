package xv.km.webservices.base;

import java.io.Serializable;

public class KElementLink implements Serializable {
	private static final long serialVersionUID = 1L;

	protected int id;

	protected int kElementLinkId;

	protected int kElementLinkParentId;
	
	protected int kElementLinkChildId;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getkElementLinkId() {
		return kElementLinkId;
	}

	public void setkElementLinkId(int kElementLinkId) {
		this.kElementLinkId = kElementLinkId;
	}

	public int getkElementLinkParentId() {
		return kElementLinkParentId;
	}

	public void setkElementLinkParentId(int kElementLinkParentId) {
		this.kElementLinkParentId = kElementLinkParentId;
	}

	public int getkElementLinkChildId() {
		return kElementLinkChildId;
	}

	public void setkElementLinkChildId(int kElementLinkChildId) {
		this.kElementLinkChildId = kElementLinkChildId;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
