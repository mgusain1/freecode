package Graph;
import java.util.*;
import java.util.LinkedList;

public class bfs {
    public LinkedList<Integer> a[];
    public bfs(int v){
        a = new LinkedList[v];
        for(int i=0;i<v;i++){
            a[i] = new LinkedList();
        }
    }
    public void addedge(int sour,int dest){
        a[sour].add(dest);
    }

    public void actual(int s){
        boolean vis[] = new boolean[a.length];

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        vis[s] = true;

        while(q.size()!=0){
            s = q.poll();
            System.out.print(s+" ");

            Iterator<Integer> i = a[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!vis[n]){
                    vis[n] = true;
                    q.add(n);
                }
            }
        }
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        sc.nextLine();
        int e = sc.nextInt();

        System.out.println(e+" no. of edges");
        bfs g = new bfs(v);
        for(int i =0;i<e;i++){
            int sou = sc.nextInt();
            int dex = sc.nextInt();
            g.addedge(sou, dex);
        }
        int s = sc.nextInt();
        g.actual(s);


    }
    
}
