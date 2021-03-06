package com.heartgo.controller;

import com.heartgo.respository.InvokeChainCode;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value="/blockchain/product/*")
public class ProductController {
    //获取产品信息
    @RequestMapping(value = "getProduct", method = RequestMethod.POST)
    public @ResponseBody
    String getProduct(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("body:" + body);
        JSONObject requestcontent = JSONObject.fromObject(body);
        System.out.println("requestcontent:" + requestcontent);
        String id = requestcontent.getString("id");

        String[] args = new String[]{"getProduct", id};


        String result = null;
        try {
            InvokeChainCode invoke = new InvokeChainCode(args);
            result = invoke.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
    //修改产品信息
    @RequestMapping(value = "writeProduct", method = RequestMethod.POST)
    public @ResponseBody String writeProduct(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("body:" + body);
        JSONObject requestcontent = JSONObject.fromObject(body);
        System.out.println("requestcontent:" + requestcontent);
        String ID = requestcontent.getString("ID");
        String ProductName = requestcontent.getString("ProductName");
        String ProductType = requestcontent.getString("ProductType”");
        String OrganizationID = requestcontent.getString("OrganizationID");
        String Portion = requestcontent.getString("Portion");


        String[] args = new String[]{"writeProduct", ID,ProductName,ProductType,OrganizationID,Portion};


        String result = null;
        try {
            InvokeChainCode invoke = new InvokeChainCode(args);
            result = invoke.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
    //创建产品
    @RequestMapping(value = "CreateProduct", method = RequestMethod.POST)
    public @ResponseBody String CreateProduct(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("body:" + body);
//        JSONObject requestcontent = JSONObject.fromObject(body);
//        System.out.println("requestcontent:" + requestcontent);
//        String ID = requestcontent.getString("ID");
//        String ProductName = requestcontent.getString("ProductName");
//        String ProductType = requestcontent.getString("ProductType");
//        String OrganizationID = requestcontent.getString("OrganizationID");
//        String Portion = requestcontent.getString("Portion");
//         ;
//        String Price = requestcontent.getString("Price");
        String[] args = new String[]{"CreateProduct",body};


        String result = null;
        try {
            InvokeChainCode invoke = new InvokeChainCode(args);
            result = invoke.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
    //通过产品ID来查询产品交易信息
    @RequestMapping(value = "getProductTransactionByProductID", method = RequestMethod.POST)
    public @ResponseBody String getProductTransactionByProductID(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("body:" + body);
        JSONObject requestcontent = JSONObject.fromObject(body);
        System.out.println("requestcontent:" + requestcontent);
        String productid = requestcontent.getString("productid");

        ;

        String[] args = new String[]{"getProductTransactionByProductID", productid};


        String result = null;
        try {
            InvokeChainCode invoke = new InvokeChainCode(args);
            result = invoke.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
    //获取产品的卖出信息
    @RequestMapping(value = "getProductSaleInformation", method = RequestMethod.POST)
    public @ResponseBody String getProductSaleInformation(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("body:" + body);
        JSONObject requestcontent = JSONObject.fromObject(body);
        System.out.println("requestcontent:" + requestcontent);
        String productid = requestcontent.getString("productid");

        ;

        String[] args = new String[]{"getProductSaleInformation", productid};


        String result = null;
        try {
            InvokeChainCode invoke = new InvokeChainCode(args);
            result = invoke.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
    //获取所有购买当前产品的用户
    @RequestMapping(value = "getProductAllUser", method = RequestMethod.POST)
    public @ResponseBody String getProductAllUser(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("body:" + body);
        JSONObject requestcontent = JSONObject.fromObject(body);
        System.out.println("requestcontent:" + requestcontent);
        String productid = requestcontent.getString("productid");

        ;

        String[] args = new String[]{"getProductAllUser", productid};


        String result = null;
        try {
            InvokeChainCode invoke = new InvokeChainCode(args);
            result = invoke.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
    //获取产品的资产
    @RequestMapping(value = "getProductAsset", method = RequestMethod.POST)
    public @ResponseBody String getProductAsset(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("body:" + body);
        JSONObject requestcontent = JSONObject.fromObject(body);
        System.out.println("requestcontent:" + requestcontent);
        String productid = requestcontent.getString("productid");

        ;

        String[] args = new String[]{"getProductAsset", productid};


        String result = null;
        try {
            InvokeChainCode invoke = new InvokeChainCode(args);
            result = invoke.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

}
