package hrms.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.IGraduationService;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Graduate;
import hrms.hrms.core.utilities.results.DataResult;

@CrossOrigin
@RestController
@RequestMapping("/api/graduates")
public class GraduationController {

	@Autowired
	private IGraduationService iGraduationService;
	
	@GetMapping("/getAll")
	DataResult<List<Graduate>>getAll(){
		return this.iGraduationService.getAll();
	}
	
	@PostMapping("/save")
	Result add(@Valid @RequestBody Graduate graduate) {
		return this.iGraduationService.add(graduate);
	}

}
