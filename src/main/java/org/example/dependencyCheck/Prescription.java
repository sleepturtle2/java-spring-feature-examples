package org.example.dependencyCheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Prescription {
    private int id;
    private String patientName;
    private List<String> medicines;

    public int getId() {
        return id;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", medicines=" + medicines +
                '}';
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }
}
