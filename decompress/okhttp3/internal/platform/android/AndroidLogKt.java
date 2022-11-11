// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "androidLevel", "", "Ljava/util/logging/LogRecord;", "getAndroidLevel", "(Ljava/util/logging/LogRecord;)I", "okhttp" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class AndroidLogKt
{
    private static final int getAndroidLevel(final LogRecord logRecord) {
        int n;
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            n = 5;
        }
        else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            n = 4;
        }
        else {
            n = 3;
        }
        return n;
    }
}
