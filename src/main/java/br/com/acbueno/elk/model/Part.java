package br.com.acbueno.elk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "partindex")
public class Part {

  @Id
  private String id;

  @Field(type = FieldType.Text, name = "name")
  private String name;

  @Field(type = FieldType.Text, name = "brand")
  private String brand;

  @Field(type = FieldType.Double, name = "price")
  private Double price;

  @Field(type = FieldType.Integer, name = "quantity")
  private Integer quantity;

  @Field(type = FieldType.Boolean, name = "genuine")
  private boolean genuine;

  @Field(type = FieldType.Text, name = "description")
  private String description;

  @Field(type = FieldType.Text, name = "category")
  private String category;

}
