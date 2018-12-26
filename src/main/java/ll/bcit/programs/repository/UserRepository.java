package ll.bcit.programs.repository;

import org.springframework.data.repository.CrudRepository;

import ll.bcit.programs.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
