package com.job.jmc.api.repository;

import com.job.jmc.api.entity.Maintenance;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends BaseRepository<Maintenance, Long> {
}
