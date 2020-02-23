package buiphuongnga.com.test;

import buiphuongnga.com.model.HinhChuNhat;
import buiphuongnga.com.model.HinhHoc;
import buiphuongnga.com.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h;
		h= new HinhChuNhat(4, 5);
		System.out.println("Chu vi = "+h.tinhChuVi());
		System.out.println("Diện tích = "+h.tinhDienTich());
		System.out.println("----------------------");
		h = new HinhVuong();
		System.out.println("Chu vi = "+h.tinhChuVi());
		System.out.println("Diện tích = "+h.tinhDienTich());
		System.out.println("----------------------");
		HinhChuNhat hv1=new HinhVuong(5);
		System.out.println("Chu vi = "+h.tinhChuVi());
		System.out.println("Diện tích = "+h.tinhDienTich());

	}

}
