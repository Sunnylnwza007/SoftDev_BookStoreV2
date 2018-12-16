/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.CartBook;

/**
 *
 * @author dell
 */
public class Address {
    String houseNum;
    String villageNo;
    String subDistrict;
    String district;
    String province;
    String postcode;
    String tel;

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getVillageNo() {
        return villageNo;
    }

    public void setVillageNo(String mo) {
        this.villageNo = mo;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String tumbon) {
        this.subDistrict = tumbon;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String aumper) {
        this.district = aumper;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String provide) {
        this.province = provide;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
