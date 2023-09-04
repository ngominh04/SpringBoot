package vn.com.devmaster.servies.DFS_TTNT;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // các đỉnh và thứ tự các đỉnh
        Dinh<Integer> A = new Dinh<>(0);
        Dinh<Integer> B = new Dinh<>(1);
        Dinh<Integer> C = new Dinh<>(2);
        Dinh<Integer> D = new Dinh<>(3);
        Dinh<Integer> E = new Dinh<>(4);
        Dinh<Integer> F = new Dinh<>(5);
        Dinh<Integer> G = new Dinh<>(6);
        Dinh<Integer> H = new Dinh<>(7);
        Dinh<Integer> I = new Dinh<>(8);
        Dinh<Integer> J = new Dinh<>(9);
        Dinh<Integer> K = new Dinh<>(10);
        Dinh<Integer> L = new Dinh<>(11);
        Dinh<Integer> M = new Dinh<>(12);
        Dinh<Integer> N = new Dinh<>(13);
        Dinh<Integer> O = new Dinh<>(14);
        Dinh<Integer> P = new Dinh<>(15);
        Dinh<Integer> Q = new Dinh<>(16);
        Dinh<Integer> R = new Dinh<>(17);
        Dinh<Integer> S = new Dinh<>(18);
        Dinh<Integer> T = new Dinh<>(19);
        Dinh<Integer> U = new Dinh<>(20);

        //lập liên kết giữa các đỉnh
        A.setList(List.of(B, C, D));
        B.setList(List.of(E, F));
        C.setList(List.of(G, H));
        D.setList(List.of(I,J));
        E.setList(List.of(K, L));
        F.setList(List.of(L,M));
        L.setList(List.of(T));
        G.setList(List.of(N));
        H.setList(List.of(O,P));
        P.setList(List.of(U));
        I.setList(List.of(P,Q));
        J.setList(List.of(R));
        K.setList(List.of(S));

//        System.out.println("Thứ tự đỉnh duyệt DFS:");
//        TH_DFS<Integer> dfs = new TH_DFS<>();
//        dfs.DFS(A,I); // duyệt ngăn xếp từ phải qua
        //dfs.Dfs(A); // duyệt đệ quy từ trái qua phải

        System.out.println("\nThứ tự đỉnh duyệt BFS:");
        TH_BFS<Integer> bfs = new TH_BFS<>(A,I);
        bfs.BFS();
    }
}
