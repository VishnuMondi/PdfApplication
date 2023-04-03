package in.vishnu.repository;

import org.springframework.data.repository.CrudRepository;

import in.vishnu.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {

}
