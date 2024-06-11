package com.msb.hjy_backend.common.utils;
import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.export.template.ExcelExportOfTemplateUtil;
import com.msb.hjy_backend.common.core.exception.BaseException;
import com.msb.hjy_backend.community.domain.dto.User;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import java.nio.charset.StandardCharsets;


public class ExcelUtils {

    private static final Logger log = LoggerFactory.getLogger(ExcelUtils.class);
    /**
     * excel导出
     * @param list 数据列表
     * @param pojoClass pojo类型
     * @param filename
     * @param response
     * @param exportParams 导出的参数-标题，sheet名称，header,表格类型
     */
    public static void exportExcel(List<?> list, Class<?> pojoClass, String filename, HttpServletResponse response, ExportParams exportParams) {

        list.forEach(System.out::println);
        //数据添加到表格中
        //Workbook workbook = ExcelExportUtil.exportExcel(exportParams, User.class, getUsers());
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, pojoClass, list);
        System.out.println(workbook);

        // 下载
        downloadExcel(filename, response, workbook);
    }
    public static List<User> getUsers() {
        User user1 = new User("1", "张三", 30, new Date(), "1", Arrays.asList("篮球", "足球", "阅读"));
        User user2 = new User("2", "李四", 25, new Date(), "0", Arrays.asList("游泳", "音乐"));

        return Arrays.asList(user1, user2);
    }
    /**
     * 下载excel
     * @param filename
     * @param response
     * @param workbook
     */
    private static void downloadExcel(String filename, HttpServletResponse response, Workbook workbook)  {

        ServletOutputStream outputStream = null;
        try {
            response.setCharacterEncoding("UTF-8");
            //设置文件名 和 下载方式
            response.setHeader("content-disposition","attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
            outputStream = response.getOutputStream();
            workbook.write(outputStream);
        } catch (Exception e) {
            log.error("导出excel异常{}",e.getMessage());
            throw new BaseException("500","导出excel失败，清联系网站管理员");
        }finally {
            try {
                outputStream.close();
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
