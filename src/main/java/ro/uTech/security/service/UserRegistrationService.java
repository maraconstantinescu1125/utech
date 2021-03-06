package ro.uTech.security.service;

import ro.uTech.security.exception.EmailExistsException;
import ro.uTech.security.exception.UsernameExistsException;
import ro.uTech.security.model.domain.User;
import ro.uTech.security.model.dto.UserDTO;


public interface UserRegistrationService {

    User registerNewUserAccount(UserDTO userDTO) throws EmailExistsException, UsernameExistsException;

    boolean isUserRegistered(String email);

    void changePassword(String email, String newPassword);

    void resetPassword(String email);

    void createPasswordResetTokenForUser(final User user, final String token);

    void resendPasswordResetTokenForUser(final User user);
}
