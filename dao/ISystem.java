/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;



/**
 *
 * @author hp
 */
public interface ISystem<T>  {
    public int create(T obj);
    public int update(T obj);
    public T findById(int id);
    public List<T> findAll();
}
