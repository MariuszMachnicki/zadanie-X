import java.util.HashMap;
import java.util.Map;

public class ScoreCard {


    Map<String, Integer> subject = new HashMap<String, Integer>();



        Integer wf = subject.put("WF", 5);
        Integer biologia = subject.put("Biologia", 4);
        Integer matematyka = subject.put("Matematyka", 3);
        Integer informatyka = subject.put("Informatyka", 4);


        public void printIndeks () {
        for (String i : subject.keySet()) {
            System.out.println(i + " : " + subject.get(i));
            }
        }
        public int srednia() {
            int oceny = subject.get(wf + biologia + matematyka + informatyka);
            return oceny;

        }


}

