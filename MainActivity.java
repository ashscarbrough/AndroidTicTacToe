package scarbrough.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private int totalStepsFinished = 0;   // Counts number of steps taken in game
    private TextView messageBar;
    Button aB1;
    Button aB2;
    Button aB3;
    Button aB4;
    Button aB5;
    Button aB6;
    Button aB7;
    Button aB8;
    Button aB9;
    Button resetB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageBar = (TextView) findViewById(R.id.messageBarTextView);  //Return value for calculation
        aB1 = (Button) findViewById(R.id.button1);
        aB2 = (Button) findViewById(R.id.button2);
        aB3 = (Button) findViewById(R.id.button3);
        aB4 = (Button) findViewById(R.id.button4);
        aB5 = (Button) findViewById(R.id.button5);
        aB6 = (Button) findViewById(R.id.button6);
        aB7 = (Button) findViewById(R.id.button7);
        aB8 = (Button) findViewById(R.id.button8);
        aB9 = (Button) findViewById(R.id.button9);
        resetB = (Button) findViewById(R.id.resetButton);
    }

    public void aB1OnClick(View v) {
        getsTheSquare (aB1);
        aB1.setEnabled(false);
        checkWhoWins();
    }

    public void aB2OnClick(View v) {
        getsTheSquare (aB2);
        aB2.setEnabled(false);
        checkWhoWins();
    }

    public void aB3OnClick(View v) {
        getsTheSquare (aB3);
        aB3.setEnabled(false);
        checkWhoWins();
    }

    public void aB4OnClick(View v) {
        getsTheSquare (aB4);
        aB4.setEnabled(false);
        checkWhoWins();
    }

    public void aB5OnClick(View v) {
        getsTheSquare (aB5);
        aB5.setEnabled(false);
        checkWhoWins();
    }

    public void aB6OnClick(View v) {
        getsTheSquare (aB6);
        aB6.setEnabled(false);
        checkWhoWins();
    }

    public void aB7OnClick(View v) {
        getsTheSquare (aB7);
        aB7.setEnabled(false);
        checkWhoWins();
    }

    public void aB8OnClick(View v) {
        getsTheSquare (aB8);
        aB8.setEnabled(false);
        checkWhoWins();
    }

    public void aB9OnClick(View v) {
        getsTheSquare (aB9);
        aB9.setEnabled(false);
        checkWhoWins();
    }

    public void resetBOnClick(View v) {
        totalStepsFinished = 0;
        aB1.setText("");   // Set all button values back to empty
        aB2.setText("");
        aB3.setText("");
        aB4.setText("");
        aB5.setText("");
        aB6.setText("");
        aB7.setText("");
        aB8.setText("");
        aB9.setText("");
        aB1.setEnabled(true);  // re-enable all buttons
        aB2.setEnabled(true);
        aB3.setEnabled(true);
        aB4.setEnabled(true);
        aB5.setEnabled(true);
        aB6.setEnabled(true);
        aB7.setEnabled(true);
        aB8.setEnabled(true);
        aB9.setEnabled(true);
        messageBar.setText("Please make a move (O)");
    }

    // Based on the number of steps completed, returns String "O" or "X"
    // indicating whose turn it is.
    public String whoseTurn(int x)
    {
        if ((totalStepsFinished % 2) == 0) // If turn is even, O's turn
            return "O";
        else                        // If odd, X's turn
            return "X";
    } //whoseTurn


    // Method determines if it is O's or X's turn, marking the chosen button
    // with the appropriate Letter accordingly
    // Method takes "selected action button" as its parameter
    public void getsTheSquare(Button B)
    {
        String mark = whoseTurn(totalStepsFinished);
        B.setText(mark);
    } //getsTheSquare


    // Method checks if anybody is a winner by checking all winning combinations.
    // if three-in-a-row is found for any combination (vertical/horizontal/diagonal)
    // game is won, if no winners emerge it is a tie, otherwise it is next player's turn
    private void checkWhoWins()
    {
        messageBar = (TextView) findViewById(R.id.messageBarTextView);  //Return value for calculation

        // If O wins any combination of winning arrangements
        if ((aB1.getText() == "O" && aB2.getText() == "O" && aB3.getText()== "O")
                || (aB4.getText() == "O" && aB5.getText() == "O" && aB6.getText() == "O")
                || (aB7.getText() == "O" && aB8.getText() == "O" && aB9.getText() == "O")
                || (aB1.getText() == "O" && aB4.getText() == "O" && aB7.getText() == "O")
                || (aB2.getText() == "O" && aB5.getText() == "O" && aB8.getText() == "O")
                || (aB3.getText() == "O" && aB6.getText() == "O" && aB9.getText() == "O")
                || (aB1.getText() == "O" && aB5.getText() == "O" && aB9.getText() == "O")
                || (aB3.getText() == "O" && aB5.getText() == "O" && aB7.getText() == "O"))
        {  // Message "O" wins is displayed, and game grid disabled for play
            messageBar.setText("O wins the game!");
            aB1.setEnabled(false);
            aB2.setEnabled(false);
            aB3.setEnabled(false);
            aB4.setEnabled(false);
            aB5.setEnabled(false);
            aB6.setEnabled(false);
            aB7.setEnabled(false);
            aB8.setEnabled(false);
            aB9.setEnabled(false);
        }  // If X wins any combination of winning arrangements
        else if ((aB1.getText() == "X" && aB2.getText() == "X" && aB3.getText()== "X")
                || (aB4.getText() == "X" && aB5.getText() == "X" && aB6.getText() == "X")
                || (aB7.getText() == "X" && aB8.getText() == "X" && aB9.getText() == "X")
                || (aB1.getText() == "X" && aB4.getText() == "X" && aB7.getText() == "X")
                || (aB2.getText() == "X" && aB5.getText() == "X" && aB8.getText() == "X")
                || (aB3.getText() == "X" && aB6.getText() == "X" && aB9.getText() == "X")
                || (aB1.getText() == "X" && aB5.getText() == "X" && aB9.getText() == "X")
                || (aB3.getText() == "X" && aB5.getText() == "X" && aB7.getText() == "X"))
        {  // Message "X" wins is displayed, and game grid disabled for play
            messageBar.setText("X wins the game!");
            aB1.setEnabled(false);
            aB2.setEnabled(false);
            aB3.setEnabled(false);
            aB4.setEnabled(false);
            aB5.setEnabled(false);
            aB6.setEnabled(false);
            aB7.setEnabled(false);
            aB8.setEnabled(false);
            aB9.setEnabled(false);
        }  // If there are no winners but no free spaces remain, display Tie message
        else if (aB1.getText() != "" && aB2.getText() != "" && aB3.getText()!= ""
                && aB4.getText() != "" && aB5.getText() != "" && aB6.getText() != ""
                && aB7.getText() != "" && aB8.getText() != "" && aB9.getText() != "")
            messageBar.setText("Tie Game!");
        else    // if no winner, and not a tie, it is the next player's turn
        {
            totalStepsFinished++;
            messageBar.setText("Please make a move ("
                    + whoseTurn(totalStepsFinished) + ")");
        }
    }
}

