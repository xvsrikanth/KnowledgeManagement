package xv.km.webservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "kelementcanvas")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ModelKElementCanvas {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "kelementcanvasid")
	private Long kElementCanvasId;

	@Column(name = "kelementcanvasname")
	private String kElementCanvasName;

	@Column(name = "kelementcanvasdesc")
	private String kElementCanvasDesc;

	public String getkElementCanvasName() {
		return kElementCanvasName;
	}

	public void setkElementCanvasName(String kElementCanvasName) {
		this.kElementCanvasName = kElementCanvasName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getkElementCanvasId() {
		return kElementCanvasId;
	}

	public void setkElementCanvasId(Long kElementCanvasId) {
		this.kElementCanvasId = kElementCanvasId;
	}

	public String getkElementCanvasDesc() {
		return kElementCanvasDesc;
	}

	public void setkElementCanvasDesc(String kElementCanvasDesc) {
		this.kElementCanvasDesc = kElementCanvasDesc;
	}

}
