// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import sg2.e;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import java.util.logging.Handler;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n" }, d2 = { "Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lhg2/j;", "publish", "flush", "close", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class AndroidLogHandler extends Handler
{
    public static final AndroidLogHandler INSTANCE;
    
    static {
        INSTANCE = new AndroidLogHandler();
    }
    
    private AndroidLogHandler() {
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void publish(final LogRecord logRecord) {
        e.f((Object)logRecord, "record");
        final AndroidLog instance = AndroidLog.INSTANCE;
        final String loggerName = logRecord.getLoggerName();
        e.e((Object)loggerName, "record.loggerName");
        final int access$getAndroidLevel = AndroidLogKt.access$getAndroidLevel(logRecord);
        final String message = logRecord.getMessage();
        e.e((Object)message, "record.message");
        instance.androidLog$okhttp(loggerName, access$getAndroidLevel, message, logRecord.getThrown());
    }
}
