package org.example.setterInjection.reftypes;

public class Student {
    private Scores scores;

    public Scores getScores() {
        return scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "scores= [maths-" + scores.getMaths() + ", physics-" + scores.getPhysics() + ", chemistry-" + scores.getChemistry() + "] }";
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }
}
