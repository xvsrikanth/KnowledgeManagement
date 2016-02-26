package xv.km.webservices.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import xv.km.webservices.base.KElement;
import xv.km.webservices.base.KElementColl;

@Entity
@Table(name = "kelement")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ModelKElement extends KElement {

	private static final long serialVersionUID = 1L;

	public ModelKElement() {

	}

	public ModelKElement(int kElementId, String kElementName, String kElementDescription, String kElementCreatedBy,
			Timestamp kElementCreatedDate, String kElementUpdatedBy, Timestamp kElementUpdatedDate) {
		super(kElementId, kElementName, kElementDescription, kElementCreatedBy, kElementCreatedDate, kElementUpdatedBy,
				kElementUpdatedDate);

	}

	public void init() {
		this.kElementId = 0;
		this.kElementName = null;
		this.kElementDescription = null;
		this.kElementCreatedBy = null;
		this.kElementCreatedDate = null;
		this.kElementUpdatedBy = null;
		this.kElementUpdatedDate = null;
	}

	/* Annotations for properties mapped to getter methods */

	@Id
	@Column(name = "kelementid")
	@Override
	public int getkElementId() {
		return kElementId;
	}

	@Column(name = "kelementname")
	@Override
	public String getkElementName() {
		return kElementName;
	}

	@Column(name = "kelementdescription")
	@Override
	public String getkElementDescription() {
		return kElementDescription;
	}

	@Column(name = "createdby")
	@Override
	public String getkElementCreatedBy() {
		return kElementCreatedBy;
	}

	@Column(name = "createddate")
	@Override
	public Timestamp getkElementCreatedDate() {
		return kElementCreatedDate;
	}

	@Column(name = "updatedby")
	@Override
	public String getkElementUpdatedBy() {
		return kElementUpdatedBy;
	}

	@Column(name = "updateddate")
	@Override
	public Timestamp getkElementUpdatedDate() {
		return kElementUpdatedDate;
	}

	@Override
	public KElementColl getParentKElements(int id) {
		return super.getParentKElements(id);
	}

	@Override
	public KElementColl getChildKElements(int id) {
		return super.getChildKElements(id);
	}
}
