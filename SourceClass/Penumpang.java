/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceClass;

/**
 *
 * @author heavydude
 */
public class Penumpang {
    private String namaPenumpang;
	private String alamat;
	private String noKTP;
	
	public Penumpang(String namaPenumpang , String alamat , String noKTP){
		this.namaPenumpang=namaPenumpang;
		this.alamat=alamat;
		this.noKTP=noKTP;
	}
	public void setNamaPenumpang(String namaPenumpang){
		this.namaPenumpang=namaPenumpang;
	}
	public void setAlamat(String alamat){
		this.alamat=alamat;
	}
	public void setnoKTP(String noKTP){
		this.noKTP=noKTP;
	}
	public String getNamaPenumpang(){
		return namaPenumpang;
	}
	public String getAlamat(){
		return alamat;
	}
	public String getnoKTP(){
		return noKTP;
	}

}
