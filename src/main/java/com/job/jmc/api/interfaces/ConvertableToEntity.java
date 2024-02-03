package com.job.jmc.api.interfaces;
/**
 * This interface defines the contract for objects that can be converted to an entity.
 * Implementing classes should provide the logic to transform themselves into an entity representation.
 *
 * @param <T> The type of entity to which the object can be converted.
 */
public interface ConvertableToEntity<T> {
  /**
   * Converts the implementing object to an entity representation.
   *
   * @return The entity representation of the object.
   */
  public T toEntity();
}
