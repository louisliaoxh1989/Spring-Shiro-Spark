package com.zhuxs.result.dto;

import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.List;

/**
 * Created by shusesshou on 2017/9/22.
 */
public class UserDto implements Serializable{
    private long id;
    private String name;

    private String username;
    private String password;
    private String salt;
    private List<RoleDto> roles;
    private List<PermissionDto> permissions;

    public UserDto() {
    }

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserDto(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public UserDto(long id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public UserDto(long id, String name, String username, String password, List<RoleDto> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public UserDto(long id, String name, String username, String password, String salt) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.salt = salt;
    }

    public UserDto(long id, String name, String username, String password, String salt, List<RoleDto> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDto> roles) {
        this.roles = roles;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public List<PermissionDto> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionDto> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDto userDto = (UserDto) o;

        if (id != userDto.id) return false;
        if (name != null ? !name.equals(userDto.name) : userDto.name != null) return false;
        if (username != null ? !username.equals(userDto.username) : userDto.username != null) return false;
        if (password != null ? !password.equals(userDto.password) : userDto.password != null) return false;
        return salt != null ? salt.equals(userDto.salt) : userDto.salt == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        return result;
    }
}
