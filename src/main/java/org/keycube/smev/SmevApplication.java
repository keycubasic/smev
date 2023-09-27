package org.keycube.smev;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@ApplicationPath("smev")
@OpenAPIDefinition(
        info =
        @Info(
                title = "СМЭВ",
                description = "Сервисный концентратор",
                version = "1.0.1",
                contact = @Contact(
                        name = "Константинов Константин Константинович",
                        email = "keycube@mail.ru"
                )
        )
)
public class SmevApplication extends Application {
}
