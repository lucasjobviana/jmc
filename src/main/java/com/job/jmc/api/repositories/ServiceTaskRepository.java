package com.job.jmc.api.repositories;

import com.job.jmc.api.entities.ServiceTask;
import org.springframework.stereotype.Repository;
/**
 * The interface ServiceTask repository.
 */
@Repository
public interface ServiceTaskRepository extends BaseRepository<ServiceTask, Long> {
}
