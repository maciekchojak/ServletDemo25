package com.sda.programminglanguage;

public class ProgrammingLanguage {
    private String name;
    private String using;
    private String level;

    public ProgrammingLanguage(String name, String using, String level) {
        this.name = name;
        this.using = using;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsing() {
        return using;
    }

    public void setUsing(String using) {
        this.using = using;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
