package com.example.demo;

import java.io.*;

public class FindStr {
    public static void main(String[] args) throws IOException {
        //String keyword="主账套";
       // String targetFile="C:/temp/test.txt";
       // Findstr( keyword, targetFile);
        Findstr("ID","C:/temp/test.txt");
        Findstr("业务实体","C:/temp/test.txt");
        Findstr("主账套","C:/temp/test.txt");
        Findstr("会计期","C:/temp/test.txt");
        Findstr("合同币种","C:/temp/test.txt");
        Findstr("ERP资产编号","C:/temp/test.txt");
        Findstr("租赁物件编号","C:/temp/test.txt");
        Findstr("订单号","C:/temp/test.txt");
        Findstr("原订单号","C:/temp/test.txt");
        Findstr("订单行序号","C:/temp/test.txt");
        Findstr("原订单行序号","C:/temp/test.txt");
        Findstr("租赁开始日期","C:/temp/test.txt");
        Findstr("租赁结束日期","C:/temp/test.txt");
        Findstr("供应商名称","C:/temp/test.txt");
        Findstr("供应商是否为关联方","C:/temp/test.txt");
        Findstr("合同编号","C:/temp/test.txt");
        Findstr("事务处理类型","C:/temp/test.txt");
        Findstr("采购内容或物料说明","C:/temp/test.txt");
        Findstr("变更具体原因","C:/temp/test.txt");
        Findstr("备注","C:/temp/test.txt");
        Findstr("版本","C:/temp/test.txt");
        Findstr("支付金额","C:/temp/test.txt");
        Findstr("本金","C:/temp/test.txt");
        Findstr("利息","C:/temp/test.txt");
        Findstr("是否已重分类","C:/temp/test.txt");
        Findstr("需冲回金额","C:/temp/test.txt");
        Findstr("重分类批次","C:/temp/test.txt");
        Findstr("期初金额","C:/temp/test.txt");
        Findstr("期末金额","C:/temp/test.txt");
        Findstr("租赁负债（1年及以内）","C:/temp/test.txt");
        Findstr("本金（1年及以内）","C:/temp/test.txt");
        Findstr("利息（1年及以内）","C:/temp/test.txt");
        Findstr("租赁负债(1年以上，2年及以内）","C:/temp/test.txt");
        Findstr("本金（1年以上，2年及以内）","C:/temp/test.txt");
        Findstr("利息（1年以上，2年及以内）","C:/temp/test.txt");
        Findstr("租赁负债(2年以上，5年及以内）","C:/temp/test.txt");
        Findstr("本金（2年以上，5年及以内）","C:/temp/test.txt");
        Findstr("利息（2年以上，5年及以内）","C:/temp/test.txt");
        Findstr("租赁负债(5年以上）","C:/temp/test.txt");
        Findstr("本金（5年以上）","C:/temp/test.txt");
        Findstr("利息（5年以上）","C:/temp/test.txt");
        Findstr("租赁负债-中转余额（计划已付实际未付的负债）","C:/temp/test.txt");
        Findstr("短期负债（1年内计划支付负债金额与计划已付实际未付的金额）","C:/temp/test.txt");
        Findstr("结算期剩余期间数","C:/temp/test.txt");
        Findstr("组织ID","C:/temp/test.txt");
        Findstr("创建者","C:/temp/test.txt");
        Findstr("创建时间","C:/temp/test.txt");
        Findstr("最近修改者","C:/temp/test.txt");
        Findstr("上一次修改时间","C:/temp/test.txt");
        Findstr("启用标记","C:/temp/test.txt");
        Findstr("删除标记","C:/temp/test.txt");
        Findstr("公司主体本位币 ","C:/temp/test.txt");


    }

    private static void Findstr(String keyword, String targetFile) throws IOException {
        String tempString = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(targetFile), "GBK"));
        while ((tempString = reader.readLine()) != null) {
            if(tempString.contains(keyword)){
                System.out.println(tempString);
            }
        }
        reader.close();
    }


}
