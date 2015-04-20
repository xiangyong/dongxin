/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd.kaopu.user;

/**
 *
 * @author 周飞
 */
public interface IUserManager {

    public boolean addUser(User user);

    public boolean updateUser(User user);
    
    public int count(User user);
}
