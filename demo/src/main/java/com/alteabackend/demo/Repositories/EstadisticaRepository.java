package com.alteabackend.demo.Repositories;

import java.util.List;
import com.alteabackend.demo.Models.Estadistica;

public interface EstadisticaRepository {
    public int countEstadistica();
    public List<Estadistica> getAllEstadistica();
    public Estadistica createEstadistica(Estadistica noticia);
    public boolean deleteEstadistica(long id);
    public Estadistica getEstadistica(long id);
    public boolean updateEstadistica(Estadistica nuevoEstadistica);
}