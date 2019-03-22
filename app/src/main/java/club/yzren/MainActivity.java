package club.yzren;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Linear_;
    private Button Constraint_;
    private  Button Table_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用findViewById()初始化控件Button
        Linear_=(Button) findViewById(R.id.Linear_Layout);
        Constraint_=(Button) findViewById(R.id.Constraint_Layout);
        Table_=(Button) findViewById(R.id.Table_Layout);
        //对控件进行点击事件的监听
        Linear_ .setOnClickListener(this);
        Constraint_.setOnClickListener(this);
        Table_.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.Linear_Layout:
                Intent intent=new Intent(this,LinearLayout.class);
                startActivity(intent);
                break;
            case R.id.Constraint_Layout:
                Intent intent2=new Intent(this,ConstraintLayout.class);
                startActivity(intent2);
                break;
            case R.id.Table_Layout:
                Intent intent3=new Intent(this,TableLayout.class);
                startActivity(intent3);
                break;
        }

    }
}
