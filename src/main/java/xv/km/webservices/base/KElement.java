package xv.km.webservices.base;

import java.io.Serializable;
import java.sql.Timestamp;

public class KElement implements Serializable {
	private static final long serialVersionUID = 1L;

	protected int kElementId;

	protected String kElementName;

	protected String kElementDescription;

	protected String kElementCreatedBy;

	protected Timestamp kElementCreatedDate;

	protected String kElementUpdatedBy;

	protected Timestamp kElementUpdatedDate;

	protected KElementColl parentKElements;

	protected KElementColl childKElements;

	public KElement() {
		// TODO Auto-generated constructor stub
	}

	public KElement(int kElementId, String kElementName, String kElementDescription, String kElementCreatedBy,
			Timestamp kElementCreatedDate, String kElementUpdatedBy, Timestamp kElementUpdatedDate) {
		this.kElementId = kElementId;
		this.kElementName = kElementName;
		this.kElementDescription = kElementDescription;
		this.kElementCreatedBy = kElementCreatedBy;
		this.kElementCreatedDate = kElementCreatedDate;
		this.kElementUpdatedBy = kElementUpdatedBy;
		this.kElementUpdatedDate = kElementUpdatedDate;
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

	public int getkElementId() {
		return kElementId;
	}

	public void setkElementId(int kElementId) {
		this.kElementId = kElementId;
	}

	public String getkElementName() {
		return kElementName;
	}

	public void setkElementName(String kElementName) {
		this.kElementName = kElementName;
	}

	public String getkElementDescription() {
		return kElementDescription;
	}

	public void setkElementDescription(String kElementDescription) {
		this.kElementDescription = kElementDescription;
	}

	public String getkElementCreatedBy() {
		return kElementCreatedBy;
	}

	public void setkElementCreatedBy(String kElementCreatedBy) {
		this.kElementCreatedBy = kElementCreatedBy;
	}

	public Timestamp getkElementCreatedDate() {
		return kElementCreatedDate;
	}

	public void setkElementCreatedDate(Timestamp kElementCreatedDate) {
		this.kElementCreatedDate = kElementCreatedDate;
	}

	public String getkElementUpdatedBy() {
		return kElementUpdatedBy;
	}

	public void setkElementUpdatedBy(String kElementUpdatedBy) {
		this.kElementUpdatedBy = kElementUpdatedBy;
	}

	public Timestamp getkElementUpdatedDate() {
		return kElementUpdatedDate;
	}

	public void setkElementUpdatedDate(Timestamp kElementUpdatedDate) {
		this.kElementUpdatedDate = kElementUpdatedDate;
	}

	public KElementColl getParentKElements(int id) {
		return parentKElements;
	}

	public void setParentKElements(KElementColl parentKElements) {
		this.parentKElements = parentKElements;
	}

	public void clearParentKElments() {
		this.parentKElements.clear();
	}

	public KElementColl getChildKElements(int id) {
		return childKElements;
	}

	public void setChildKElements(KElementColl childKElements) {
		this.childKElements = childKElements;

	}

	public void clearChildKElments() {
		this.childKElements.clear();
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

}
