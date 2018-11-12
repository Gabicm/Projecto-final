package com.iesemilidarder.gcarrascosa;

import com.iesemilidarder.gcarrascosa.data.Activity;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String... args) {

        List<String> activities = new ArrayList<String>();
        {
            activities.add("Climbing");
            activities.add("Ski");
            activities.add("Tourist excursion");
            activities.add("Tour soccer stadium");
        }

        List<String> areas = new ArrayList<String>();
        {
            areas.add("España");
            areas.add("Portugal");
        }

        for (String activity : activities) {
            for (String area : areas) {
                Activity item = new Activity();
                item.setArea(area);
                item.setName(activity);
                DataHelper.items.add(item);
            }
        }
        System.out.println("hi");
        /*
        for (int a = 0; a < areas.size(); a++) {
            for (int b = 0; b < activities.size(); b++) {
                System.out.println(b);
                System.out.println(item);
                item.setArea();

            }

        }
*/
    }


}
