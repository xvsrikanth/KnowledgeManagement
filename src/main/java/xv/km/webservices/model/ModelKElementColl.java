package xv.km.webservices.model;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import xv.km.webservices.base.KElementColl;

public class ModelKElementColl extends KElementColl {

	private static final long serialVersionUID = 1L;

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	KElementColl kElementColl = null;

	@SuppressWarnings("unchecked")
	public KElementColl getParentKElements(int id) {

		try {
			session = sessionFactory.openSession();

			/*
			 * tx = session.getTransaction(); session.beginTransaction();
			 */

			String getParentKElementsHql = "from ModelKElement as ke where ke.kElementId in(select kel.kElementLinkId from ModelKElementLink as kel where kel.kElementLinkParentId="
					+ id + ")";

			// String getParentKElementsSql="SELECT * from kelement as ke where
			// ke.kelementid in (SELECT kelementlinkid from kelementlink as kel
			// WHERE kel.kelementparentlinkid="+id+")";

			List<ModelKElement> modelKElementList = session.createQuery(getParentKElementsHql).list();
			kElementColl = new KElementColl();
			for (Iterator<ModelKElement> it1 = modelKElementList.iterator(); it1.hasNext();) {

				ModelKElement modelKElement = (ModelKElement) it1.next();

				kElementColl.put(modelKElement.getkElementId(), modelKElement);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return kElementColl;
	}

	@SuppressWarnings("unchecked")
	@Override
	public KElementColl getChildKElements(int id) {

		try {
			session = sessionFactory.openSession();

			String getChildKElementsHql = "from ModelKElement as ke where ke.kElementId in(select kel.kElementLinkId from ModelKElementLink as kel where kel.kElementLinkChildId="
					+ id + ")";

			List<ModelKElement> modelkElementList = session.createQuery(getChildKElementsHql).list();
			kElementColl = new KElementColl();
			for (Iterator<ModelKElement> it1 = modelkElementList.iterator(); it1.hasNext();) {

				ModelKElement modelKElement = (ModelKElement) it1.next();

				kElementColl.put(modelKElement.getkElementId(), modelKElement);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return kElementColl;

	}
}
