package com.java8.helloidea.utils.resourceBundle;

import java.util.ListResourceBundle;

/**
 * Default version (English).
 * Created by jianwei on 16/7/12.
 */
public class SampleRB_en extends ListResourceBundle{

    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];

        resources[0][0] = "title";
        resources[0][1] = "My Program";

        resources[1][0] = "StopText";
        resources[1][1] = "Stop";

        resources[2][0] = "StartText";
        resources[2][1] = "Start";

        return resources;
    }

}
