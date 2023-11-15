package com.infinite.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.infinite.demo.model.File;
import com.infinite.demo.repository.FileRepository;
@Service
public class FileService {
	@Autowired
	  private FileRepository fileRepository;
	  public File saveFile(MultipartFile file) {
		  String name = file.getOriginalFilename();
		  try {
			  File fi = new File(name,file.getContentType(),file.getBytes());
			  return fileRepository.save(fi);
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  return null;
	  }
	  public File getFile(Integer fileId) {
		  return fileRepository.findOne(fileId);
	  }
	  public List<File> getFiles(){
		  return fileRepository.findAll();
	  }
}