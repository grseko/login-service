package com.grseko.db.mongo.user;

import com.grseko.db.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoUserRepository extends MongoRepository<User, String> {

  User findByUsername(String username);

}