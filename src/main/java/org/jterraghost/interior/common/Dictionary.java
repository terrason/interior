/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jterraghost.interior.common;

import java.util.Map;

/**
 * 业务字典.
 * @author lee
 */
public class Dictionary {
    private Long id;
    private String name;
    private Map<Long,String> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Long, String> getItems() {
        return items;
    }

    public void setItems(Map<Long, String> items) {
        this.items = items;
    }
    
}
