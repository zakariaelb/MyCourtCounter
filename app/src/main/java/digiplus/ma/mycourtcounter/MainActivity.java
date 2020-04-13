package digiplus.ma.mycourtcounter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
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


    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

}
