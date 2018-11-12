package com.iesemilidarder.gcarrascosa.data.controller;


import com.iesemilidarder.gcarrascosa.DataHelper;
import com.iesemilidarder.gcarrascosa.data.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @RequestMapping("/getAll")
    public List<Product> get(){
        List<Product> items = DataHelper.getData;
        return items;
    }
}
