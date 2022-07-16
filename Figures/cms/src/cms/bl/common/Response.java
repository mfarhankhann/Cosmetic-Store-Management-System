/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.bl.common;

import java.util.ArrayList;

/**
 *
 * @author Talah Khan
 */
public class Response {
     private ArrayList<Message> _messagesList = new ArrayList<Message>();

    public boolean IsSuccessful() {
        for(Message m : _messagesList)
        {
        if(m.MessageType.equals("Exception") || m.MessageType.equals("Error"))
            return false;
        }
        return true;
    }

    public String getErrorMessagesList() {
        StringBuilder sb = new StringBuilder();
        for(Message m : _messagesList)
        {
        if(m.MessageType.equals("Exception") || m.MessageType.equals("Error"))
            sb.append(m.Description +"\n");
        }
        return sb.toString();
    }

    public void AddErrorMessage(String errorMessage) {
        addMessage(errorMessage, "Error");
    }

    public void addInformationMessage(String messageDesc) {
        addMessage(messageDesc,"Information");
    }

    private void addMessage(String messageDesc, String type) {
        Message objMessage = new Message(messageDesc,type);
        _messagesList.add(objMessage);
    }
}
