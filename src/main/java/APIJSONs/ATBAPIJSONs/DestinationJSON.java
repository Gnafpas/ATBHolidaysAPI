package APIJSONs.ATBAPIJSONs;

import APIJSONs.StandardJSON;

import java.util.List;

/**
 * Created by George on 09/12/2017.
 */
public class DestinationJSON extends StandardJSON {

    private List<Destination> data;

    public List<Destination> getData() {
        return data;
    }

    public void setData(List<Destination> data) {
        this.data = data;
    }
}
