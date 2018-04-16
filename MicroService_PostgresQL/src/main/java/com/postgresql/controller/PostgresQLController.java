package com.postgresql.controller;

import com.postgresql.model.Person;
import com.postgresql.service.PostgresQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-04-10
 * Time: 14:32
 */
@RestController
public class PostgresQLController {
@Autowired
PostgresQLService postgresQLService;

    @RequestMapping("/addPerson")
    @ResponseBody
    public int addPerson() {
        return postgresQLService.addPerson();
    }

    @RequestMapping("/deletePerson")
    @ResponseBody
    public int deletePerson() {
        return postgresQLService.deletePerson();
    }

    @RequestMapping("/updatePerson")
    @ResponseBody
    public int updatePerson() {
        return postgresQLService.updatePerson();
    }



    @RequestMapping("/getPerson")
    @ResponseBody
    public Person getPerson() {
        return postgresQLService.getPersonById(1);
    }

    @RequestMapping("/addBatchPerson")
    @ResponseBody
    public String addBatchPerson(){
        boolean flag = postgresQLService.addBatchPerson();
        if (flag){
            return "add Success";
        }else {
        return "add failure";
        }
    }

}
