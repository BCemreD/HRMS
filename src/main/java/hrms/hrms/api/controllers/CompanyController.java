package hrms.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.ICompanyService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.Company;

@CrossOrigin
@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	
 @Autowired
  private ICompanyService iCompanyService;

  @GetMapping("/getAll")
  public DataResult<List<Company>> getAll(){
      return this.iCompanyService.getAll();
}

  @PostMapping("/save")
  void add(@Valid @RequestBody Company company){
  this.iCompanyService.add(company);
}

  @GetMapping("/getCompanyById/{id}")
  Company getCompanyById(@PathVariable int id){
   return this.iCompanyService.getPhoneByCompanyId(id);
}

  @GetMapping("/getCompanyById2")
  Company getCompanyById2(int id, @RequestParam(value = "isim") String name){
   System.out.println(name);
   return this.iCompanyService.getPhoneByCompanyId(id);
}

  @PostMapping("/getbycompanynameandphonenumber")
  public DataResult<Company> getByCompanyNameAndPhoneNumber(
   @RequestParam("companyName") String companyName,
   @RequestParam("phoneNumber") String phoneNumber){
   return this.iCompanyService.getByCompanyNameAndPhones_Phone(
         companyName,
         phoneNumber);
}
}