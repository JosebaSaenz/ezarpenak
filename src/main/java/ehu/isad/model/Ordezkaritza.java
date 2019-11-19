package ehu.isad.model;

public class Ezarpena {

    private Integer userid;
    private String key;
    private String value;

    public Ezarpena(Integer userid, String key, String value) {
        this.userid = userid;
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Ezarpena{" +
                "userid=" + userid +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}' + "\n";
    }
}
