package letskiki.searchspot.user.member.repository;

import letskiki.searchspot.user.member.entity.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberRdbRepo implements MemberRepo {

    private final MemberJpaRepo memberJpaRepo;

    @Override
    public Member save(Member member) {
        return memberJpaRepo.save(member);
    }

    @Override
    public Optional<Member> findByIdx(Long memberId) {
        return memberJpaRepo.findById(memberId);
    }

    @Override
    public void delete(Member member) {
        memberJpaRepo.delete(member);
    }
}
