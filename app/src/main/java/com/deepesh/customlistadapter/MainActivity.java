package com.deepesh.customlistadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    UserAdapter adapter;
    ArrayList<User> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userArrayList=new ArrayList<>();
        listView=findViewById(R.id.list_view);

        User u1=new User(R.drawable.ic_home_black_24dp,"Name1");
        User u2=new User(R.drawable.ic_home_black_24dp,"Name2");
        User u3=new User(R.drawable.ic_home_black_24dp,"Name3");
        User u4=new User(R.drawable.ic_home_black_24dp,"Name4");
        User u5=new User(R.drawable.ic_home_black_24dp,"Name5");
        User u6=new User(R.drawable.ic_home_black_24dp,"Name6");

        userArrayList.add(u1);
        userArrayList.add(u2);
        userArrayList.add(u3);
        userArrayList.add(u4);
        userArrayList.add(u5);
        userArrayList.add(u6);

        adapter=new UserAdapter(this,R.layout.list_item,userArrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        User user=userArrayList.get(position);
        Toast.makeText(this,user.getIcon()+"\n"+user.getName(),Toast.LENGTH_LONG).show();
    }
}
