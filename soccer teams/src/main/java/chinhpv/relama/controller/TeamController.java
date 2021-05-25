package chinhpv.relama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chinhpv.relama.service.TeamService;
import chinhpv.relama.util.FMConstant;
import chinhpv.relama.util.ResponseData;

@RestController

public class TeamController {

	@Autowired
	TeamService teamService;
	
	@GetMapping("team")
	public ResponseEntity<?> getAllTeam(){
		ResponseEntity<ResponseData> responseEntity;
		ResponseData responseData;
		try {
			responseData = teamService.getAll();
			if(responseData == null) {
				responseData = new ResponseData(false, FMConstant.MESSAGE.NOT_FOUND, null);
			}
			responseEntity = new ResponseEntity<ResponseData>(responseData, HttpStatus.OK);
		} catch (Exception e) {
			responseData = new ResponseData(false, FMConstant.MESSAGE.EXCEPTION, null);
			responseEntity = new ResponseEntity<ResponseData>(responseData, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
		
	}
}
