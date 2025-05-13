    public boolean clearPair(int r, int c) {
        for (int i = r; i < puzzle.length(); i++) {
            for (int j = 0; puzzle[0].length(); j++) {
                if(puzzle[r][c] + puzzle[i][j] == 10 || puzzle[r][c] == puzzle[i][j]) {
                    puzzle[r][c] = 0;
                    puzzle[i][j] = 0;
                    return true;
                }
            }
        }
        return false;
    }
