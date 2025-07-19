package com.socialmedia.rajatgram.config;

import com.socialmedia.rajatgram.model.user.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.support.MappingMongoEntityInformation;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public MappingMongoEntityInformation<?, String> mongoUserEntityInformation(MongoMappingContext mappingContext) {
        return new MappingMongoEntityInformation<>(
                mappingContext.getPersistentEntity(User.class),
                String.class
        );
    }

}
