package chinhpv.relama.dto;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import chinhpv.relama.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty(value = "id")
	private Long id;
	
	@JsonProperty(value = "name")
	private String teamName;
	
	@JsonProperty(value = "address")
	private String address;
	
	@JsonProperty(value = "team")
	private Set<Member> members;
	
}
