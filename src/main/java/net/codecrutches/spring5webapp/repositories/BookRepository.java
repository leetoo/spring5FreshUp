package net.codecrutches.spring5webapp.repositories;

import net.codecrutches.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
