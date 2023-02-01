package com.atlassian.devplugins.jira.webwork;

import com.atlassian.jira.web.action.JiraWebActionSupport;
import java.util.HashMap;
import java.util.Map;

public class Book extends JiraWebActionSupport{

    private boolean licensed;
    private String name;
    private Map<String, Integer> map;

    public Book() {
        this.licensed = true;
        this.name = "Ignited Minds";
        this.map = new HashMap<String, Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 1);
    }
    @Override
    public String execute() throws Exception {

        return super.execute(); //returns SUCCESS
    }

    public boolean isLicensed() {
        return licensed;
    }

    public String getName() {
        return name;
    }

    public java.util.Collection getMap() {
        return map.values();
    }
}
