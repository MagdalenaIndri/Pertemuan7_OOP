
package pertemuan7;

/**
 *
 * @author 2201010614
 * tgl:2024-05-06
 */
public class induk {
    private String nama;
    public int nilai=0;
    
     public induk(String nm, int nl){
         nama = nm;
         nilai = nl;
     }
     
    
    public void setNAMA(String nVAL){
        this.nama = nVAL;
    }
    public void setNAMA(){
        this.nama = "Siapa ya";
    }
    public String getNAMA(){
        return nama;
    }
    public void  cetakNAMA(){
        System.out.printf("4.Isi variabel nama: %s dengan tinggi badan%d \n\n",this.nama,this.nilai);
    }
}
