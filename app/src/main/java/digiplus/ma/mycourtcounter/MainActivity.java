package digiplus.ma.mycourtcounter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void addThreeForTeamA(View view) {
        ScoreTeamA = ScoreTeamA + 3;
        displayForTeamA(ScoreTeamA);
    }
    public void addTwoForTeamA(View view) {
            ScoreTeamA = ScoreTeamA + 2;
            displayForTeamA(ScoreTeamA);
    }
    public void addOneForTeamA(View view) {
        ScoreTeamA = ScoreTeamA + 1;
        displayForTeamA(ScoreTeamA);
    }
    public void addThreeForTeamB(View view) {
        ScoreTeamB = ScoreTeamB + 3;
        displayForTeamB(ScoreTeamB);
    }
    public void addTwoForTeamB(View view) {
        ScoreTeamB = ScoreTeamB + 2;
        displayForTeamB(ScoreTeamB);
    }
    public void addOneForTeamB(View view) {
        ScoreTeamB = ScoreTeamB+ 1;
        displayForTeamB(ScoreTeamB);
    }
    public void ResetScore(View view){
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
    }

    private void displayForTeamA(int score) {
        TextView a_scoreView = (TextView) findViewById(R.id.team_a_score);
        a_scoreView.setText(String.valueOf(score));
    }
    private void displayForTeamB(int score) {
        TextView b_scoreView = (TextView) findViewById(R.id.team_b_score);
        b_scoreView.setText(String.valueOf(score));
    }
}
