package chatapp.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named
@SessionScoped

public class ChatMessage implements Serializable{
	private String participant; 
	private Date date; 
	private String content;


	public ChatMessage(String participant, Date date, String content){
		this.participant = participant;
		this.date = date;
		this.content = content;

	} 

	public String getParticipant(){
		return this.participant;
	}
	public Date getDate(){
		return this.date;
	}
	public String getContent(){
		return this.content;
	}


}