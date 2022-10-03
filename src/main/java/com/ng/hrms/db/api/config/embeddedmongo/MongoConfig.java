package com.ng.hrms.db.api.config.embeddedmongo;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;

@Configuration
public class MongoConfig {
    private static final String MONGO_DB_URL = "localhost";
    private static final String MONGO_DB_NAME = "SCA";
    private static final int PORT = 27020; // <- set MongoDB port
    private static final String MONGO_DB_LOCATION = "/embeddedMdb";
    
    @Bean
	public MongoInMemory mongoInMemory() {
	        return new MongoInMemory(PORT, MONGO_DB_URL, MONGO_DB_LOCATION);
	}
    
    @Bean
    public MongoTemplate mongoTemplate() throws IOException {
        EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();
        mongo.setBindIp(MONGO_DB_URL);
        mongo.setPort(PORT);
        MongoClient mongoClient = mongo.getObject();
        @SuppressWarnings("deprecation")
		MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, MONGO_DB_NAME);
        return mongoTemplate;
    }   
    
}
