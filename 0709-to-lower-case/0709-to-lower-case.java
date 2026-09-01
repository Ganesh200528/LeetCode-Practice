class Solution {
    public String toLowerCase(String s) {
        StringBuilder ff = new StringBuilder();

for (char jj : s.toCharArray()) {
    if (jj >= 'A' && jj <= 'Z') {
        jj += 32;
    }

    ff.append(jj);
}

return ff.toString();
    }
}