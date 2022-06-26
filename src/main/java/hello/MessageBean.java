package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import jdk.vm.ci.meta.Local;

import java.beans.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String msg;
    private String gen;
        
    public MessageBean() {
    }

    public String getGen(){
        return gen;
    }

    public void setGen(String gen){
        this.gen=gen;
    }

    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String lang) {

        String  timeOfDay = getTimeOfDay();

        switch (lang){
            case "":
            case "pt":
                switch (timeOfDay){
                    case "day":
                        msg = "Bom dia, ";
                        break;
                    case "afternoon":
                        msg = "Boa tarde, ";
                        break;
                    case "night":
                        msg = "Boa noite, ";
                        break;
                }
                if(gen.equals("ma")){
                    msg += "Senhor ";
                }else if (gen.equals("fe")){
                    msg+= "Senhora ";
                }
                break;
            case "en":
                switch (timeOfDay){
                    case "day":
                        msg = "Good morning, ";
                        break;
                    case "afternoon":
                        msg = "Good afternoon, ";
                        break;
                    case "night":
                        msg = "Good night, ";
                        break;
                }
                if(gen.equals("ma")){
                    msg += "Mister ";
                }else if (gen.equals("fe")){
                    msg+= "Miz ";
                }
                break;
            case "de":
                switch (timeOfDay){
                    case "day":
                        msg = "Guten Morgen, ";
                        break;
                    case "afternoon":
                        msg = "Guten Nachmittag, ";
                        break;
                    case "night":
                        msg = "Gute Nacht, ";
                        break;
                }
                if(gen.equals("ma")){
                    msg += "Herr ";
                }else if (gen.equals("fe")){
                    msg+= "Frau  ";
                }
                break;
            case "fr":
                switch (timeOfDay){
                    case "day":
                        msg = "Bonjour, ";
                        break;
                    case "afternoon":
                        msg = "Bon après-midi, ";
                        break;
                    case "night":
                        msg = "Bonne nuit, ";
                        break;
                }
                if(gen.equals("ma")){
                    msg += "Monsieur ";
                }else if (gen.equals("fe")){
                    msg+= "Madame  ";
                }
                break;
            case "sp":
                switch (timeOfDay){
                    case "day":
                        msg = "Buenos dias, ";
                        break;
                    case "afternoon":
                        msg = "Buenas tardes, ";
                        break;
                    case "night":
                        msg = "Buenas noches, ";
                        break;
                }
                if(gen.equals("ma")){
                    msg += "Señor ";
                }else if (gen.equals("fe")){
                    msg+= "Señora  ";
                }
                break;
            case "li":
                switch (timeOfDay){
                    case "day":
                        msg = "Labas rytas, ";
                        break;
                    case "afternoon":
                        msg = "Laba diena, ";
                        break;
                    case "night":
                        msg = "Labos nakties, ";
                        break;
                }
                if(gen.equals("ma")){
                    msg += "pone ";
                }else if (gen.equals("fe")){
                    msg+= "ponia  ";
                }
                break;
        }
    }

    public String getTimeOfDay(){
        LocalTime timeNow = LocalTime.now();
        if(timeNow.isBefore(LocalTime.NOON)){
            return "day";
        } else if (timeNow.isBefore(LocalTime.of(18,0))) {
            return "afternoon";
        } else if (timeNow.isBefore(LocalTime.MAX)){
            return "night";
        } else {
            throw new RuntimeException("Unknown time");
        }
    }

}
