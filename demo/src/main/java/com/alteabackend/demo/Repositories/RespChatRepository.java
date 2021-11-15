package com.alteabackend.demo.Repositories;

import java.util.List;
import com.alteabackend.demo.Models.RespChat;

public interface RespChatRepository {
    public int countRespChat();
    public List<RespChat> getAllRespChat();
    public RespChat createRespChat(RespChat respchat);
    public boolean deleteRespChat(long id);
    public RespChat getRespChat(long id);
    public boolean updateRespChat(RespChat nuevoRespChat);
}