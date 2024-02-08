package com.job.jmc.api.repositories;

import com.job.jmc.api.entities.Maintenance;
import org.springframework.stereotype.Repository;
/**
 * The interface Maintenance repository.
 */
@Repository
public interface MaintenanceRepository extends BaseRepository<Maintenance, Long> {
}
