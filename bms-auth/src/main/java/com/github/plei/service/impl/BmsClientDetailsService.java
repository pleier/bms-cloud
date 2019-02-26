package com.github.plei.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.oauth2.common.exceptions.InvalidClientException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;

import javax.sql.DataSource;

/**
 * @author : pleier
 * @date : 2019/2/26
 */
public class BmsClientDetailsService extends JdbcClientDetailsService {

    public BmsClientDetailsService(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    @Cacheable(value = "bms_oauth:client:details", key = "#clientId", unless = "#result == null")
    public ClientDetails loadClientByClientId(String clientId) throws InvalidClientException {
        return super.loadClientByClientId(clientId);
    }
}
