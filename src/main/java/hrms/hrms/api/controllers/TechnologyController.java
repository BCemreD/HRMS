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

import hrms.hrms.business.abstracts.ITechnologyService;
import hrms.hrms.core.entities.Technology;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;

@CrossOrigin
@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

 @Autowired
 private ITechnologyService iTechnologyService;

 @GetMapping("/getAllByCvId")
 DataResult<List<Technology>> getAllByCvId(int cvId){
    return this.iTechnologyService.getAllByCvId(cvId);
    }

 @PostMapping("/save")
 Result add(@Valid @RequestBody Technology technology){
    return this.iTechnologyService.add(technology);
    }	
}
