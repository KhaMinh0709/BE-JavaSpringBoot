package com.devjavaminh.be07springbootservicerepositorycomponent.repository.imp;

import com.devjavaminh.be07springbootservicerepositorycomponent.model.Girl;
import com.devjavaminh.be07springbootservicerepositorycomponent.repository.GirlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositortIml implements GirlRepository {
    @Override
    public Girl getGirlById(String name) {
        return new Girl(name);
    }
}
