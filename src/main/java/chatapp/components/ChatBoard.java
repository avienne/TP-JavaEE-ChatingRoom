package chatapp.components;

import chatapp.model.ChatMessage;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import javax.ejb.Singleton;
import javax.ejb.Stateful;
import java.util.List;
import java.util.LinkedList;

import static java.util.Collections.unmodifiableList;

@Named
@Singleton
@Stateful

public class ChatBoard {
	private List<ChatMessage> messages = new LinkedList<ChatMessage>();

	
	public List<ChatMessage> getMessages(){
		return unmodifiableList(this.messages);
	}

	public void addMessage(ChatMessage message){
		messages.add(message);
	}
}