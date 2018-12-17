package com.baizhi.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String username;

    private String name;
    private String password;
    private Integer sax;

    public Integer getSax() {
        return sax;
    }

    public void setSax(Integer sax) {
        this.sax = sax;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", name=" + name + ", password="
                + password + ", sax=" + sax + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result
                + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((sax == null) ? 0 : sax.hashCode());
        result = prime * result
                + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (sax == null) {
            if (other.sax != null)
                return false;
        } else if (!sax.equals(other.sax))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }


}
