package com.msb.hjy_backend.common;



import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.msb.hjy_backend.common.utils.ExcelUtils;
import com.msb.hjy_backend.community.domain.dto.HjyCommunityExcelDto;
import com.msb.hjy_backend.community.domain.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class ExportExcelTest {

    public List<User> getUser(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setUserId(String.valueOf(i));
            user.setUserName("文");
            user.setAge(16+i);
            user.setBrithDate(new Date());
            user.setStatus(String.valueOf(i%2));
            user.setHobby(Arrays.asList("抽烟","喝酒"));
            list.add(user);
        }
        return list;
    }

    @Test
    public void testSimpleExportExcel() throws Exception{
        Workbook sheets = ExcelExportUtil.exportExcel(new ExportParams("用户列表", "测试"), User.class, getUser());

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\downloads\\users.xls");
        sheets.write(fileOutputStream);
        fileOutputStream.close();
        sheets.close();
    }

    @Test
    public void testCommonExportExcel() throws IOException {
        System.out.println("shit");

    }
}
