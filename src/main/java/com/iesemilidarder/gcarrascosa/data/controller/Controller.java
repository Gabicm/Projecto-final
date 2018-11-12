package com.iesemilidarder.gcarrascosa.data.controller;


import com.iesemilidarder.gcarrascosa.DataHelper;
import com.iesemilidarder.gcarrascosa.data.Activity;
import com.iesemilidarder.gcarrascosa.data.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @RequestMapping("/getAll")
        public List<Product> getAll() {

        return DataHelper.items;
    }

   /* @RequestMapping("/activity") {
        public Activity getActivity(@RequestParam(value = "name", defaultValue = "World")String activityKind){
        Activity activity = new Activity();
        Activity.setActivityKind("activityKind");
        DataHelper.items.add(activity);
        return activity;
        }
    }*/
}

