package com.manulife.eTransfer.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "e-transfer-security")
@Getter
@Setter
public class SecurityConfiguration {
    private String appClientId;
    private String appClientSecret;
}
