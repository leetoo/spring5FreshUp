package net.codecrutches.spring5webapp.bootstrap;

import net.codecrutches.spring5webapp.model.Author;
import net.codecrutches.spring5webapp.model.Book;
import net.codecrutches.spring5webapp.model.Publisher;
import net.codecrutches.spring5webapp.repositories.AuthorRepository;
import net.codecrutches.spring5webapp.repositories.BookRepository;
import net.codecrutches.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/16/17.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("Biblio Globus");
        publisher.setAddress("12th Red Square, Msk");
        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Murat", "Evanov");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Roman", "Jorahov");
        Book akka = new Book("Akka for Spring Framework ", "23444", publisher );
        rod.getBooks().add(akka);
        akka.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(akka);
    }
}
