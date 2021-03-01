package com.atguigu.demo.excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestEasyexcel {
    public static void main(String[] args) {
        String filename="H:\\write.xlsx";

        EasyExcel.read(filename,DemoData.class,new ExcelListener()).sheet().doRead();
    }
    private static List<DemoData> getData(){
        ArrayList<DemoData> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            DemoData data=new DemoData();
            data.setSno(i);
            data.setSname("hwm"+i);
            list.add(data);
        }
        return list;
    }
}


