package com.example.repository;

import java.util.List;
import com.example.entity.QuantityMeasurementEntity;

public interface IQuantityMeasurementRepository {

    void saveMeasurement(QuantityMeasurementEntity entity);

    List<QuantityMeasurementEntity> findAll();

}