package com.data.demo01_spring_mvc.repository;

import org.springframework.stereotype.Repository;

@Repository
public class NumberRepositoryImpl implements NumberRepository {
    @Override
    public int getTotal(int a, int b) {
        return a + b;
    }
}
