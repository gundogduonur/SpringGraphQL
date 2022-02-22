package com.onurgundogdu.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.onurgundogdu.graphql.entity.Vehicle;
import com.onurgundogdu.graphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(int count){
        return vehicleService.allVehicles(count);
    }
    public Optional<Vehicle> getVehicle(int id){
        return vehicleService.getVehicle(id);
    }
}
