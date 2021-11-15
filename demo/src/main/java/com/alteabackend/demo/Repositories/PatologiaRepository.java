package com.alteabackend.demo.Repositories;

import java.util.List;
import com.alteabackend.demo.Models.Patologia;

public interface PatologiaRepository {
    public int countPatologia();
    public List<Patologia> getAllPatologia();
    public Patologia createPatologia(Patologia patologia);
    public boolean deletePatologia(long id);
    public Patologia getPatologia(long id);
    public boolean updatePatologia(Patologia nuevoPatologia);
}