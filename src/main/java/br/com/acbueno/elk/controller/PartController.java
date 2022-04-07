package br.com.acbueno.elk.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.acbueno.elk.model.Part;
import br.com.acbueno.elk.service.PartService;

@RestController
@RequestMapping("/v1/elk/part")
public class PartController {

  @Autowired
  private PartService partService;

  @GetMapping
  public List<Part> searchPartByName(@RequestParam("name") String name) {
    List<Part> partList = partService.getAllPartName(name);

    return partList;
  }

  @GetMapping("/category")
  public List<Part> searchCategory(@RequestParam("category") String category) {
    return partService.findByCategory(category);
  }

  @GetMapping("/description")
  public List<Part> searchDescription(@RequestParam("description") String description) {
    return partService.findByDescription(description);
  }

  @PostMapping()
  public Part addPart(@RequestBody Part partList) {
    return partService.createPartIndex(partList);
  }

  @PostMapping("/createbulk")
  public List<Part> addPartInBulk(@RequestBody List<Part> listPart) {
    return (List<Part>) partService.createPartIndex(listPart);
  }

}
