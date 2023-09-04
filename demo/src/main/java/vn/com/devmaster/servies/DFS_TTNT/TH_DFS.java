package vn.com.devmaster.servies.DFS_TTNT;

import java.util.Deque;
import java.util.LinkedList;

public class TH_DFS<E> {
    // duyệt từ phải qua (ngăn xếp)
    public void DFS(Dinh<E> DinhBatDau,Dinh<E> DinhCuoi) {
        Deque<Dinh<E>> dinhs = new LinkedList<>(); // khởi tạo dãy các đỉnh
        dinhs.push(DinhBatDau); // cho đỉnh bắt đầu vào ngăn xếp (push)
        while (!dinhs.isEmpty()) {
            Dinh<E> layra = dinhs.pop(); // lấy ra từ ngăn xếp
            if (!layra.isDiachi()) {
                layra.setDiachi(true);
                System.out.println(layra);
                layra.getList().forEach(dinhs::push);
            }
            if(layra == DinhCuoi){
                return;
            }
        }
    }

    // duyệt từ trái qua phải (đệ quy )
    public void Dfs(Dinh<E> DinhBatDau) {
        DinhBatDau.setDiachi(true);
        System.out.println(DinhBatDau);
        DinhBatDau.getList().stream()
                .filter(neighbor -> !neighbor.isDiachi())
                .forEach(this::Dfs);
    }

}
