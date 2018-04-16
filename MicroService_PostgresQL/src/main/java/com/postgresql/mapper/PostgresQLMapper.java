package com.postgresql.mapper;

import com.postgresql.model.Person;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-04-10
 * Time: 14:34
 */
@Mapper
public interface PostgresQLMapper {
    int addPerson(Person person);
    int deletePerson(Integer id);
    int updatePerson(Person person);
    Person getPersonById(Integer id);
    int insertBatchPerson(@Param("persons") List<Person> persons);
}
