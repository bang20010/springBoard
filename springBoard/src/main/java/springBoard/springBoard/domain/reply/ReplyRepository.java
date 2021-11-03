package springBoard.springBoard.domain.reply;

import org.springframework.data.repository.CrudRepository;
import springBoard.springBoard.domain.board.Board;

public interface ReplyRepository extends CrudRepository <Reply, Long>
{

}
