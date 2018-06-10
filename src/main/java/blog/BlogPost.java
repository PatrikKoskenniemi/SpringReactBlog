package blog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
public class BlogPost {

    public enum Type {
        BIG,
        SMALL,
        CARD
    }

    String title;
    String content;
    LocalDateTime dateTime;
    Type type;
}
