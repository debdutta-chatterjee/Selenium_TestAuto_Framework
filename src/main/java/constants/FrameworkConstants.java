package constants;

import lombok.Getter;

import java.time.Duration;

@Getter
public final class FrameworkConstants
{
    private FrameworkConstants(){}

    private static final String USER_DIR = System.getProperty("user.dir");
    private static final String TEST_RESOURCE_DIR = USER_DIR+"/src/test/resources/";
    private static final String CONFIGFILEPATH = TEST_RESOURCE_DIR+"config/config.properties";
    private static final String TESTDATAPATH = TEST_RESOURCE_DIR+"Test_Data/TestData_<ENV>.xlsx";
    private static final String TESTSUITEPATH = TEST_RESOURCE_DIR+"Test_Suite/Test_Suite_<ENV>.xlsx";
    private static final Duration DEFAULTWAITTIME = Duration.ofSeconds(10);
    private static final String GRIDURL = "http://localhost:4444/wd/hub";

    public static String getConfigfilepath() {
        return CONFIGFILEPATH;
    }
}
