package invaders.engine;

public class DifficultyManager {
    private static DifficultyManager instance;
    private DifficultyLevel currentDifficulty;

    // Listener interface for difficulty changes
    public interface DifficultyChangeListener {
        void onDifficultyChanged(DifficultyLevel newDifficulty);
    }

    // The listener reference
    private DifficultyChangeListener difficultyChangeListener;

    // Method to set the difficulty change listener
    public void setDifficultyChangeListener(DifficultyChangeListener listener) {
        this.difficultyChangeListener = listener;
    }

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
        if (difficultyChangeListener != null) {
            difficultyChangeListener.onDifficultyChanged(difficulty);
        }
    }
}

