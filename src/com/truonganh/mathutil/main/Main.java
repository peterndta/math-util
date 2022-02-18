/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truonganh.mathutil.main;

import com.truonganh.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        //ta kiểm thử bằng cách gọi hàm, với data đưa vào, chạy, và
        //nhìn kết quả của hàm trả về (ACTUAL) so sánh với cái ta
        //hy vọng nó sẽ trả về (EXPECTED)
        //ví dụ 5! thì tat hy vọng nhận về expected = 120
        //          thực tế hàm getFI(5) trả về mấy actual = ?
        //cuối cùng: so sánh EXPECTED vs ACTUAL
        
        //để đảm bảo hàm đúng, ta phải chia các trường hợp/nghĩ ra
        //các tình huống hàm sẽ dc xài, tức là nghĩ ra các bộ data
        //đưa cho hàm, hàm chạy, output, kết luận
        //MỖI BỘ DATA ĐƯA VÀO, MỖI DATA CỤ THỂ ĐỂ TEST HÀM CHO 1 MỤC
        //ĐÍCH NÀO ĐÓ, TA GỌI LÀ TEST CASE - TÌNH HUỐNG TEST
        //n = 5, gọi hàm getF() -> test case
        //n = -5, gọi hàm getF() -> test case
        
        //Test case #1: check getF() with valid argument
        //n = 0, expected = 1; actual: đoán xem!
        long expected = 1; //em hy vọng
        long actual = MathUtil.getFactorial(0); //đoán xem
        //compare
        System.out.println("0! -> expected: " + expected
                                 + " actual: " + actual);
        
        //Test case #2: check getF() with valid argument
        //n = 6, expected = 720; actual: đoán xem!
        expected = 720; //em hy vọng
        actual = MathUtil.getFactorial(6); //đoán xem
        //compare
        System.out.println("6! -> expected: " + expected
                                 + " actual: " + actual);
        
        //Test case #3: check getF() with valid argument
        //n = -5, expected = ??? ném ra ngoại lệ!
        //expected = Exception sẽ phải xuất hiện, k là long
        MathUtil.getFactorial(-5); //đoán xem
        //nhìn = mắt để tìm ngoại lệ
       
    }
}
