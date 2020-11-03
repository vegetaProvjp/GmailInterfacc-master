package com.example.gmailinterface;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ListViewAdapter extends BaseAdapter {
    //Dữ liệu liên kết bởi Adapter là một mảng các sản phẩm
    final ArrayList<ProductModel> listProduct;
    int[] color=new int[]{Color.parseColor("#ff3838"),Color.parseColor("#ff9f1a"),Color.parseColor("#18dcff"),
            Color.parseColor("#7d5fff"),Color.parseColor("#32ff7e"),Color.parseColor("#7158e2")
            ,Color.parseColor("#3ae374"),Color.parseColor("#44bd32"),Color.parseColor("#192a56")};;
    ListViewAdapter(ArrayList<ProductModel> listProduct) {
        this.listProduct = listProduct;

    }


    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int position) {

        return listProduct.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //convertView là View của phần tử ListView, nếu convertView != null nghĩa là
        //View này được sử dụng lại, chỉ việc cập nhật nội dung mới
        //Nếu null cần tạo mới

        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.activity_adapter, null);
        } else viewProduct = convertView;

        //Bind dữ liệu phần tử vào View
        ProductModel product = (ProductModel) getItem(position);
        ((TextView) viewProduct.findViewById(R.id.name)).setText(String.format("%s", product.t_name));
        ((TextView) viewProduct.findViewById(R.id.subject)).setText(String.format("%s", product.t_subject));
        ((TextView) viewProduct.findViewById(R.id.content)).setText(String.format("%s", product.t_content));
        ((TextView) viewProduct.findViewById(R.id.time)).setText(String.format("%s", product.t_time));
        ((TextView) viewProduct.findViewById(R.id.icon)).setText(String.format("%s", product.t_icon));
        final ProductModel productModel=listProduct.get(position);
        TextView tv = viewProduct.findViewById(R.id.icon);
        if(productModel.getColor()==-1) {
            int c=color[new Random().nextInt(color.length)];
            tv.setBackgroundResource(color[c]);
        }
        return viewProduct;
    }
}
