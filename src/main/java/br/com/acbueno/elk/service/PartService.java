package br.com.acbueno.elk.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.acbueno.elk.model.Part;
import br.com.acbueno.elk.repository.PartRepository;

@Service
public class PartService {

  @Autowired
  private PartRepository partRepository;

  public Part createPartIndex(final Part part) {
    return partRepository.save(part);
  }

  public Iterable<Part> createPartIndex(final List<Part> parts) {
    return partRepository.saveAll(parts);
  }

  public List<Part> getAllPartName(String partMame) {
    return partRepository.findByName(partMame);
  }

  public Part findById(String id) {
    return partRepository.findById(id).get();
  }

  public List<Part> findByCategory(String category) {
    return partRepository.findByCategory(category);
  }

  public List<Part> findByDescription(String description) {
    return partRepository.findByDescription(description);
  }

}
