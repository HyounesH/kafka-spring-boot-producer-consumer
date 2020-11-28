package ma.yh.quickstart.springcloudstreamkafkapublisher.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Long id;
    private String title;
}
