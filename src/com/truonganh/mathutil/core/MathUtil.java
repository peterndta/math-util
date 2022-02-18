/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truonganh.mathutil.core;

/**
 *
 * @author Admin
 */
//Class này cung cấp các tiện ích/1 loạt các hàm toán học 
// giúp cho các class khác sử dụng..., ví dụ app calculator cần
//rất nhiều hàm toán học
//cái gì mà là tiện ích dùng chung, nên dc design là STATIC
public class MathUtil {

    //hàm tính n giai thừa n! = 1 x 2 x 3 x 4 x....n
    //k có giai thừa số âm
    //0! = 1! = 1 quy ước
    //giai thừa tăng rất nhanh, 20! vừa đủ cho long, 18 con sô 0
    // 21 vượt long vượt 18 số 0, tràn
    //chặn việc n < 0 và/hoặc n > 21
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. "
                    + "n must be between 0..20");
        
        if (n == 0 || n == 1) 
            return 1;
        

        //sống sót đến đây, sure n = 2..20
        long product = 1; //kết quả chung gian
        for (int i = 2; i <= n; i++) 
            product *= i;
        

        return product;

    }
}
