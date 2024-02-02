package com.job.jmc.api.repository;

import com.job.jmc.api.entity.Workshop;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRepository extends BaseRepository<Workshop, Long> {
}
