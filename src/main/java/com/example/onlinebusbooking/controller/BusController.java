package com.example.onlinebusbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.onlinebusbooking.model.Bus;
import com.example.onlinebusbooking.service.BusService;

@RestController
@RequestMapping("/api/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @PostMapping
    public Bus addBus(@RequestBody Bus bus) {
        return busService.saveBus(bus);
    }

    @PutMapping("/{id}")
    public Bus updateBus(@PathVariable Long id, @RequestBody Bus bus) {
        return busService.updateBus(id, bus);
    }

    @DeleteMapping("/{id}")
    public void deleteBus(@PathVariable Long id) {
        busService.deleteBus(id);
    }
}