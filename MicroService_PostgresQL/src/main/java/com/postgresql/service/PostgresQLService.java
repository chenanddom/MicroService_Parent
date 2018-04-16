package com.postgresql.service;

import com.postgresql.mapper.PostgresQLMapper;
import com.postgresql.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-04-10
 * Time: 14:49
 */
@Service
public class PostgresQLService {
    @Autowired
    private PostgresQLMapper postgresQLMapper;

    public int addPerson(){
        Person person = new Person();
        person.setId(6);
        person.setName("addNewPerson1");
        return postgresQLMapper.addPerson(person);
    }
    public  int deletePerson(){
        return postgresQLMapper.deletePerson(2);
    }
    public int updatePerson(){
        Person person = new Person();
        person.setId(3);
        person.setName("张三2");
        return postgresQLMapper.updatePerson(person);
    }

    public Person getPersonById(int Id) {
        return postgresQLMapper.getPersonById(Id);
    }

    public boolean addBatchPerson() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            Person p = new Person();
            p.setId(i+7);
            p.setName("testName" + i);
            personList.add(p);
        }
        int flag = postgresQLMapper.insertBatchPerson(personList);
        if (flag > 0) {
        return true;
        }
        return false;
    }
}
