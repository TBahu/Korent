package com.korent.server;

import com.korent.dao.AdminDao;
import com.korent.dao.NotificationDao;
import com.korent.dao.UserDao;


/**
 * Created by lei on 15-8-28.
 */
public class AdminServer {
    private AdminDao adminDao;
    private UserDao userDao;
    private NotificationDao notificationDao;


    public AdminServer() {
    }

    public AdminDao getAdminDao() {
        return adminDao;
    }

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public NotificationDao getNotificationDao() {
        return notificationDao;
    }

    public void setNotificationDao(NotificationDao notificationDao) {
        this.notificationDao = notificationDao;
    }
}
