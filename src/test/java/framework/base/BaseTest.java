package framework.base;

import framework.client.ApiClient;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected ApiClient apiClient;

    @BeforeEach
    public void setUp() {
        apiClient = new ApiClient();
    }
}









