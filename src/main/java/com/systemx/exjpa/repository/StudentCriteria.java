package com.systemx.exjpa.repository;

import com.systemx.exjpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StudentCriteria {
    @Autowired
    EntityManager entityManager;

    public List<Student> getStudentByCriteria(){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> rootEntity = criteriaQuery.from(Student.class);

        Predicate test = criteriaBuilder.equal(rootEntity.get("firstName"), "Vaibhav");

        criteriaQuery.where(test);
        List<Student> list = entityManager.createQuery(criteriaQuery).getResultList();
        return list;
    }
}
