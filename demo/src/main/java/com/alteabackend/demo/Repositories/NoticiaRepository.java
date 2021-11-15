package com.alteabackend.demo.Repositories;

import java.util.List;
import com.alteabackend.demo.Models.Noticia;

public interface NoticiaRepository {
    public int countNoticia();
    public List<Noticia> getAllNoticia();
    public Noticia createNoticia(Noticia noticia);
    public boolean deleteNoticia(long id);
    public Noticia getNoticia(long id);
    public boolean updateNoticia(Noticia nuevoNoticia);
}