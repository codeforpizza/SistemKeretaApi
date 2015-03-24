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
public class PenumpangOnline {
    private String NoRekening;
	private String statusBayarTiket;
	private int TiketOnline[];
	
	public PenumpangOnline(String namaPenumpang , String alamat , String noKTP , String NoRekening){
		super(namaPenumpang,alamat,noKTP);
		this.NoRekening=NoRekening;
	}
	public void setNoRekening(String NoRekening){
		this.NoRekening=NoRekening;
	}
	public String getNoRekening(){
		return NoRekening;
	}
	public void setStatusBayarTiket(String statusBayarTiket){
		this.statusBayarTiket=statusBayarTiket;
	}
	public String getStatusBayarTiket(){
		return statusBayarTiket;
	}
}
