/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.io;

import app.dto.UserDTO;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface UserInterface {
    public void createUser(UserDTO user);
    public List<UserDTO> getUsers();
}
