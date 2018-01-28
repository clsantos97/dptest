/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dto;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class UserDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String name;
    private String lastName;
    private String email;
    
}
