package Baitap;
	import java.util.Scanner;
	public class ChiTietPhieuNhap extends PhieuNhap{
		protected String MaSanPham;
		protected int SoLuong;
		protected int HanSuDung;
		
		public void setMaSanPham(String MaSanPham)
		{
			this.MaSanPham= MaSanPham;
		}
		public String getMaSanPham()
		{
			return MaSanPham;
		}
	    public void setSoLuong(int SoLuong )
	    {
	    	this.SoLuong= SoLuong;
	    }
	    public int getSoLuong()
	    {
	    	return SoLuong;
	    }
	    public void setHanSuDung(int HanSuDung)
	    {
	    	this.HanSuDung=HanSuDung;
	    }
	    public int getHanSuDung()
	    {
	    	return HanSuDung;
	    }
	    
	    
	}

