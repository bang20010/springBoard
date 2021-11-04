package springBoard.springBoard.domain.member;

import org.springframework.data.repository.CrudRepository;
import springBoard.springBoard.domain.board.Board;

// Member의 JPA에서의 DB Layer 접근자
public interface MemberRepository extends CrudRepository <Member, Long>
{

}
