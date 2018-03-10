package exam.sn.com.exam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by John on 2018/3/9.
 */
public class ExamActivity extends AppCompatActivity{
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        DBService dbService=new DBService();
        List<Question> list=dbService.getQuestion();

        TextView tv_question=(TextView) findViewById(R.id.question);
        RadioButton[] radioButtons=new RadioButton[4];
        radioButtons[0]=(RadioButton) findViewById(R.id.answerA);

    }
}
