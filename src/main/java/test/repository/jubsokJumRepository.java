package test.repository;

import test.model.entity.jubsokJum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface jubsokJumRepository extends JpaRepository<jubsokJum, Long>{

}