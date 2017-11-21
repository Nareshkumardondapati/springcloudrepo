package com.nareshit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nareshit.domain.Patient;

@Repository
public class PatientDaoImpl implements PatientDao {

	@Autowired
	private SessionFactory sf;
	@Override
	public Patient savePatient(Patient pat) {
		//Session ses = sf.openSession();
		Session ses = sf.getCurrentSession();
		ses.save(pat);
		//ses.beginTransaction().commit();
		//ses.close();
		return pat;
	}

	@Override
	public Patient updatePatient(Patient pat) {
		Session ses = sf.getCurrentSession();
		ses.update(pat);
		return pat;
	}

	@Override
	public boolean deletePatinet(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Patient getPatientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getAllPatientsByPaging(int currPage, int noOfRecPerPage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> searchAllPatientsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}