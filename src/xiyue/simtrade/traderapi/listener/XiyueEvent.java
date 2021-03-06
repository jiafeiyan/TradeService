package xiyue.simtrade.traderapi.listener;

import lombok.Getter;
import lombok.Setter;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenyan on 2017/5/23.
 */
public class XiyueEvent extends EventObject{
    /**
     * Constructs a prototypical Event.
     */
    public XiyueEvent(Object source) {
        super(source);
    }

    @Setter
    @Getter
    private Map<String,Object> fields = new HashMap<>();

    @Setter
    @Getter
    private String eventFunction;
}
