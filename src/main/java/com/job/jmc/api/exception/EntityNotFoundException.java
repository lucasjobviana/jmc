package com.job.jmc.api.exception;

public class EntityNotFoundException extends RuntimeException{
  public EntityNotFoundException(String msgError) {
    super(msgError);
  }
  public <T> EntityNotFoundException(Class<T> entityClass, Object entityId) {
    super(String.format("Entidade (%s) com ID %s não encontrada", entityClass.getSimpleName(), entityId));
  }
}
