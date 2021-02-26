package ru.geebrains.online;

import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Account implements Serializable {
    private String userName;
    private String userPassword;
    private List<String> history;

    public Account(String userName, String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;
        history = new ArrayList<>();
    }

}
