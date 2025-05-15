    public ArrayList<Match> buildMatches() {
        ArrayList<Match> built = new ArrayList<Match>();

        if (competitorList.size() % 2 == 0) {
            for (int i = 0; i < competitorList.size() / 2; i++) {
                built.add(new Match(competitorList.get(i), competitorList.get(competitorList.size() - 1 - i)));
            }
        } else {
            for (int i = 1; i < (competitorList.size()) - 1 / 2; i++) {
                built.add(new Match(competitorList.get(i), competitorList.get(competitorList.size() - 1 - i)));
            }
        }

        return built;
    }
