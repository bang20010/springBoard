package springBoard.springBoard.domain.member;

import org.springframework.data.repository.CrudRepository;
import springBoard.springBoard.domain.board.Board;

public interface MemberRepository extends CrudRepository <Member, Long>
{

}
