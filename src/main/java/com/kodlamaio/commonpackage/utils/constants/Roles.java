package com.kodlamaio.commonpackage.utils.constants;

public class Roles {
    public final static String AdminOrModerator = "hasRole('admin') or hasRole('moderator')";
    public final static String Admin = "hasRole('admin')";
    public final static String User = "hasRole('user')";
}
