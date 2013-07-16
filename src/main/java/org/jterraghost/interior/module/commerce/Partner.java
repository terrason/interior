/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jterraghost.interior.module.commerce;

import java.util.Collection;
import org.jterraghost.interior.common.ContactInfo;

/**
 * 合作伙伴.
 * @author terrason
 */
public class Partner {
    private Long id;
    private String username;
    private String realname;
    private Collection<ContactInfo> contactInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Collection<ContactInfo> getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Collection<ContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
    }
    
}
