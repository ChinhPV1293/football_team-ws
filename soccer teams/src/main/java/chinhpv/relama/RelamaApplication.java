package chinhpv.relama;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import chinhpv.relama.entity.Member;
import chinhpv.relama.entity.Team;
import chinhpv.relama.repository.MemberRepository;
import chinhpv.relama.repository.TeamRepository;

@SpringBootApplication
public class RelamaApplication implements CommandLineRunner {
	
	@Autowired
	TeamRepository teamRepository;
	
	@Autowired
	MemberRepository memberRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RelamaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Team> listTeam = teamRepository.findAll();
		for(Team element : listTeam)
		{
			List<Member> listMember = memberRepository.findAllByTeamId(element.getId());
			for(Member member : listMember) {
				System.out.println(member.getFirstName());
			}
		}
	}
	
	

}
