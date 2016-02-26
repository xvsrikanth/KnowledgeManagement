package xv.km.webservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xv.km.webservices.dao.KElementDao;
import xv.km.webservices.model.ModelKElement;
import xv.km.webservices.model.ModelKElementBasis;
import xv.km.webservices.model.ModelKElementCanvas;

public class KElementServicesImpl implements KElementServices {

	@Autowired
	KElementDao kElementDao;

	public boolean addKElement(ModelKElement modelKElement) throws Exception {
		return kElementDao.addKElement(modelKElement);
	}

	public List<ModelKElement> getKElementList() throws Exception {
		return kElementDao.getKElementList();
	}

	public boolean deleteKElement(int id) throws Exception {
		return kElementDao.deleteKElement(id);
	}

	public ModelKElement getKElementById(int id) throws Exception {
		return kElementDao.getKElementById(id);
	}

	public boolean updateKElement(ModelKElement modelKElement, int id) throws Exception {
		return kElementDao.updateKElement(modelKElement, id);
	}

	public List<ModelKElementCanvas> getKElementCanvasList() throws Exception {
		return kElementDao.getKElementCanvasList();

	}

	public List<ModelKElementBasis> getKElementBasisList() throws Exception {

		return kElementDao.getKElementBasisList();
	}

}
