package chinhpv.relama.util;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("is_success")
	private boolean isSuccess;
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("data")
	private Object data;

}
