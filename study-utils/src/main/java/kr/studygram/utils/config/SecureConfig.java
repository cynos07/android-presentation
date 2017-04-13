package kr.studygram.utils.config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Parameters;

import java.io.File;

/**
 * Created by production on 2017-04-06.
 */
public enum SecureConfig {
    INSTANCE;
    private Configuration config;
    private String CONFIG_FILENAME = "SecureConfig.xml";
    private String CONFIG_PATH = SecureConfig.class.getClassLoader().getResource("conf").getPath()+"/" + CONFIG_FILENAME;

    SecureConfig() {
        Parameters params = new Parameters();
        File xmlFile = new File(CONFIG_PATH);

        //load file SecureConfig.xml  and intialize config
    }

    //getValue from config with key method ( String, int etc..)
}