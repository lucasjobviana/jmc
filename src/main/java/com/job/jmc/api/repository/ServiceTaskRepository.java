package com.job.jmc.api.repository;

import com.job.jmc.api.entity.ServiceTask;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTaskRepository extends BaseRepository<ServiceTask, Long> {
}
