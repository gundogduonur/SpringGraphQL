package com.onurgundogdu.graphql.service;

import com.onurgundogdu.graphql.entity.Vehicle;
import com.onurgundogdu.graphql.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;

    @Transactional
    public Vehicle createVehicle(String type, String brand){
     Vehicle vehicle=new Vehicle();
     vehicle.setType(type);
     vehicle.setBrand(brand);
     return vehicleRepository.save(vehicle);
    }

    @Transactional(readOnly = true)
    public List<Vehicle> allVehicles(int count){
        return vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
    @Transactional(readOnly = true)
    public Optional<Vehicle> getVehicle(int id){
        return this.vehicleRepository.findById(id);
    }
}
