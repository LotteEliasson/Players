package demo.demoto.Repository;

import demo.demoto.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player findByName(String player);

    Player findByNameLike(String name);
}
