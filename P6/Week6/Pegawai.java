// Muhammad Rayhan Faridh
// 222212766
// 2KS1

import java.util.Calendar;

public class Pegawai extends Orang implements Dosen {
  private String NIP;
  private String kantor;
  private String unitKerja;
  private String NIDN;
  private String kelompokKeahlian;

  public Pegawai(String nama, String NIP, String kantor, String unitKerja, String NIDN, String kelompokKeahlian) {
    super(nama);
    this.NIP = NIP;
    this.kantor = kantor;
    this.unitKerja = unitKerja;
    this.NIDN = NIDN;
    this.kelompokKeahlian = kelompokKeahlian;
  }

  public Pegawai(String nama, Calendar tanggalLahir, String NIP, String kantor, String unitKerja, String NIDN,
      String kelompokKeahlian) {
    super(nama, tanggalLahir);
    this.NIP = NIP;
    this.kantor = kantor;
    this.unitKerja = unitKerja;
    this.NIDN = NIDN;
    this.kelompokKeahlian = kelompokKeahlian;
  }

  public String getNIP() {
    return NIP;
  }

  public String getKantor() {
    return kantor;
  }

  public void setNIP(String NIP) {
    this.NIP = NIP;
  }

  public void setKantor(String kantor) {
    this.kantor = kantor;
  }

  @Override
  public String getNIDN() {
    return NIDN;
  }

  @Override
  public void setNIDN(String NIDN) {
    this.NIDN = NIDN;
  }

  @Override
  public String getKeahlian() {
    return kelompokKeahlian;
  }

  @Override
  public void setKeahlian(String keahlian) {
    this.kelompokKeahlian = keahlian;
  }

  public String getPekerjaan() {
    return "mengajar";
  }

  public String getUnitKerja() {
    return unitKerja;
  }

  public void setUnitKerja(String unitKerja) {
    this.unitKerja = unitKerja;
  }

  public String toString() {
    return "Pegawai[" + super.toString() + ", NIP = " + NIP + ", kantor = " + kantor + ", unitKerja = " + unitKerja
        + ", NIDN = " + NIDN + ", kelompokKeahlian = " + kelompokKeahlian + "]";
  }
}
