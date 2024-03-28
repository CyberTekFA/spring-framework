package com.hypertek.repository;

import com.hypertek.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    List<Course> findCourseByCategoryOrderByName(String name);

    Integer countCourseByCategory(String category);

    @Query(value = "select * from courses where category = :category and rating > :rating",nativeQuery = true)
    List<Course> getCourseByCategoryAndRatingGreaterThan(@Param("category") String category,@Param("rating") String rating);
}
