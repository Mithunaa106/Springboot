
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepo;

@Service
public class PatientService {
    public PatientRepo patientRepo;
    public PatientService(PatientRepo patientRepo)
    {
        this.patientRepo = patientRepo;
    }
    public boolean savePatient(Patient patient)
    {
        try{
            patientRepo.save(patient);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Patient> getPatients()
    {
        return patientRepo.findAll();
    }
    public Patient getPatientById(int id)
    {
        Optional<Patient> obj = patientRepo.findById(id);
        return obj.orElse(null);
    }
}