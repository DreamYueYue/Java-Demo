package com.manulife.eTransfer.repository;

import com.manulife.eTransfer.entity.NationalityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends JpaRepository<NationalityEntity, Long> {

}
