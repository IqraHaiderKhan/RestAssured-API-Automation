package framework.base;

import framework.client.ApiClient;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected ApiClient apiClient;

    @BeforeClass
    public void setUp() {
        apiClient = new ApiClient();
    }
}









