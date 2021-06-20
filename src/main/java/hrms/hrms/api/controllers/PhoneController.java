package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.IPhoneService;
import hrms.hrms.entities.concretes.Phone;

@CrossOrigin
@RestController
@RequestMapping("/api/phones")
public class PhoneController {

 @Autowired
 private IPhoneService iPhoneService;

  @GetMapping("/getPhoneNumbersByUserId")
  List<Phone> getPhoneNumbersByUserId(int id){
    return this.iPhoneService.getPhonesById(id);
    }	
}
