package com.alteabackend.demo.Repositories;

import java.util.List;
import com.alteabackend.demo.Models.RespUs;

public interface RespUsRepository {
    public int countRespUs();
    public List<RespUs> getAllRespUs();
    public RespUs createRespUs(RespUs RespUs);
    public boolean deleteRespUs(long id);
    public RespUs getRespUs(long id);
    public boolean updateRespUs(RespUs nuevoRespUs);
}