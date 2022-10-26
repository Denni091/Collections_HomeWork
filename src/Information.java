import java.util.*;

public class Information {
    ArrayList<String> alias = new ArrayList<>();
    HashSet<String> email = new HashSet<>();

    HashSet<String> setOfAlias = new HashSet<>();
    ArrayList<String> emailList = new ArrayList<>();
    HashMap<String, String> userKey = new HashMap();

    public Information() {
        userInformation();
    }

    public void userInformation() {
//      добавляем уникальные значения в алиас и емаил
        for (int i = 0; i <= 30; i++) {
            alias.add("" + i);
            email.add(""+ i);
        }
//     добавляем одинаковые значения в алиас и емаил
        for (int i = 0; i < 10; i++) {
            alias.add("" + i);
            email.add("" + i);
        }
//      убираем повторяющиеся значения из алиас путем перемещения их в сет setOfAlias
        for (String a : alias) {
            setOfAlias.add(a);
        }
//     очищаю  alias
        alias.clear();
//      перекидываю обратно значения из алиасЛист в алиас
        for (String x : setOfAlias) {
            alias.add(x);
        }
//      перекидываю обратно значения из email в emailList
        for (String x : email) {
            emailList.add(x);
        }

        for (int k = 0; k <= 30; k++) {
            userKey.put(emailList.get(k), alias.get(k));
        }
    }

    public ArrayList<String> getAlias() {
        return alias;
    }

    public ArrayList<String> getEmailList() {
        return emailList;
    }

    public HashMap<String, String> getUserKey() {
        return userKey;
    }
}



