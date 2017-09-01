package com.shrbank.implement;

/**
 * Created by lilei on 2017/7/3.
 */
public class Implements {

    public interface Sports {
        public void setHomeTeam(String name);
        public void setVisitingTeam(String name);
    }

    public interface Football extends Sports {
        public void homeTeamScored(int points);
        public void visitingTeamScored(int points);
        public void endOfQuarter(int quarter);
    }

    public interface Hockey extends Sports {
        public void homeGoalScored();
        public void visitingGoalScored();
        public void endOfPeriod(int period);
        public void overtimePeriod(int ot);
    }


}
