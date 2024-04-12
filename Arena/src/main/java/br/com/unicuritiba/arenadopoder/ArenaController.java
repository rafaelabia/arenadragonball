package br.com.unicuritiba.arenadopoder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.unicuritiba.arenadopoder.models.Arena;
import br.com.unicuritiba.arenadopoder.repositories.ArenaRepository;
import ch.qos.logback.core.model.Model;

@Controller
public class ArenaController {
	
	@Autowired
	private ArenaRepository repositorio;
	
	@GetMapping("/")
	public ModelAndView home() {
		
		List<Arena> arenas = repositorio.findAll();
		
		ModelAndView view = new ModelAndView("index");
		view.addObject("arenas", arenas);
		
		return view;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("create");
		view.addObject("model", new Arena());
		return view;
	}
	
	@PostMapping("/cadastro")
	public String createFighter(Arena arena, Model model, BindingResult result) {
		
		repositorio.save(arena);
		return "redirect:/";
	}
	
}