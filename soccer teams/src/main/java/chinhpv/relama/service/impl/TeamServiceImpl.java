package chinhpv.relama.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chinhpv.relama.dto.TeamDTO;
import chinhpv.relama.entity.Team;
import chinhpv.relama.repository.TeamRepository;
import chinhpv.relama.service.TeamService;
import chinhpv.relama.util.FMConstant;
import chinhpv.relama.util.ResponseData;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	TeamRepository teamRepository;

	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public ResponseData getAll() {
		ResponseData responseData = null;
		List<Team> listTeam= teamRepository.findAll();
		if(listTeam != null && !listTeam.isEmpty()) {
			List<TeamDTO> listTeamDTOs = listTeam
					  .stream()
					  .map(team -> modelMapper.map(team, TeamDTO.class))
					  .collect(Collectors.toList());
			
			responseData = new ResponseData(true, FMConstant.MESSAGE.SUCCESS, listTeamDTOs);
		}			
		return responseData;
	}

}
