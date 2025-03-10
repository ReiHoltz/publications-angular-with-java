package io.github.publications.publicationsapi.application.users;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailDto {
    private String emailTo;
    private String subject;
    private String text;
}
