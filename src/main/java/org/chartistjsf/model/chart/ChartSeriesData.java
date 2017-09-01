package org.chartistjsf.model.chart;

import java.io.Serializable;

public class ChartSeriesData implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String meta;
    private Number value;
    
    
    public ChartSeriesData()
    {
	super();
    }
    public String getMeta()
    {
        return meta;
    }
    public void setMeta(String meta)
    {
        this.meta = meta;
    }
    public Number getValue()
    {
        return value;
    }
    public void setValue(Number value)
    {
        this.value = value;
    }

}
