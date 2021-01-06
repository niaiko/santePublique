package net.opendev.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.opendev.springboot.dao.DirectionRepository;
import net.opendev.springboot.dao.VehiculeRepository;

import net.opendev.springboot.entities.Vehicule;

@Controller
public class DirectionController {
	@Autowired	
	private VehiculeRepository vehiculeRepository;
	@Autowired
	private DirectionRepository directionRepository;
	//Pgination??
	@RequestMapping(value = "/vehicules",method = RequestMethod.GET)
	public String index(Model model) {
		List<Vehicule> vehicules=vehiculeRepository.findAll();
		model.addAttribute("listVehicules",vehicules);
		return"vehicules";
	}
	
	//Recherche?
	@RequestMapping(value = "/chercher")
	public String chercher(Model model,String motCle) {
		
		return"vehicules";
		
	}
	
	  @RequestMapping(value = "/formVehicules") 
	  public String formVehicule(Model model) {
		  model.addAttribute("vehicule",new Vehicule()); 
		  return "formVehicules"; 
	  }
	  
	
	  @RequestMapping(value = "/saveVehicules")
	  public String save(Model model,
			  @Validated Vehicule v,
			  BindingResult bindingResult) { 
		  if(bindingResult.hasErrors())
			  return "formVehicules";
		  vehiculeRepository.save(v);
		  return "redirect:/vehicules";
	  }
	 //recuperation de direction de vehicules
	  @RequestMapping(value = "/directions") 
	  public String directions(Model model,Long codeDir) {
		  Vehicule v=new Vehicule();
		  v.setNumMatricule("numMatricule");
		  model.addAttribute("vehicules",vehiculeRepository.findAll());
		  //model.addAttribute("direction",directionRepository.findByVehicule(v));
		  return "directions"; 
	  }
	  @RequestMapping(value = "/supprimer")
	  public String supprimer(Long id) {
		  vehiculeRepository.deleteById(id);
		  return "redirect:/vehicules";
	  }
	  
	  @RequestMapping(value = "/edit")
	  public String edit(Long id ,Model model) {
		  Vehicule veh=vehiculeRepository.getOne(id);
		  model.addAttribute("vehicules",veh);
		  return "editVehicules";
	  }
}
