package com.hamza.microservice_commande.configurations;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("mes-configs-ms")
@RefreshScope
@Data
public class ApplicationPropertiesConfiguration {
    // correspond à la propriété « mes-configs.limitDeProduits » dans le fichier de configuration du MS
    private int commandes_last;

}