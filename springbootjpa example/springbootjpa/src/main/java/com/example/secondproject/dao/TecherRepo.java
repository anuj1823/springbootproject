package com.example.secondproject.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.secondproject.entities.Teacher;
@Repository
public interface TecherRepo extends CrudRepository<Teacher, String>
{

}
