package org.example.autowiring.annotations;

public class SpellChecker {
    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public String toString() {
        return "SpellChecker{" +
                "isEnabled=" + isEnabled +
                '}';
    }

    private boolean isEnabled;
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
}
