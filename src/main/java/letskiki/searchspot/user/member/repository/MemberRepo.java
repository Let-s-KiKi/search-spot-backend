package letskiki.searchspot.user.member.repository;

import letskiki.searchspot.user.member.entity.Member;

import java.util.Optional;

public interface MemberRepo {

    Member save(Member member);

    Optional<Member> findByIdx(Long memberId);

    void delete(Member member);
}
