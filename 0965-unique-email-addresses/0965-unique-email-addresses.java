class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();
        for(String mail: emails){
            String[] p = mail.split("@");
            String[] l = p[0].split("\\+");
            s.add(l[0].replace(".","")+"@"+p[1]);
        }
        return s.size();
    }
}