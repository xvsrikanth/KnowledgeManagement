package xv.km.webservices.services;

import java.util.List;

import xv.km.webservices.model.ModelKElement;
import xv.km.webservices.model.ModelKElementBasis;
import xv.km.webservices.model.ModelKElementCanvas;

public interface KElementServices {
	public boolean addKElement(ModelKElement modelkElement) throws Exception;

	public List<ModelKElement> getKElementList() throws Exception;

	public boolean deleteKElement(int id) throws Exception;

	public ModelKElement getKElementById(int id) throws Exception;
	
	public boolean updateKElement(ModelKElement modelkElement, int id) throws Exception;
	
	public List<ModelKElementCanvas> getKElementCanvasList() throws Exception;
	
	public List<ModelKElementBasis> getKElementBasisList() throws Exception;
	

}
