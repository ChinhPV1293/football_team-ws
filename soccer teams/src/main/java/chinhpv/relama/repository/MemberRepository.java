package chinhpv.relama.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chinhpv.relama.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	public List<Member> findAllByTeamId(Long id);
}
