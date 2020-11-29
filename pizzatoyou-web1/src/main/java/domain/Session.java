package domain;

import lombok.Data;

import java.time.Instant;

@Data
public class Session {

    private String id;
    private String userId;
    private Instant createdDate;

}
