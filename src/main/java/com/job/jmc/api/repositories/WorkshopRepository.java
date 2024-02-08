package com.job.jmc.api.repositories;

import com.job.jmc.api.entities.Workshop;
import org.springframework.stereotype.Repository;
/**
 * The interface Workshop repository.
 */
@Repository
public interface WorkshopRepository extends BaseRepository<Workshop, Long> {
}
