package com.example.onlinebusbooking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.repository.CrudRepository;

import com.example.onlinebusbooking.model.Bus;
import com.example.onlinebusbooking.repository.BusRepository;

public class BusServiceTest {

    @InjectMocks
    private BusService busService;

    @Mock
    private BusRepository busRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddBus() {
        Bus bus = new Bus();
        bus.setBusName("1234"); // Ensure that you're using the correct property name

        // Call the method being tested
        Bus savedBus = busService.addBus(bus); 

        // Assert that the returned bus has the expected name
        assertEquals("1234", savedBus.getBusName());

        // Verify that save was called once
        verify(busRepository).save(bus);
    }

	private CrudRepository<Bus, Long> verify(BusRepository busRepository2) {
		// TODO Auto-generated method stub
		return null;
	}
}