package kr.studygram.utils.logger;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;

/**
 * Created by production on 2017-04-07.
 */
public enum Logger {
    INSTANCE;
    private org.apache.logging.log4j.Logger logger;
    private String LOGGER_CONFIG_PATH = Logger.class.getClassLoader().getResource("log4j2.xml").toString();

    Logger()
    {
        //set log4j2.xml path
        System.setProperty(XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY,LOGGER_CONFIG_PATH);

        //getLogger from log4j2.xml. name="studyLogger"
    }

    public void log(String level, String message)
    {
        logger.log(Level.toLevel(level), message);
    }
}
