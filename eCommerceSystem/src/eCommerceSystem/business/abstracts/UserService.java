package eCommerceSystem.business.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserService {
void add(User user);

void login(User user);

List<User> getAll();


}
