package com.sysco.qe.api.common;

public class Constant {


    public static final String TEST_ENV = System.getProperty("tests.env", "QA");
    public static final String TEST_RELEASE = System.getProperty("tests.release", "pricefx_e2e-automation_dnb");
    public static final String TEST_PROJECT = System.getProperty("tests.project", "Sysco OGM API");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));

    Constant() {

    }


}
