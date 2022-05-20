package com.demo.services;

import com.demo.repo.PersonRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    private PersonRepo personRepo;


    private PersonService personService;

    AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        this.personService = new PersonService(this.personRepo);
    }


    @Test
    void getAllPerson() {

        personService.getAllPerson();

        verify(personRepo).findAll();
    }
}