package com.vinsys.tests;

import com.airports.AirportManager;
import com.airports.IAirportService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AirportManagerTest {
    IAirportService service = null;

    @Before
    public void init() {
        // mocked the IAirportService.class --->
        service = Mockito.mock(IAirportService.class);
        Mockito.when(service.totalAirports()).thenReturn(100);
    }

    @After
    public void destroy() {
        System.out.println("After......");
    }

    @Test
    public void testListAllAirports() {
        AirportManager manager = new AirportManager(service);
        int expected = 100;
         assertEquals(expected, manager.listAirports());
    }

    @Test
    public void testFindAirportsByName() {
        fail("Not Yet Impemented");
    }

    @Test
    public void testFindAirportsByCountry() {
        fail("Not Yet Impemented");
    }

    @Test
    public void testFindAirportsBySize() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindAirportsByRunways() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindHelipads() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindAirportsByContinent() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListAllRegions() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListAllNavaids() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testGetRandomAirport() {
        fail("Not Yet Implemented");
    }
    @Test
    public void testListCountries() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListContinents() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testLogin() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testSignup() {
        fail("Not Yet Implemented");
    }
    @Test
    public void testHelp(){
        fail("Not Yet Implemented");
    }
    @Test
    public void listAirportsSorted(){
        fail("Not Yet Implemented");
    }
    @Test
    public void listAirportsPaginated(){
        fail("Not Yet Implemented");
    }



}

