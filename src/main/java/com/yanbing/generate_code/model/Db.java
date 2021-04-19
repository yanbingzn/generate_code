package com.yanbing.generate_code.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: yanbing
 * @Date: 2021/04/18/14:49
 * @Description:
 */
public class Db {
    private String username;
    private String password;
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
