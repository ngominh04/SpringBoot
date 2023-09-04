package vn.com.devmaster.servies.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PeopleDTO {
    private String name;
    private String userName;
    private String passWord;
}
