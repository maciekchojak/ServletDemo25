package com.sda.programminglanguage;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageDataHolder {

    private static ProgrammingLanguageDataHolder instance;
    private List<ProgrammingLanguage> programmingLanguages;

    public synchronized static ProgrammingLanguageDataHolder getInstance() {
        if (instance == null) {
            instance = new ProgrammingLanguageDataHolder();
            instance.programmingLanguages = new ArrayList<>();
            instance.programmingLanguages.add(new ProgrammingLanguage("Java","WEB, Desktop, Mobile","3/5"));
            instance.programmingLanguages.add(new ProgrammingLanguage("PHP","WEB","2/5"));
        }
        return instance;
    }

    public void addProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    public List<ProgrammingLanguage> getProgrammingLanguages() {
        return programmingLanguages;
    }
}
