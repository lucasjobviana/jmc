package com.job.jmc.api.repositories;

import com.job.jmc.api.entities.Vehicle;
import org.springframework.stereotype.Repository;
/**
 * The interface Vehicle repository.
 */
@Repository
public interface VehicleRepository extends BaseRepository<Vehicle, Long> {
}
