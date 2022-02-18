/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truonganh.mathutil.test;

//nếu muốn xài các hàm static, có 2 cách
//cách 1: gọi tên class.tên hàm static() truyền thống 100 năm nay
//        nhớ import package...tên class chưa hàm static
import com.truonganh.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
//cách 2: k thèm gọi tên class chấm, gọi tên hàm 1 mình, giống C
//        nhớ import static package...tên class.tên hàm static
//        nhưng chỉ dành cho static

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    
    //Test case #1: getF() with valid argument
    //n = 0, expected = 1; actual: đoán xem!
    @Test //@Test biến 1 hàm trong 1 class bất kì thành main()
    public void testFactorialGivenValidArgumentReturnsWell() {
        long expected = 1; // hy vọng hàm trả về 1 nếu tính 0!
        long actual = MathUtil.getFactorial(0);
        
        assertEquals(expected, actual);
        //tương đương trong main() kiểu cũ, ta in ra kết quả expected và actual
        //mắt tự nhìn để coi 2 thằng giống nhau hay không
        //bên JUnit, tung 2 màu sắc: XANH: 2 thằng khớp nhau
        //                           ĐỎ  : 2 thằng không khớp nhau
    }
    //Test case #2: getF() with valid argument
    //n = 6, expected = 720; actual: đoán xem!
    @Test 
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        long expected = 720; // hy vọng hàm trả về 1 nếu tính 0!
        long actual = MathUtil.getFactorial(6);
        
        assertEquals(expected, actual);
        
    }
    
    //Ngoại lệ thì làm sao để test
    //Nhớ là: Ngoại lệ không phải là 1 value
    //Ngoại lệ là 1 tình huống, thứ gì đó bất thường, có khả năng xuất/xảy ra
    //KO LÀ VALUE ĐỂ SO SÁNH KIỂU assertEquals()
    //ngoại lệ k dùng hàm assertEquals()
    //chỉ đo lường = cách coi có xuất hiện hay k?    
    
    //Test case #3: getF() with valid argument
    //n = -5, expected = ngoại lệ phải xuất hiện!!!
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException() {
        MathUtil.getFactorial(-5);
      
    }
    
}
