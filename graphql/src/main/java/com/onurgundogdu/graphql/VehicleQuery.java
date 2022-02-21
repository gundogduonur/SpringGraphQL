package com.onurgundogdu.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.onurgundogdu.graphql.entity.Vehicle;
import com.onurgundogdu.graphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;
}
