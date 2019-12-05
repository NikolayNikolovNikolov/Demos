package n3qa.WD.support;

import n3qa.WD.settings.ResourceUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class n3Logger {
    private static boolean root = false;

    public static Logger getLogger(Class clazz) {
        if(root)
            return Logger.getLogger(clazz);

        PropertyConfigurator.configure(ResourceUtils
                .getResourcePath("log4j.properties"));
        root = true;
        return Logger.getLogger(clazz);
    }
}
