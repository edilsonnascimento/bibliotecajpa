package br.com.utfpr.jpa.biblioteca.repository;

import br.com.utfpr.jpa.biblioteca.modelo.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
