package net.codecrutches.spring5webapp.repositories;

import net.codecrutches.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
