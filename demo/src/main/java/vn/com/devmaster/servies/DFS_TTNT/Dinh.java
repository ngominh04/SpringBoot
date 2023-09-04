package vn.com.devmaster.servies.DFS_TTNT;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Data
public class Dinh<E> {
    private final E data;

    private boolean diachi;

    @ToString.Exclude
    private List<Dinh<E>> list = new ArrayList<>();

}
