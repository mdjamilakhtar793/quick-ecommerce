package com.jamildev.service;

import com.jamildev.model.Home;
import com.jamildev.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
