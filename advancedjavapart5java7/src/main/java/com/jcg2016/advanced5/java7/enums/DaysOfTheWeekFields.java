package com.jcg2016.advanced5.java7.enums;

public enum DaysOfTheWeekFields {
    MONDAY( false ),
    TUESDAY( false ),
    WEDNESDAY( false ),
    THURSDAY( false ),
    FRIDAY( false ),
    SATURDAY( true ),
    SUNDAY( true );
    
    private final boolean isWeekend;
    
    private DaysOfTheWeekFields( final boolean isWeekend ) {
        this.isWeekend = isWeekend;
    }
    
    public boolean isWeekend() {
        return isWeekend;
    }
}
