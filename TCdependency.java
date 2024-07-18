class UserRepository {
    public String getUser(int userId) {
        return "User " + userId;
    }
}

class UserService {
    private UserRepository userRepository;


    public UserService() {
        this.userRepository = new UserRepository(); // Direct instantiation
    }

    public String getUserInfo(int userId) {
        return userRepository.getUser(userId);
    }
}

public class TCdependency {
    public static void main(String[] args) {
        UserService us = new UserService();
        System.out.println(us.getUserInfo(4));
    }
}
