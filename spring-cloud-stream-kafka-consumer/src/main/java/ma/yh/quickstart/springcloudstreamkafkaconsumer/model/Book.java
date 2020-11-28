package ma.yh.quickstart.springcloudstreamkafkaconsumer.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Long  id;
    private String title;
}
