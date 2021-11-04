package springBoard.springBoard.domain.board;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// Board의 JPA에서의 DB Layer 접근자
public interface BoardRepository extends CrudRepository <Board, Long>
{

        List<Board> findAllByOrderByIdDesc();

}
