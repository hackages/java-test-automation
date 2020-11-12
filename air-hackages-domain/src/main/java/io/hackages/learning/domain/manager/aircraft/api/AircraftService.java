package io.hackages.learning.domain.manager.aircraft.api;

import io.hackages.learning.domain.model.Aircraft;

import java.util.List;

public interface AircraftService {

    List<Aircraft> getAircrafts();

    Aircraft addAircraft(Aircraft aircraft);

    void deleteAircraft(String code);

    Aircraft changeDescription(String description);

    Aircraft getAircraftByCode(String code);

}
