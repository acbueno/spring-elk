package br.com.acbueno.elk.repository;

import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import br.com.acbueno.elk.model.Part;

public interface PartRepository extends ElasticsearchRepository<Part, String> {

  List<Part> findByName(String name);

  List<Part> findByBrand(String brand);

  List<Part> findByGenuine(Boolean genuine);

  List<Part> findByCategory(String category);

  List<Part> findByDescription(String description);



}
