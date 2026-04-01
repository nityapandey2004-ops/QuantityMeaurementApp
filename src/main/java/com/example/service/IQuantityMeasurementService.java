package com.example.service;

import com.example.dto.QuantityDTO;
import com.example.dto.QuantityMeasurementDTO;

import java.util.List;

public interface IQuantityMeasurementService {

    // ─── Core operations ─────────────────────────────────────────────────────

    QuantityMeasurementDTO compare(QuantityDTO q1, QuantityDTO q2);

    QuantityMeasurementDTO convert(QuantityDTO input, QuantityDTO target);

    QuantityMeasurementDTO add(QuantityDTO q1, QuantityDTO q2);

    QuantityMeasurementDTO subtract(QuantityDTO q1, QuantityDTO q2);

    QuantityMeasurementDTO divide(QuantityDTO q1, QuantityDTO q2);

    // ─── History & reporting ─────────────────────────────────────────────────

    List<QuantityMeasurementDTO> getHistoryByOperation(String operation);

    List<QuantityMeasurementDTO> getHistoryByMeasurementType(String measurementType);

    List<QuantityMeasurementDTO> getErrorHistory();

    long getOperationCount(String operation);
}