package leetcode_cn;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmainAddress {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(answer1(emails));

    }

    private static int answer1(String[] emails) {//97ms
        Set set = new HashSet();
        for (int i = 0; i < emails.length; i++) {
            String[] a=emails[i].split("@");
            String l = a[0];
            l=l.replace(".","");
            l = l.substring(0,l.indexOf("+"));
            String y = a[1];
            String f=l+"@"+y;
            set.add(f);

        }
        return set.size();
    }

    private static int answer2(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String name = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            String newName = name.substring(0, name.indexOf("+")).replace(".","");
            set.add(newName + domain);
        }
        return set.size();
    }
}
