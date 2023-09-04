package vn.com.devmaster.servies.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class People {
    private String firrtName;
    private String lastName;
    private String userName;
    private String passWord;
}
