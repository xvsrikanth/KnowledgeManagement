package xv.km.webservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "kelementbasis")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ModelKElementBasis {

	private Long kElementBasisId;

	private String kElementBasisName;

	private String kElementBasisDesc;

	@Id
	@Column(name = "kelementbasisid")
	public Long getkElementBasisId() {
		return kElementBasisId;
	}

	public void setkElementBasisId(Long kElementBasisId) {
		this.kElementBasisId = kElementBasisId;
	}

	@Column(name = "kelementbasisname")
	public String getkElementBasisName() {
		return kElementBasisName;
	}

	public void setkElementBasisName(String kElementBasisName) {
		this.kElementBasisName = kElementBasisName;
	}

	@Column(name = "kelementbasisdesc")
	public String getkElementBasisDesc() {
		return kElementBasisDesc;
	}

	public void setkElementBasisDesc(String kElementBasisDesc) {
		this.kElementBasisDesc = kElementBasisDesc;
	}

}
