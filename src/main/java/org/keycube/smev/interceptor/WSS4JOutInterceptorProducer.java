package org.keycube.smev.interceptor;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Produces;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.common.ConfigurationConstants;
import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class WSS4JOutInterceptorProducer {

    @ConfigProperty(name = "wss.username")
    String username;

    @ConfigProperty(name = "wss.password")
    String password;

    @Produces
    @Unremovable
    @ApplicationScoped
    WSS4JOutInterceptor wssInterceptor() {
        final CallbackHandler passwordCallback = callbacks -> {
            for (Callback callback : callbacks) {
                if (callback instanceof WSPasswordCallback) {
                    ((WSPasswordCallback) callback).setPassword(password);
                }
                return;
            }
        };
        final Map<String, Object> props = new HashMap<>();

        props.put(ConfigurationConstants.ACTION, ConfigurationConstants.SIGNATURE);
        props.put(ConfigurationConstants.PW_CALLBACK_REF, passwordCallback);
        props.put(ConfigurationConstants.USER, username);
        props.put(ConfigurationConstants.SIGNATURE_USER, username);
        props.put(ConfigurationConstants.SIG_PROP_FILE, "crypto/sign.properties");
        props.put(ConfigurationConstants.SIG_KEY_ID, "DirectReference");

        return new WSS4JOutInterceptor(props);
    }
}