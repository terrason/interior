/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jterraghost.interior.module.user;

/**
 * 员工.
 * @author lee
 */
public class Employee {
    private Long id;
    private String name;
    private Office office;

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

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
