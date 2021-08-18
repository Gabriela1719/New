package com.agency04.sbss.pizza.Repository;

import com.agency04.sbss.pizza.Model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>
{

}
