package xv.km.webservices.controller;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mysql.jdbc.Messages;
import xv.km.webservices.base.KElementColl;
import xv.km.webservices.dao.KElementDao;
import xv.km.webservices.model.*;
import xv.km.webservices.services.KElementServices;

import org.springframework.stereotype.*;

@Controller
@RequestMapping("/kelement")
public class KElementController

{
	@Autowired
	KElementServices kElementServices;

	@Autowired
	KElementDao kElementDao;

	KElementColl kElementColl = null;

	boolean booleanStatus;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String welcomeMessage() {
		return "Hello Jersey";
	}

	/* Add a New Knowledge Element */

	@RequestMapping(value = "/addkelement", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	@ResponseBody
	public ModelKElementStatus addKElement(@RequestBody ModelKElement modelkElement) throws Exception {

		booleanStatus = kElementServices.addKElement(modelkElement);

		System.out.println(booleanStatus);
		if (booleanStatus == true)
			return new ModelKElementStatus(1, Messages.getString("Message.KnowledgeElementCreated"));
		else
			return new ModelKElementStatus(0, "Knowledge Element could not be saved");

	}

	/* Retreive All Knowledge Elements */

	@RequestMapping(value = "/kelementlist", method = RequestMethod.GET)
	@ResponseBody
	public List<ModelKElement> getKElementList() throws Exception {

		return kElementServices.getKElementList();

	}

	/* Get Knowledge Element based on id */

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ModelKElement getKElementById(@PathVariable("id") int id) throws Exception {

		return kElementServices.getKElementById(id);

	}

	/* Update Knowledge Element */

	@RequestMapping(value = "/updatekelement/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	@ResponseBody
	public ModelKElementStatus updateKElement(@PathVariable("id") int id, @RequestBody ModelKElement modelkElement)
			throws Exception {

		booleanStatus = kElementServices.updateKElement(modelkElement, id);
		if (booleanStatus == true)
			return new ModelKElementStatus(1, "Knowledge Element updated Successfully !");
		else
			return new ModelKElementStatus(0, "Knowledge Element Could not be updated");

	}

	/* Delete a Knowledge ELement */

	@RequestMapping(value = "/deletekelement/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ModelKElementStatus deleteKElement(@PathVariable("id") int id) throws Exception {

		booleanStatus = kElementServices.deleteKElement(id);
		if (booleanStatus == true)
			return new ModelKElementStatus(1, "Knowledge Element deleted !");
		else
			return new ModelKElementStatus(1, "Knowledge Element could not be deleted !");

	}

	/* Get Details of Parent KElements */

	@RequestMapping(value = "/parentkelements/{id}", method = RequestMethod.GET)
	@ResponseBody
	public KElementColl getParentKElements(@PathVariable("id") int id) throws Exception {

		return kElementDao.getParentKElements(id);

	}

	/* Get Details of Child KElements */

	@RequestMapping(value = "/childkelements/{id}", method = RequestMethod.GET)
	@ResponseBody
	public KElementColl getChildKElements(@PathVariable("id") int id) throws Exception {

		return kElementDao.getChildKElements(id);

	}

}
