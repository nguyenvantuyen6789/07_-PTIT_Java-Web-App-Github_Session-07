package com.data.demo01_spring_mvc.service;

import com.data.demo01_spring_mvc.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    private NumberRepository numberRepo;

    @Override
    public int getTotal(int a, int b) {
        return numberRepo.getTotal(a, b);
    }
}
