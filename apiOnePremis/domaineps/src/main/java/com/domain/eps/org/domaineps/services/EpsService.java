package com.domain.eps.org.domaineps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.eps.org.domaineps.models.EpsDetail;
import com.domain.eps.org.domaineps.repository.EpsRepository;

@Service
public class EpsService {
    @Autowired
    private EpsRepository epsRepository;

    public EpsDetail save(EpsDetail eps) {
        return epsRepository.save(eps);
    }
}
