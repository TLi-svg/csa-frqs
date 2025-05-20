    public int walkDogs(int hour) {
        int avail = company.numAvailableDogs(hour);

        if (maxDogs >= avail) {
            company.updateDogs(hour, avail);
            return avail;
        } else {
            company.updateDogs(hour, maxDogs);
            return maxDogs;
        }
    }
