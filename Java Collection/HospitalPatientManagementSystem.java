import java.util.*;
public class HospitalPatientManagementSystem {
    static class Patient{ String id; Patient(String id){this.id=id;} public int hashCode(){return id.hashCode();} public boolean equals(Object o){return o instanceof Patient && ((Patient)o).id.equals(id);} public String toString(){return id;} }
    public static void main(String[] args){
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waiting = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();
        Patient p = new Patient("P1");
        if(admitted.add(p)) { waiting.add(p); history.add(p); }
        // treat
        while(!waiting.isEmpty()){
            Patient cur = waiting.poll();
            System.out.println("Treating " + cur);
            discharged.push(cur);
        }
        // re-admit last discharged
        if(!discharged.isEmpty()){
            Patient recent = discharged.pop();
            admitted.add(recent); waiting.add(recent);
        }
    }
}
