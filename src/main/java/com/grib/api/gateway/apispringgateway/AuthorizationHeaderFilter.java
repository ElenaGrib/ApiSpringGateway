package com.grib.api.gateway.apispringgateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationHeaderFilter extends AbstractGatewayFilterFactory<AuthorizationHeaderFilter.Config> {

    public static class Config {
        //Put some configuration properties here
    }


    @Override
    public GatewayFilter apply(Config config) {
        return null;
    }

}
