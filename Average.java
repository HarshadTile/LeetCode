import java.util.*;

class Average {
    public double average(int[] salary) {
        Arrays.sort(salary);  
        int storage = 0;
        int count = 0;

        for (int i = 1; i < salary.length - 1; i++) {  
            storage += salary[i];
            count++;
        }

        double ans = (double) storage / count;  
        return ans;
    }
}
