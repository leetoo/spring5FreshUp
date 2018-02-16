package net.codecrutches.spring5webapp.controller;

import net.codecrutches.spring5webapp.repositories.AuthorRepository;
import net.codecrutches.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

  private AuthorRepository authorRepositoryRepository;

  public AuthorController(AuthorRepository authorRepositoryRepository) {
    this.authorRepositoryRepository = authorRepositoryRepository;
  }

  @RequestMapping("/authors")
  public String getBooks(Model model) {
    model.addAttribute("authors", authorRepositoryRepository.findAll());
    return "authors";
  }
}
