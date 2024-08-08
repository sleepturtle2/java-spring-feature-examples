package org.example.setterInjection.properties;


import java.util.Properties;

public class CountriesAndLanguages {

    private Properties contriesAndLanguages;
    public Properties getContriesAndLanguages() {
        return contriesAndLanguages;
    }

    public void setContriesAndLanguages(Properties contriesAndLanguages) {
        this.contriesAndLanguages = contriesAndLanguages;
    }

    @Override
    public String toString() {
        return "CountriesAndLanguages{" +
                "contriesAndLanguages=" + contriesAndLanguages +
                '}';
    }


}
