package com.job.jmc.api.repositories;

import com.job.jmc.api.entities.Workshop;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRepository extends BaseRepository<Workshop, Long> {
}
