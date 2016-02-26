package xv.km.webservices.controller;

import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import xv.km.webservices.model.ModelKElement;

@Controller
public class DisplayKElements {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/displaykelements")
	public ModelAndView listKElements() {
		RestTemplate restTemplate = new RestTemplate();
		String urlForKElements = "http://localhost:8080/KnowledgeManagement/kelement/kelementlist";
		List<HashMap> kElements = restTemplate.getForObject(urlForKElements, List.class);
		System.out.println(kElements.get(1));
		return new ModelAndView("dispKElements", "kElements", kElements);
	}

	@RequestMapping("/dispkelement/{kelementid}")
	public ModelAndView kElementById(@PathVariable("kElementId") int kElementId) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/KnowledgeManagement/kelement/{id}";
		ModelKElement modelKElement = restTemplate.getForObject(url, ModelKElement.class, kElementId);
		return new ModelAndView("dispKElementById", "modelKElement", modelKElement);
	}

}