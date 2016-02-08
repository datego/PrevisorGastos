package com.previsor.infraestructures;


import com.previsor.business.ServicesFactory;
import com.previsor.business.impl.SimpleServicesFactory;
import com.previsor.persistence.PersistenceFactory;
import com.previsor.persistence.impl.SimplePersistenceFactory;


public class Factories {

    public static ServicesFactory services = new SimpleServicesFactory();
    public static PersistenceFactory persistence = new SimplePersistenceFactory();

}
