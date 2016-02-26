package xv.km.webservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import xv.km.webservices.base.KElementLink;

@Entity
@Table(name = "kelementlink")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ModelKElementLink extends KElementLink {
	
	public ModelKElementLink() {
	
	}

	public ModelKElementLink(int id, int kElementLinkId, int kElementLinkParentId, int kElementLinkChildId) {
		super();
		this.id=id;
		this.kElementLinkId = kElementLinkId;
		this.kElementLinkParentId = kElementLinkParentId;
		this.kElementLinkChildId = kElementLinkChildId;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@Override
	public int getId() {
		return id;
	}

	public void setkElementId(int kElementId) {

	}

	@Column(name = "kelementlinkid")
	@Override
	public int getkElementLinkId() {
		return kElementLinkId;
	}

	public void setkElementLinkId(int kElementLinkId) {

	}

	@Column(name = "kelementparentlinkid")
	@Override
	public int getkElementLinkParentId() {
		return kElementLinkParentId;
	}

	public void setkElementLinkParentId(int kElementLinkParentId) {

	}

	@Column(name = "kelementchildlinkid")
	@Override
	public int getkElementLinkChildId() {
		return kElementLinkChildId;
	}

	public void setkElementLinkChildId(int kElementLinkChildId) {

	}

}
