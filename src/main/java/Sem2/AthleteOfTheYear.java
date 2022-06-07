public class AthleteOfTheYear {
    static interface Conference {
        public String getConference();
        public String getDivision();
    }
    static interface Gender {
        public String getGender();
    }
    static class Football implements Conference {
        int yardsThrown, yardsRushed, catchingYards, tot;
        String conference, division;
        public Football(int yardsThrown, int yardsRushed, int catchingYards, String conference) {
            this.yardsThrown = yardsThrown;
            this.yardsRushed = yardsRushed;
            this.catchingYards = catchingYards;
            this.conference = conference;
            tot += yardsThrown / 100;
            tot += yardsRushed / 10;
            tot += catchingYards / 10;
        }
        public int getScore() {
            return tot;
        }
        public String getConference() {
            return this.conference;
        }
        public String getDivision() {
            if (this.conference.equals("AFC")) {
                division = "West";
            } else {
                division = "East";
            }
            return division;
        }
    }
    static class Basketball implements Gender {
        int fieldGoalsAttempted, fieldGoalsMade, pointsScored, assistsMade, tot;
        String gender;
        public Basketball(int fieldGoalsAttempted, int fieldGoalsMade, int pointsScored, int assistsMade, String gender) {
            this.fieldGoalsAttempted = fieldGoalsAttempted;
            this.fieldGoalsMade = fieldGoalsMade;
            this.pointsScored = pointsScored;
            this.gender = gender;
            tot -= fieldGoalsAttempted / 10;
            tot += fieldGoalsMade / 10;
            tot += pointsScored;
            tot += assistsMade / 10;
        }
        public int getScore() {
            return tot;
        }
        public String getGender() {
            return this.gender;
        }
    }
    static class Boxing implements Gender {
        int punchesLanded, wins, losses, tot;
        String gender;
        public Boxing(int punchesLanded, int wins, int losses, String gender) {
            this.punchesLanded = punchesLanded;
            this.wins = wins;
            this.losses = losses;
            this.gender = gender;
            tot += wins;
            tot -= losses;
            tot += punchesLanded / 10;
        }
        public String getGender() {
            return this.gender;
        }
        public int getScore() {
            return tot;
        }
    }
    static class Golf {
        int drivingDistance, scoringAverage, drivingAccuaryPercentage, tot;
        public Golf(int drivingDistance, int scoringAverage, int drivingAccuaryPercentage) {
            this.drivingDistance = drivingDistance;
            this.scoringAverage = scoringAverage;
            this.drivingAccuaryPercentage = drivingAccuaryPercentage;
            tot += drivingDistance / 100;
            tot += scoringAverage;
            tot += drivingAccuaryPercentage / 10;
        }
    }
    public static void main(String[] args) {
        // take in the input and create an object for the respective sport. Then call the method getScore() on the object to recieve the total score
        // You can then compare each of the total scores to determine the athlete of the year.
    }
}
