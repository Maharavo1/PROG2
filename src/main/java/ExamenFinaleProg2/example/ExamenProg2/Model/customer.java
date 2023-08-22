package ExamenFinaleProg2.example.ExamenProg2.Model;

import lombok.*;

import java.util.Date;
@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
@ToString
public class customer {
    private int customer_id;
    private String name;
    private String first_name;
    private String adress;
    private String email;
    private String phone;
}
