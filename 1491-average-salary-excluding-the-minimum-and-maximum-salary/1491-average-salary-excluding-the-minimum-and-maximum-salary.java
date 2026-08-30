class Solution {
    public double average(int[] salary) {
        double maxx = Integer.MIN_VALUE;
        double minn = Integer.MAX_VALUE;
        double ans = 0;
        double gg = 0;
        int n = salary.length;
        for(int i = 0; i < n;i++)
        {
            maxx = Math.max(maxx,salary[i]);
            minn = Math.min(minn,salary[i]);
            ans += salary[i];
        }

        gg = (ans-maxx-minn)/(n-2);
        return gg;
    }
}