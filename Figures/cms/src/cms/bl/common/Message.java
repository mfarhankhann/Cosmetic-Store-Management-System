/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.bl.common;

/**
 *
 * @author Talah Khan
 */
public class Message {
        public String MessageType;
    public String Description;

    Message(String errorMessage, String errorType) {
        MessageType = errorType;
        Description = errorMessage;
    }
}
