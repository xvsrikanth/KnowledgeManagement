package xv.km.webservices.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import xv.km.webservices.base.KElementColl;
import xv.km.webservices.model.ModelKElement;
import xv.km.webservices.model.ModelKElementBasis;
import xv.km.webservices.model.ModelKElementCanvas;
import xv.km.webservices.model.ModelKElementColl;

public class KElementDaoImpl implements KElementDao {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	ModelKElementColl modelkElementColl;

	Session session = null;
	Transaction tx = null;
	boolean booleanStatus = false;

	public boolean addKElement(ModelKElement modelKElement) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		try {
			session.save(modelKElement);
			System.out.println(booleanStatus);
			tx.commit();
			session.close();

		} catch (Exception ex) {

		}

		return booleanStatus;
	}

	@SuppressWarnings("unchecked")
	public List<ModelKElement> getKElementList() {
		session = sessionFactory.openSession();
		List<ModelKElement> modelKElementList = null;
		try {
			modelKElementList = session.createCriteria(ModelKElement.class).list();
		} catch (Exception ex) {

		}
		session.close();
		return modelKElementList;
	}

	public ModelKElement getKElementById(int id) {
		session = sessionFactory.openSession();
		ModelKElement modelKElement = null;
		try {

			modelKElement = (ModelKElement) session.get(ModelKElement.class, new Integer(id));
		} catch (Exception ex) {

		}

		return modelKElement;
	}

	/* DB for Updating a Entity */

	public boolean updateKElement(ModelKElement modelKElement, int id) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		try {
			session.createCriteria(Integer.toString(id));
			session.update(modelKElement);
			tx.commit();
		} catch (Exception ex) {

		}
		session.close();

		return true;
	}

	public boolean deleteKElement(int id) {
		session = sessionFactory.openSession();
		try {
			ModelKElement modelKElement = (ModelKElement) session.load(ModelKElement.class, id);

			tx = session.getTransaction();
			session.beginTransaction();
			session.delete(modelKElement);

			tx.commit();
		} catch (Exception ex) {

		}
		return true;
	}

	public KElementColl getParentKElements(int id) throws Exception {
		session = sessionFactory.openSession();

		return modelkElementColl.getParentKElements(id);
	}

	public KElementColl getChildKElements(int id) throws Exception {
		session = sessionFactory.openSession();

		return modelkElementColl.getChildKElements(id);
	}

	@SuppressWarnings("unchecked")
	public List<ModelKElementCanvas> getKElementCanvasList() {
		session = sessionFactory.openSession();
		List<ModelKElementCanvas> modelKElementCanvasList = null;
		try {
			modelKElementCanvasList = session.createCriteria(ModelKElementCanvas.class).list();
		} catch (Exception ex) {

		}
		session.close();
		return modelKElementCanvasList;
	}

	@SuppressWarnings("unchecked")
	public List<ModelKElementBasis> getKElementBasisList() {
		session = sessionFactory.openSession();
		List<ModelKElementBasis> modelKElementBasisList = null;
		try {
			modelKElementBasisList = session.createCriteria(ModelKElementBasis.class).list();
		} catch (Exception ex) {

		}
		session.close();
		return modelKElementBasisList;
	}
}
