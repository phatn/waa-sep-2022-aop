package edu.miu.lab5aop.repo;

import edu.miu.lab5aop.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
