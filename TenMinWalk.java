public class TenMinWalk {
      public static boolean isValid(char[] walk) {
        boolean isTrue = false;
        int xVal = 0;
        int yVal = 0;
        int totalWalks = 0;
        
      for (int i = 0; i < walk.length; i++) {
        if (walk[i] == ('n')) {
          yVal++;
          totalWalks++;
          }
        if (walk[i] == ('s')) {
          yVal--;
          totalWalks++;
          }
        if (walk[i] == ('e')) {
          xVal++;
          totalWalks++;
          }
        if (walk[i] == ('w')) {
          xVal--;
          totalWalks++;
          }
        }
      if (totalWalks == 10 && xVal == 0 && yVal == 0) {
        isTrue = true;
      }
      
        return isTrue;
    }
}