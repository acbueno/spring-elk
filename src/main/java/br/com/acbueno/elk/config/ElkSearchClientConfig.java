package br.com.acbueno.elk.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "br.com.acbueno.elk.repository")
@ComponentScan(basePackages = "br.com.acbueno.elk")
public class ElkSearchClientConfig extends AbstractElasticsearchConfiguration {

  @Override
  @Bean
  public RestHighLevelClient elasticsearchClient() {
    //@formatter:off
    final ClientConfiguration clientConfiguration =
        ClientConfiguration.builder().connectedTo("localhost:9200")
        .build();
   
    return RestClients
        .create(clientConfiguration)
        .rest();
    //@formatter:on
  }

}
