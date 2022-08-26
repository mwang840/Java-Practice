package src;
import java.util.HashMap;
import java.util.Map;

public class MoleculeToAtoms {
    public static Map<String, Integer> getAtoms(String formula){
        Map<String, Integer> atoms = new HashMap<String, Integer>();
        for(int i = 0; i < formula.length(); ++i){
            int count = 0;
            char tempChar = formula.charAt(i);
            String tempString = "";
            tempString = String.valueOf(tempChar);
            //indicates if the string falls under the category [A-Z]
            if(tempString.matches("[A-Z]")){
                for(int j = i+1; j < formula.length(); ++j){
                    char matching = formula.charAt(j);
                    String matched = String.valueOf(matching);
                    if(matched.matches("[a-z]")){
                        tempChar+=matching;
                        if(atoms.get(tempString) == null){
                            atoms.put(tempString, 1);
                        }
                        else{
                            atoms.put(tempString, atoms.get(tempString) + 1);
                        }
                        count = 1;
                    }
                    else if(matched.matches("[\\d]")){
                        int intonly = Integer.parseInt(matched);
                        atoms.put(tempString, intonly);
                        count = 1;
                    }
                    else{
                        i = j- 1;
                        break;
                    }
                }

                if(count == 0){
                    if(atoms.get(tempString) == null){
                        atoms.put(tempString, 1);
                    }
                    else{
                        atoms.put(tempString, atoms.get(tempString) + 1 );
                    }
                }
            }
        }

        return atoms;
    }


    public static void main(String[] args) {
        System.out.println(getAtoms("H2O"));
    }
}



