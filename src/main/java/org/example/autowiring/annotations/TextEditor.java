package org.example.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    @Override
    public String toString() {
        return "TextEditor{" +
                "spellChecker=" + spellChecker.toString() +
                ", name='" + name + '\'' +
                '}';
    }

    //We can use Autowiring annotation on setter method, constructor, or no field level, here used on the setter method
    //Qualifier argument searches for a bean with the matching bean name
    //required under Autowiring specifies if exception should be thrown in case matching bean is not found
    @Autowired(required = false)
    @Qualifier("spellchecker123")
    public void setSpellChecker( SpellChecker spellChecker ) {
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
