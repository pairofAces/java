import java.util.*;
public class threeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> treee = new TreeSet<String>();
        List<String> output = new LinkedList<String>();
        List<Integer> inarr = new ArrayList<Integer>();
        
        String inputLine = sc.nextLine();
        String[] str = inputLine.split(",");
        for(String elem: str) {
            inarr.add(Integer.parseInt(elem));
        }
        sc.close();
        
        for(int i = 0; i < inarr.size(); i++) {
            for(int j = 0; j < inarr.size(); j++) {
                for(int k = 0; k < inarr.size(); k++) {
                    if(i==j || i==k ||j==k) {
                        continue;
                    }
                    String s = Integer.toString(inarr.get(i))+Integer.toString(inarr.get(j))+Integer.toString(inarr.get(k));
                    treee.add(s);
                }
            }
        }
        System.out.println(treee);
        int numCombinations = treee.size();
        String max = treee.last();
        System.out.println(max + "," + numCombinations);
    }
    
}


// Richards solution below
public class threeDigits {
    public static void main(String[] args) {
        int max = 0;
        ArrayList<int> list = new ArrayList<int>();
        for(int i = 0; i < inarr.size(); i++) {
                    for(int j = 0; j < inarr.size(); j++) {
                        for(int k = 0; k < inarr.size(); k++) {
                            if(i==j || i==k ||j==k) {
                                continue;
                            }
                            int l = inarr[i] *100 + inarr[j] *10 + inarr[k];
                            if(l > max){
                                max = l;
                            }
                            if(!list.contains(l)){
                                list.add(l);
                            }
                        }
                    }
                }
    }
}