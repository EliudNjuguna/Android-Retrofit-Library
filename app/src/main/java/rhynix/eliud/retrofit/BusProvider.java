package rhynix.eliud.retrofit;

import com.squareup.otto.Bus;

/**
 * Created by eliud on 12/2/16.
 */

public class BusProvider {

    private static final Bus BUS = new Bus();

    public static Bus getInstance(){
        return BUS;
    }

    public BusProvider(){}
}