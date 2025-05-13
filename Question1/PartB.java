    public int dogWalkShift(int startHour, int endHour) {
        int earnings = 0;

        for (int i = startHour; i <= endHour; i++) {
            int walked = walkDogs(i);
            boolean bonus = (walked == maxDogs) || 9 <= i <= 17;

            earnings += walked * 5;
            if (bonus) {
                earnings += 3
            }
        }
    }
