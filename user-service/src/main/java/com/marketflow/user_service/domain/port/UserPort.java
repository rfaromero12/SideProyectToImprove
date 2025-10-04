package com.marketflow.user_service.domain.port;

import com.marketflow.user_service.domain.model.User;

public interface UserPort {

	boolean existsByEmail(String email);

	User save(User user);

}
