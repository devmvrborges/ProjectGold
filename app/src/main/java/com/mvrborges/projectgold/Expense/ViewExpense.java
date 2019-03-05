package com.mvrborges.projectgold.Expense;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.mvrborges.projectgold.R;

public class ViewExpense extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.expense_title_view));
        setContentView(R.layout.activity_view_expense);
    }
}
