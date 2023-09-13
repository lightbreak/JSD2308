package ooday05_vis;
/** 季节枚举 */
public enum Seasons {

    SPRING("春天","暖"),
    SUNMMER("夏天","热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","冷");
    private String SeasonName;
    private String SeasonDesc;
    Seasons(String SeasonName,String SeasonDesc){
        this.SeasonDesc=SeasonDesc;
        this.SeasonName=SeasonName;
    }

    public String getSeasonName() {
        return SeasonName;
    }
    public void setSeasonName(String seasonName) {
        SeasonName = seasonName;
    }
    public String getSeasonDesc() {
        return SeasonDesc;
    }
    public void setSeasonDesc(String seasonDesc) {
        SeasonDesc = seasonDesc;
    }
}
















