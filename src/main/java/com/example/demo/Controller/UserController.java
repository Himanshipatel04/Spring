package com.example.demo.Controller;
import com.example.demo.Entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;
import java.beans.PropertyEditorSupport;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @InitBinder
    protected void initBinder(DataBinder binder){
         binder.registerCustomEditor(String.class,"firstName",new FirstNamePropertyEditor());
    }

    @GetMapping(path = "/user")
    public String getUserDetails(@RequestParam(name = "firstName") String username,
                                 @RequestParam(name = "age",required = false,defaultValue = "0") int age,
                                 @RequestParam(name = "hobby",required = false) String hobby
    ){
         return "Hello "+username+" . Your age : "+age+". Your hobby is "+hobby;
    }

    @PostMapping(path = "/saveUser2")
    public String saveUserInDB(@RequestBody User user){
        return "User with username " + user.getName() + " and email " + user.getEmail() + " saved in db successfully!";
    }

    @GetMapping(value = "/getUserResponseEntity/{username}")
    public ResponseEntity<String> getUserResponseEntity(@PathVariable(value="username") String name){
        String output = "Hello " + name + " ! How are you?";
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}

class FirstNamePropertyEditor extends PropertyEditorSupport {
       @Override
       public void setAsText(String text) throws IllegalArgumentException{
           setValue(text.trim().toUpperCase());
       }
}
