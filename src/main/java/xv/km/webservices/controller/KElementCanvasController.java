package xv.km.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xv.km.webservices.model.ModelKElementCanvas;
import xv.km.webservices.services.KElementServices;

@Controller
@RequestMapping("/kelementcanvas")
public class KElementCanvasController {

	@Autowired
	KElementServices kElementServices;

	@RequestMapping(value = "/kelementcanvaslist", method = RequestMethod.GET)
	@ResponseBody
	public List<ModelKElementCanvas> getKElementCanvasList() throws Exception {

		return kElementServices.getKElementCanvasList();

	}

}
