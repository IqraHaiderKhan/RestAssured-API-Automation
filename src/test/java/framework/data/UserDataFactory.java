package framework.data;

import framework.model.User;

public class UserDataFactory {

    public static User createValidUser() {
        return new User(
                "Iqra Test",
                "iqra_auto",
                "iqra@test.com"
        );
    }
}









