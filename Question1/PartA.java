    public int walkDogs(int hour) {
        int avail = company.numAvailableDogs();

        if (maxDogs > avail) {
            updateDogs(hour, avail);
            return avail;
        } else {
            updateDogs(hour, maxDogs);
            return maxDogs;
        }
    }
