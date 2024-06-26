package com.demo.repository;

import com.demo.domain.PointEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointEventRepository extends JpaRepository<PointEvent, Long> {
}
