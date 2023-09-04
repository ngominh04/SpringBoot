package vn.com.devmaster.servies.DFS_TTNT;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public record TH_BFS<E>(Dinh<E> DinhBatDau,Dinh<E> DinhCuoi) {

        public void BFS() {
                Deque<Dinh<E>> list = new LinkedList<>();
                list.add( DinhBatDau);
                while (!list.isEmpty()) {
                        Dinh<E> layRa = list.poll();

                        if (!layRa.isDiachi()) {
                                layRa.setDiachi(true);
                                System.out.println(layRa);
                                list.addAll(layRa.getList());
                                if(layRa == DinhCuoi){
                                        return;
                                }
                        }

                }
        }

}

