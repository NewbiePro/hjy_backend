package com.msb.hjy_backend;

import com.msb.hjy_backend.system.domain.SysMenu;
import com.msb.hjy_backend.system.domain.SysUser;
import com.msb.hjy_backend.system.mapper.SysMenuMapper;
import com.msb.hjy_backend.system.mapper.SysUserMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class HjyBackendApplicationTests {

    @Autowired
    SysUserMapper sysUserMapper;
    @Test
    void contextLoads() {
    }
    
    @Test
    public void testCreateJWT(){
        JwtBuilder jwtBuilder = Jwts.builder().setId("9527")
                .setSubject("HJY_COMMUNITY")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "mashibing");

        //压缩成string形式
        String jws = jwtBuilder.compact();
        System.out.println(jws);
    }

    @Test
    public void parseJWT(){
        String jws = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI5NTI3Iiwic3ViIjoiSEpZX0NPTU1VTklUWSIsImlhdCI6MTcxNzczNDM5N30.ws8iBSX_3z13Fot33fIfLUuJ63tlvqJzdDBFOjgauew";

        Claims claims = Jwts.parser().setSigningKey("mashibing")
                .parseClaimsJws(jws)
                .getBody();
        System.out.println(claims);
    }

    @Test
    public void testSelectUserByUserName(){
        SysUser sysUser = sysUserMapper.selectUserByUserName("admin");
        System.out.println(sysUser);
    }

    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Test
    public void testSelectMenuTreeAll(){
        List<SysMenu> menuList  = sysMenuMapper.selectMenuTreeAll();
        System.out.println(menuList);
    }


}
