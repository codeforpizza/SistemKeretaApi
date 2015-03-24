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
public class PenumpangOnsite {
    private String statusBayarTiket;
	private int TiketOnline[];
	
	public PenumpangOnsite(String namaPenumpang , String alamat , String noKTP ){
		super(namaPenumpang,alamat,noKTP);
	}
	public void setstatusBayarTiket(String statusBayarTiket){
		this.statusBayarTiket=statusBayarTiket;
	}
	public String getStatusbayarTiket(){
		return statusBayarTiket;
	}
}
