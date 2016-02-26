package xv.km.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import xv.km.webservices.model.ModelKElementBasis;
import xv.km.webservices.services.KElementServices;

@Controller
@RequestMapping("/kelementbasis")
public class KElementBasisController {

	@Autowired
	KElementServices kElementServices;

	@RequestMapping(value = "/kelementbasislist", method = RequestMethod.GET)
	@ResponseBody
	public List<ModelKElementBasis> getKElementBasisList() throws Exception {

		return kElementServices.getKElementBasisList();

	}

}
