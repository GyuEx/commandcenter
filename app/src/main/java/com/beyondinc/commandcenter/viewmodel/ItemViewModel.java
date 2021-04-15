package com.beyondinc.commandcenter.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.beyondinc.commandcenter.data.Orderdata;
import com.beyondinc.commandcenter.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ItemViewModel extends ViewModel {

    public List<Orderdata> items;
    private RecyclerAdapter adapter;

    public ItemViewModel() {

        Log.e("Memo","Memo call");
        if (items == null) {
            items = new ArrayList<>();
        }
        if (adapter == null) {
            adapter = new RecyclerAdapter(this);
        }
        insertLogic();

    }

    public void insertLogic() {
        for (int i = 0; i < 30; i++) {
            Orderdata memo = new Orderdata();
            memo.setId(i);
            memo.setUsetime("포장완료");
            memo.setResttime(i+" 초");
            memo.setPay("카드");
            memo.setTitle("면곡당 " + i + "호점");
            memo.setAdress("장안동 " + i + "번지");
            memo.setPoi(i + "편한세상");
            memo.setRider(i+" km");
            memo.setWork("완료");
            memo.setPaywon(i + " 원");
            memo.setDelay(i);
            items.add(memo);
        }
        Log.e("insert", "data inserting");
        adapter.notifyDataSetChanged();
    }

    public void ListClick(int pos) {
        Log.e("ListClick", pos + " 번째 입니다. // " + items.get(pos).getTitle());
    }

    public void onCreate() {
        adapter.notifyDataSetChanged();
    }

    public void onResume() {

    }

    public RecyclerAdapter getAdapter() {
        return adapter;
    }
    public List<Orderdata> getItems() {
        return items;
    }
    public String getUsetime(int pos) {return items.get(pos).getUsetime();}
    public String getResttime(int pos) {return items.get(pos).getResttime();}
    public String getPay(int pos) {return items.get(pos).getPay();}
    public String getTitle(int pos) {return items.get(pos).getTitle();}
    public String getAdress(int pos) {return items.get(pos).getAdress();}
    public String getPoi(int pos) {return items.get(pos).getPoi();}
    public String getRider(int pos) {return items.get(pos).getRider();}
    public String getWork(int pos) {return items.get(pos).getWork();}
    public String getPaywon(int pos) {return items.get(pos).getPaywon();}
}