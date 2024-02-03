package com.job.jmc.api.repositories;

import com.job.jmc.api.entities.Maintenance;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends BaseRepository<Maintenance, Long> {
}
