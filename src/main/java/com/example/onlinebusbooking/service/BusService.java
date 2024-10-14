package com.example.onlinebusbooking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlinebusbooking.model.Bus;
import com.example.onlinebusbooking.repository.BusRepository;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    public void deleteBus(Long id) {
        busRepository.deleteById(id);
    }

    public Bus updateBus(Long id, Bus bus) {
        bus.setId(id); // Assuming Bus has an ID field
        return busRepository.save(bus);
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

	public Bus saveBus(Bus bus) {
		// TODO Auto-generated method stub
		return null;
	}
}