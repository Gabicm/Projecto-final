package com.iesemilidarder.gcarrascosa;

import java.util.ArrayList;
import java.util.List;

public class Activities extends Actions{

    private String Countries;
    private String Activities;


    public static void main(String... args) {

        List<String> Lista = new ArrayList<String>();{
            Lista.add("climbing");
            Lista.add("Sky");
            Lista.add("Tourist excursion");
            Lista.add("Tour soccer stadium");
        }

        List<String> Listaa = new ArrayList<String>();{
            Listaa.add("España");
            Listaa.add("Portugal");
        }

            for (int a = 0; a < Listaa.size(); a++) {

                Activities activities = new Activities();
                System.out.println(activities);

                for (int b = 0; b < Lista.size(); b++) {

                    System.out.println(b);
                }
            }

        }

        public void setCountries () {
        }
/*
    public String getActivities() {

            public static String[] getActivities(){
                for (int a = 0; a < Lista.size(); a++) {
                    return new String(Lista.get(a));
                }
            }
        return Activities;
        }

    public void setActivities(String activities) {
        Activities = activities;
    }

    public List<String> getLista() {
        return Lista;
    }

    public void setLista(List<String> lista) {
        Lista = lista;
    }

    public List<String> getListaa() {
        return Listaa;
    }

    public void setListaa(List<String> listaa) {
        Listaa = listaa;
    }
*/
}


