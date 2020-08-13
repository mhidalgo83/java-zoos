package com.javazoos.zoo.services;

import com.javazoos.zoo.models.Telephone;
import com.javazoos.zoo.repositories.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "telephoneService")
public class TelephoneServiceImpl implements TelephoneService {

    @Autowired
    TelephoneRepository telerepos;

    @Override
    public Telephone save(Telephone telephone) {
        return telephone;
    }
}
