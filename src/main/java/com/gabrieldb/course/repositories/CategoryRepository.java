package com.gabrieldb.course.repositories;

import com.gabrieldb.course.entities.Category;
import com.gabrieldb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
