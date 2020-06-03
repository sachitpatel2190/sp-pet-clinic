package com.sachit.learn.sppetclinic.services.springjpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sachit.learn.sppetclinic.model.Owner;
import com.sachit.learn.sppetclinic.repository.OwnerRepository;

@ExtendWith(MockitoExtension.class)
public class OwnerSDJpaServiceTest {
	
    public static final String LAST_NAME = "Smith";
    
    @Mock
    OwnerRepository ownerRepository;
    
    Owner owner;
    
    @BeforeEach
    void setUp() {
    	owner = Owner.builder().id(1L).address("kalol").lastName("Smith").build();
    }
    
    @InjectMocks
    OwnerSDJpaService service;

    @Test
    void findByLastName() {
    	when(ownerRepository.findByLastName(any())).thenReturn(owner);
    	
        Owner smith = service.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME, smith.getLastName());
        verify(ownerRepository, times(1)).findByLastName(any());
        assertEquals(1L, owner.getId());
    }
}
