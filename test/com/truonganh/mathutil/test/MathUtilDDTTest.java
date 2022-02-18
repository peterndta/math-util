package com.truonganh.mathutil.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.truonganh.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */

@RunWith(value = Parameterized.class) //báo cho máy ảo java chuẩn bị dùng class theo phong cách thông số
public class MathUtilDDTTest {
    
    // ta cần test thử hàm getFactorial() bên code chính
    // phải đưa data cho hàm, xem trả về gì
    // so sánh kết luận hàm đúng sai
    // 2 việc: chuẩn bị data, đưa data vào hàm (gọi hàm)
    //                      kết luận đúng sai
    // done ở bêm MathUtilTest rồi, NHƯNG
    
    // 0!, 0 -> 1
    // 1!, 1 -> 1
    // 2!, 2 -> 2   bộ dữ liệu test, test data
    // 3!, 3 -> 6    lưu table SQLServer, Excel, .CSV
    // 5!, 5 -> 120  lưu trong 1 mảng trong code cũng được
    // mảng 2 chiều [6][2]
    
    // học cách viết code tách đám data ra khỏi các câu lệnh
    // getF(), k mixed. Tất cả các framwork UnitTest của mọi Ngôn ngữ lập trình
    // đều làm dc điều này!!!
    
    // hàm trả về mảng 2 chiều kiểu Object
    // vì các framwork chơi với object, mảng số nguyên
    // phải hiểu là object, tức là chơi với Wrapper Class nếu
    // mảng số...
    // Wrapper class: Integer (int), Character (char), Long (long)
    
    //báo JVM JUnit đây là data nguồn!! dùng nhồi vào assert()
    @Parameterized.Parameters
    public static Object[][] initData(){
        int a[] = {2,4,6,8};
        
        return new Integer[][]{                           
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {6, 720}
                                
        };
    }
    
    //cần trích mảng con ra để dc cặp value input/expected
    @Parameterized.Parameter(value = 0) //map cột 0
    public int input;
    
    
    @Parameterized.Parameter(value = 1) //map cột 1
    public int expected;
    
    @Test 
    public void testFactorialGivenValidArgumentReturnsWell() {    
        long actual = MathUtil.getFactorial(input);      
        assertEquals(expected, actual);       
    }
}

//DDT tách data cần test ra 1 chỗ. Sau đó lấy từng data
//mồi/nhồi/map vào trong chỗ gọi hàm, chỗ assert()
//tách và nhồi vào -> làm hoại như vậy cho các bộ data
//phải thông qua tên biến/tham số
//DDT còn gọi tên là: THAM SỐ HÓA TEST DATA PARAMETERIZED