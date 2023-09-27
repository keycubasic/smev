package org.keycube.smev.logging;

import io.quarkus.runtime.configuration.ConfigUtils;
import jakarta.enterprise.context.ApplicationScoped;
import org.apache.cxf.ext.logging.LoggingFeature;

@ApplicationScoped
public class PrettyLoggingFeature extends LoggingFeature {

    public PrettyLoggingFeature() {
        if (ConfigUtils.getProfiles().contains("dev")) { // only for dev mode
            super.setPrettyLogging(true);
        }
    }
}
