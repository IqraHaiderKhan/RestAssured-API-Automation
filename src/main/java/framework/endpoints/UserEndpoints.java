package framework.endpoints;
import framework.endpoints.UserEndpoints;

public class UserEndpoints {

    // GET
    public static final String GET_USERS = "/users?page=2";
    public static final String GET_SINGLE_USER = "/users/{id}";

    // POST
    public static final String CREATE_USER = "/users";

    // PUT
    public static final String UPDATE_USER = "/users/{id}";

    // DELETE
    public static final String DELETE_USER = "/users/{id}";
}

