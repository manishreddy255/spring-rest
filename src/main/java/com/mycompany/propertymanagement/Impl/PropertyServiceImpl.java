package com.mycompany.propertymanagement.Impl;

import com.mycompany.propertymanagement.dto.PropertyDto;
import com.mycompany.propertymanagement.service.PropertyService;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Override
    public PropertyDto saveProperty(PropertyDto propertyDto) {
        System.out.println(propertyDto.getAddress());
        return null;
    }
}
