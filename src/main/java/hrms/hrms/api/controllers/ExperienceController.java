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

import hrms.hrms.business.abstracts.IExperienceService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Experience;

@CrossOrigin
@RestController
@RequestMapping("/api/experiences")
public class ExperienceController {

  @Autowired
  private IExperienceService iExperienceService;

  @GetMapping("/getAllByCvIdOrderByEndedDateDesc")
  DataResult<List<Experience>> getAllByResumeIdOrderByEndedDateDesc(int cvId){
      return this.iExperienceService.getAllByCvIdOrderByEndedDateDesc(cvId);
   }

  @PostMapping("/save")
  Result add(@Valid @RequestBody Experience experience){
      return this.iExperienceService.add(experience);
   }
}
