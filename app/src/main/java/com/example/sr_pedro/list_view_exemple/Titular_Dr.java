package com.example.sr_pedro.list_view_exemple;

/**
 * Created by Sr_Pedro on 12/01/2017.
 */

public class Titular_Dr {
    private String titulo;
    private String subtitulo;
    public Titular_Dr(String title, String subs){
        titulo=title;
        subtitulo=subs;


    }
    public String getTitulo(){
        return titulo;
    }
    public String getSubtitulo(){
        return subtitulo;
    }
}
