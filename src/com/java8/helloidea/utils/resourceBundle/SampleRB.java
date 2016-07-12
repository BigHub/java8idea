package com.java8.helloidea.utils.resourceBundle;

import java.util.ListResourceBundle;

/**
 *
 * Created by jianwei on 16/7/12.
 */
public class SampleRB extends ListResourceBundle {

    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "中文标题";

        resources[1][0] = "StopText";
        resources[1][1] = "停止";

        resources[2][0] = "StartText";
        resources[2][1] = "开始";

        return resources;
    }

}

