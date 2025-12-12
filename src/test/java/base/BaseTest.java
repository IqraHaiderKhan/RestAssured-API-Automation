package base;

import framework.client.ApiClient;
import framework.utils.LoggerUtil;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected ApiClient apiClient;

    @BeforeClass
    public void setUp() {
        LoggerUtil.log("Initializing BaseTest setup...");
        apiClient = new ApiClient();
        LoggerUtil.log("ApiClient initialized successfully.");
    }
}











