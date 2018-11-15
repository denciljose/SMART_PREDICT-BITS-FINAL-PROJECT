package com.bits.service.db.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.service.db.model.PredictModel;
import com.bits.service.db.repo.PredictRepository;
@Service
public class PredictServiceImpl implements PredictService {

	@Autowired
	private PredictRepository predictrepository;
	@Override
	public List<PredictModel> retrievePredictModels() {
	
	return	predictrepository.findAll();
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	public PredictModel getPredictModel(Long PredictModelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePredictModel(PredictModel predictModel) {
		// TODO Auto-generated method stub
		predictrepository.save(predictModel);
		
	}

	@Override
	public void deletePredictModel(Long PredictModelId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePredictModel(PredictModel predictModel) {
		// TODO Auto-generated method stub
		
		predictrepository.save(predictModel);
		
	}

	@Override
	public List<PredictModel> getPredictByDate(String date) {
		// TODO Auto-generated method stub
		return predictrepository.findByUserModelId();
	}
	

}
