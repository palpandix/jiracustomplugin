package ut.com.atlassian.devplugins.jiracustomplugin;

import org.junit.Test;
import com.atlassian.devplugins.jiracustomplugin.api.MyPluginComponent;
import com.atlassian.devplugins.jiracustomplugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        assertEquals("names match!", "myComponent","myComponent");
    }
}
