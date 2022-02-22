package com.onurgundogdu.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.onurgundogdu.graphql.entity.Vehicle;
import com.onurgundogdu.graphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(String type,String brand){
        return vehicleService.createVehicle(type,brand);
    }
}
