package framework.base;

import framework.client.ApiClient;
import org.junit.Before;

public class BaseTest {

    protected ApiClient apiClient;

    @Before
    public void setUp() {
        apiClient = new ApiClient();
    }
}








