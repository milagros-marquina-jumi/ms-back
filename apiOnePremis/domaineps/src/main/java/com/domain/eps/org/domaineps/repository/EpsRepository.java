package com.domain.eps.org.domaineps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.eps.org.domaineps.models.EpsDetail;

@Repository
public interface EpsRepository extends JpaRepository<EpsDetail, Long> {
}
