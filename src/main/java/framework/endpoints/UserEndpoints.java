package framework.endpoints;

public class UserEndpoints {

    private static final String BASE = "/api";

    // GET
    public static final String GET_USERS = BASE + "/users";
    public static final String GET_SINGLE_USER = BASE + "/users/{id}";

    // POST
    public static final String CREATE_USER = BASE + "/users";

    // PUT
    public static final String UPDATE_USER = BASE + "/users/{id}";

    // DELETE
    public static final String DELETE_USER = BASE + "/users/{id}";
}
