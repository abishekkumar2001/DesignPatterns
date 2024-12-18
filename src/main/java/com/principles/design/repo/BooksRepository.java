package com.principles.design.repo;

import com.principles.design.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

    Books findByBookId(Integer bookId);

}
