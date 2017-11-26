package com.wipro.LoginMod.impl;



import java.util.List;

import com.wipro.LoginMod.model.RandomCity;
import com.wipro.LoginMod.model.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {
    User findByUserName(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}