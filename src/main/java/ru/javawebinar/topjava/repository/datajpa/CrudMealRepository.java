package ru.javawebinar.topjava.repository.datajpa;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.javawebinar.topjava.model.Meal;

import java.util.List;


public interface CrudMealRepository extends JpaRepository<Meal, Integer> {


    @Override
    default void deleteInBatch(Iterable<Meal> iterable) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default List<Meal> findAll(Sort sort){
        return null;
    }

    @Override
    default Meal getOne(Integer integer) {
        return null;
    }

}
