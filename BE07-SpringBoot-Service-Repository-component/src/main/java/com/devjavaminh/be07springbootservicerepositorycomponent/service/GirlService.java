package com.devjavaminh.be07springbootservicerepositorycomponent.service;

import com.devjavaminh.be07springbootservicerepositorycomponent.model.Girl;
import com.devjavaminh.be07springbootservicerepositorycomponent.repository.GirlRepository;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    private GirlRepository girlRepository;

    public Girl getRandomGirl() {
        Girl girl = new Girl();
        String name = girl.getName();
        return girlRepository.getGirlById(name);
    }

}
