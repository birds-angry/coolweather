package app.coolweather.com.coolweather.model;

/**
 * Created by shuai on 2017/4/27.
 */

public class County {
    private int id;
    private  String countyName;
    private  String countyCode;
    private  int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public  String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getCountyCode(){
        return countyCode;
    }
    public void setCountyCode(String countyCode){
        this.countyCode=countyCode;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int provinceId){
        this.cityId=cityId;
    }

}
