package com.butterfly.profile.service;

import com.butterfly.profile.domain.Profile;
import java.util.List;

/**
 * Service Interface for managing Profile.
 */
public interface ProfileService {

    /**
     * Save a profile.
     *
     * @param profile the entity to save
     * @return the persisted entity
     */
    Profile save(Profile profile);

    /**
     *  Get all the profiles.
     *
     *  @return the list of entities
     */
    List<Profile> findAll();

    /**
     *  Get the "id" profile.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    Profile findOne(Long id);

    /**
     *  Delete the "id" profile.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
