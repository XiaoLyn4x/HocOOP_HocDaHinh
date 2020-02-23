package buiphuongnga.com.test;

import buiphuongnga.com.model.IDoable;
import buiphuongnga.com.model.NhanVien;
import buiphuongnga.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDoable x;
		x = new NhanVien();
		x.doSomething();
		x = new SinhVien();
		x.doSomething();

	}

}
