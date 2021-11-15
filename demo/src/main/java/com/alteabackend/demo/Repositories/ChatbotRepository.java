package com.alteabackend.demo.Repositories;

import java.util.List;
import com.alteabackend.demo.Models.Chatbot;

public interface ChatbotRepository {
    public int countChatbot();
    public List<Chatbot> getAllChatbot();
    public Chatbot createChatbot(Chatbot chatbot);
    public boolean deleteChatbot(long id);
    public Chatbot getChatbot(long id);
    public boolean updateChatbot(Chatbot nuevoChatbot);
}