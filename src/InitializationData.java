import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class InitializationData {
    static ArrayList<String> alias = new ArrayList<>();
    static HashSet<String> email = new HashSet<>();
    static HashMap<String, String> keyForUser = new HashMap<>();

    public static void test() {

//      Псевдонимы пользователей
        alias.add("Alpha");
        alias.add("Beta");
        alias.add("Brave");
        alias.add("Chieftain");
        alias.add("Clearheaded");
        alias.add("Commando");
        alias.add("Cowboy");
        alias.add("Detector");
        alias.add("Dilemma Fixer");
        alias.add("Dragon");
        alias.add("Flame Host");
        alias.add("Gutsy Heart");
        alias.add("Help Bringer");
        alias.add("Hawk");
        alias.add("Killer");
        alias.add("Lucky Guy");
        alias.add("Mountain Man");
        alias.add("Phantom");
        alias.add("Pugilist");
        alias.add("Rockstar");
        alias.add("Romeo");
        alias.add("Secret");
        alias.add("Shooter");
        alias.add("Banshee");
        alias.add("Crystal");
        alias.add("Chewbacca");
        alias.add("Rocket Man");
        alias.add("Tiger Toes");
        alias.add("Toxic Alien");
        alias.add("Sunshine");

//      Почты пользователей
        email.add("alpha@gmail.com");
        email.add("beta@gmail.com");
        email.add("brave@gmail.com");
        email.add("chieftain@gmail.com");
        email.add("clearheaded@gmail.com");
        email.add("commando@gmail.com");
        email.add("cowboy@gmail.com");
        email.add("detector@gmail.com");
        email.add("dilemmafixer@gmail.com");
        email.add("dragon@gmail.com");
        email.add("flamehost@gmail.com");
        email.add("gutsyheart@gmail.com");
        email.add("helpbringer@gmail.com");
        email.add("hawk@gmail.com");
        email.add("killer@gmail.com");
        email.add("luckygay@gmail.com");
        email.add("mountainman@gmail.com");
        email.add("phantom@gmail.com");
        email.add("pugilist@gmail.com");
        email.add("rockstar@gmail.com");
        email.add("romeo@gmail.com");
        email.add("secret@gmail.com");
        email.add("shooter@gmail.com");
        email.add("banshee@gmail.com");
        email.add("crystal@gmail.com");
        email.add("chewbacca@gmail.com");
        email.add("rocketman@gmail.com");
        email.add("tigertoes@gmail.com");
        email.add("toxicalien@gmail.com");
        email.add("sunshine@gmail.com");

//      Ключи пользователя
        keyForUser.put("alpha@gmail.com", "Alpha");
        keyForUser.put("beta@gmail.com", "Beta");
        keyForUser.put("brave@gmail.com", "Brave");
        keyForUser.put("chieftain@gmail.com", "Chieftain");
        keyForUser.put("clearheaded@gmail.com", "Clearheaded");
        keyForUser.put("commando@gmail.com", "Commando");
        keyForUser.put("cowboy@gmail.com", "Cowboy");
        keyForUser.put("detector@gmail.com", "Detector");
        keyForUser.put("dilemmafixer@gmail.com", "Dilemma Fixer");
        keyForUser.put("dragon@gmail.com", "Dragon");
        keyForUser.put("flamehost@gmail.com", "Flame Host");
        keyForUser.put("gutsyheart@gmail.com", "Gutsy heart");
        keyForUser.put("helpbringer@gmail.com", "Help Bringer");
        keyForUser.put("hawk@gmail.com", "Hawk");
        keyForUser.put("killer@gmail.com", "Killer");
        keyForUser.put("luckygay@gmail.com", "lucky gay");
        keyForUser.put("mountainman@gmail.com", "Mountain Man");
        keyForUser.put("phantom@gmail.com", "Phantom");
        keyForUser.put("pugilist@gmail.com", "Pugilist");
        keyForUser.put("rockstar@gmail.com", "Rockstar");
        keyForUser.put("romeo@gmail.com", "Romeo");
        keyForUser.put("secret@gmail.com", "Secret");
        keyForUser.put("shooter@gmail.com", "Shooter");
        keyForUser.put("banshee@gmail.com", "Banshee");
        keyForUser.put("crystal@gmail.com", "Crystal");
        keyForUser.put("chewbacca@gmail.com", "Chewbacca");
        keyForUser.put("rocketman@gmail.com", "Rocket Man");
        keyForUser.put("tigertoes@gmail.com", "Tiger Toes");
        keyForUser.put("toxicalien@gmail.com", "Toxic Alien");
        keyForUser.put("sunshine@gmail.com", "Sunshine");
    }

    private static Information valid(){
        if (alias.size() == email.size() && keyForUser.size() == alias.size() && keyForUser.size() == email.size()){
        }
        Information information = new Information();
        return information;
    }

    public static void main(String[] args) {
        test();
        valid();
    }
}

