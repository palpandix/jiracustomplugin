package com.atlassian.devplugins.jira.webwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;

public class AddWatchers extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(AddWatchers.class);
    /*private String currentJQL;*/



    @Override
    public String execute() throws Exception {
        /*
        this.currentJQL = "project+%3D+%22RFLOW%22+ORDER+BY+created+DESC\n" +
            "&currentIssueKey=DFLOWSP-1\n" +
            "&showSubTasks=true\n" +
            "&showSubTaskParent=true\n" +
            "&appId=\n" +
            "&query=t\n" +
            "&_=1674554038982";
        System.out.println(this.getSelectedProject());
        System.out.println(this.getActionName());
        //System.out.println((this.getServletContext().toString()))*/
        return super.execute(); //returns SUCCESS
    }
}
