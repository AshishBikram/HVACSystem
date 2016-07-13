package Model;

/**
 * Created by iam on 7/2/16.
 */
public class HVAC {

    int buildingid;
    String manager;
    String modalno;
    String recorddate;
    String recordtime;
    double expecteddata;
    double resulteddata;


    public HVAC() {
    }

    public HVAC(int buildingid,String manager,String modalno, String recorddate, String recordtime, double expecteddata, double resulteddata) {
        this.buildingid = buildingid;
        this.manager=manager;
        this.modalno = modalno;
        this.recorddate = recorddate;

        this.recordtime = recordtime;
        this.expecteddata = expecteddata;
        this.resulteddata = resulteddata;
    }


    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(int buildingid) {
        this.buildingid = buildingid;
    }

    public String getModalno() {
        return modalno;
    }

    public void setModalno(String modalno) {
        this.modalno = modalno;
    }

    public String getRecorddate() {
        return getRecorddate();
    }

    public void setRecorddate(String recorddate) {
        this.recorddate = recorddate;
    }

    public String getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(String recordtime) {
        this.recordtime = recordtime;
    }

    public double getExpecteddata() {
        return expecteddata;
    }

    public void setExpecteddata(double expecteddata) {
        this.expecteddata = expecteddata;
    }

    public double getResulteddata() {
        return resulteddata;
    }

    public void setResulteddata(double resulteddata) {
        this.resulteddata = resulteddata;
    }
}
