package hrms.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.IUserService;
import hrms.hrms.core.entities.User;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
     private IUserService iUserService;

    @GetMapping("/getAll")
    User getAll(int id){
     return this.iUserService.getById(id);
    }

}
