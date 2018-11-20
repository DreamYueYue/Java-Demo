package com.manulife.eTransfer.service;

import com.manulife.eTransfer.entity.NationalityEntity;
import com.manulife.eTransfer.repository.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class NationalityService {
    @Autowired
    private NationalityRepository nationalityRepository;

    @Transactional
    @CacheEvict(value = "thisredis", key = "#root.caches[0].name")
    public List<NationalityEntity> add(List<NationalityEntity> nationalityEntityList) {
        return nationalityRepository.saveAll(nationalityEntityList);
    }

    @Transactional
    public void delete(Long id) {
        nationalityRepository.deleteById(id);
    }

    @Transactional
    public List<NationalityEntity> update(List<NationalityEntity> nationalityEntityList) {
        return nationalityRepository.saveAll(nationalityEntityList);
    }

    @Cacheable(value = "thisredis", key = "#root.caches[0].name")
    public List<NationalityEntity> getAll() {
        System.out.println("cache...");
        return nationalityRepository.findAll();
    }

    @Cacheable(value = "thisredis", key = "#id")
    public NationalityEntity getById(Long id) {
        return nationalityRepository.findById(id).get();
    }
}
