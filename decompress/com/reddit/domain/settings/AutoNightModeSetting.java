// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.settings;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lcom/reddit/domain/settings/AutoNightModeSetting;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OFF", "FOLLOW_OS", "TIME_OF_DAY", "BATTERY_SAVER", "TIME_OF_DAY_AND_BATTERY_SAVER", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum AutoNightModeSetting
{
    private static final AutoNightModeSetting[] $VALUES;
    
    BATTERY_SAVER("battery_saver"), 
    FOLLOW_OS("follow_os"), 
    OFF("off"), 
    TIME_OF_DAY("location_based"), 
    TIME_OF_DAY_AND_BATTERY_SAVER("location_based_and_battery_saver");
    
    private final String value;
    
    private static final AutoNightModeSetting[] $values() {
        return new AutoNightModeSetting[] { AutoNightModeSetting.OFF, AutoNightModeSetting.FOLLOW_OS, AutoNightModeSetting.TIME_OF_DAY, AutoNightModeSetting.BATTERY_SAVER, AutoNightModeSetting.TIME_OF_DAY_AND_BATTERY_SAVER };
    }
    
    static {
        $VALUES = $values();
    }
    
    private AutoNightModeSetting(final String value) {
        this.value = value;
    }
    
    public final String getValue() {
        return this.value;
    }
}
