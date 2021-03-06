package mate.academy.internetshop.dao;

import java.util.Optional;

import mate.academy.internetshop.exceptions.DataProcessingException;
import mate.academy.internetshop.model.User;

public interface UserDao extends GenericDao<User, Long> {
    Optional<User> getByLogin(String login) throws DataProcessingException;

    Optional<User> getByToken(String token) throws DataProcessingException;
}
