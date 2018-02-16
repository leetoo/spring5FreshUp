package net.codecrutches.spring5webapp.repositories;

import net.codecrutches.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long > {
}
