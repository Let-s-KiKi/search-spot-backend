package letskiki.searchspot.user.member.repository;

import letskiki.searchspot.user.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepo extends JpaRepository<Member, Long> {
}
