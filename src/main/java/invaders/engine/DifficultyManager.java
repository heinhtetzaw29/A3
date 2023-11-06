package invaders.engine;

public class DifficultyManager {
    private static DifficultyManager instance;
    private DifficultyLevel currentDifficulty;

    private DifficultyManager() {
        currentDifficulty = DifficultyLevel.HARD; // Default difficulty
    }

    public static DifficultyManager getInstance() {
        if (instance == null) {
            instance = new DifficultyManager();
        }
        return instance;
    }

    public DifficultyLevel getCurrentDifficulty() {
        return currentDifficulty;
    }

    public void setCurrentDifficulty(DifficultyLevel difficulty) {
        this.currentDifficulty = difficulty;
    }
}

