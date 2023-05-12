package programmerzamannow.springdata.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import programmerzamannow.springdata.jpa.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
