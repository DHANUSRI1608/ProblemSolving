import java.util.*;
class gasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sGas = 0, sCost = 0, res = 0, t = 0;
        for (int i = 0; i < gas.length; i++) {
            sGas += gas[i];
            sCost += cost[i];
        }
        if (sGas < sCost) return -1;
        for (int i = 0; i < gas.length; i++) {
            t += gas[i] - cost[i];
            if (t < 0) {
                t = 0;
                res = i + 1;
            }
        }
        return res;
    }
}