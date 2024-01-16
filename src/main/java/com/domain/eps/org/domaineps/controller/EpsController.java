package com.domain.eps.org.domaineps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.domain.eps.org.domaineps.models.EpsDetail;
import com.domain.eps.org.domaineps.services.EpsService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/eps")
@CrossOrigin(origins = "*")
public class EpsController {

    @Autowired
    private EpsService epsService;

    @PostMapping("create")
    public EpsDetail createEps(@RequestBody EpsDetail eps) throws Exception {
        try {
            return epsService.save(eps);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
