// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import java.util.Iterator;
import kotlin.text.b;
import sg2.e;
import cj2.k;
import java.util.logging.Handler;
import java.util.logging.Level;
import android.util.Log;
import kotlin.collections.c;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import okhttp3.OkHttpClient;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.internal.SuppressSignatureCheck;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0007R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lokhttp3/internal/platform/android/AndroidLog;", "", "", "loggerName", "loggerTag", "logger", "tag", "Lhg2/j;", "enableLogging", "", "logLevel", "message", "", "t", "androidLog$okhttp", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "androidLog", "enable", "MAX_LOG_LENGTH", "I", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "configuredLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "knownLoggers", "Ljava/util/Map;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
@SuppressSignatureCheck
public final class AndroidLog
{
    public static final AndroidLog INSTANCE;
    private static final int MAX_LOG_LENGTH = 4000;
    private static final CopyOnWriteArraySet<Logger> configuredLoggers;
    private static final Map<String, String> knownLoggers;
    
    static {
        INSTANCE = new AndroidLog();
        configuredLoggers = new CopyOnWriteArraySet<Logger>();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Package package1 = OkHttpClient.class.getPackage();
        Object name;
        if (package1 == null) {
            name = null;
        }
        else {
            name = package1.getName();
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = c.h1((Map)linkedHashMap);
    }
    
    private AndroidLog() {
    }
    
    private final void enableLogging(final String s, final String s2) {
        final Logger logger = Logger.getLogger(s);
        if (AndroidLog.configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            Level level;
            if (Log.isLoggable(s2, 3)) {
                level = Level.FINE;
            }
            else if (Log.isLoggable(s2, 4)) {
                level = Level.INFO;
            }
            else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }
    
    private final String loggerTag(final String s) {
        String h1;
        if ((h1 = AndroidLog.knownLoggers.get(s)) == null) {
            h1 = k.H1(23, s);
        }
        return h1;
    }
    
    public final void androidLog$okhttp(String string, final int n, String substring, final Throwable t) {
        e.f((Object)string, "loggerName");
        e.f((Object)substring, "message");
        final String loggerTag = this.loggerTag(string);
        if (Log.isLoggable(loggerTag, n)) {
            string = substring;
            if (t != null) {
                final StringBuilder s = a.s(substring, '\n');
                s.append((Object)Log.getStackTraceString(t));
                string = s.toString();
            }
            int min;
            for (int length = string.length(), i = 0; i < length; i = min + 1) {
                int y0 = b.Y0((CharSequence)string, '\n', i, false, 4);
                if (y0 == -1) {
                    y0 = length;
                }
                while (true) {
                    min = Math.min(y0, i + 4000);
                    substring = string.substring(i, min);
                    e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    Log.println(n, loggerTag, substring);
                    if (min >= y0) {
                        break;
                    }
                    i = min;
                }
            }
        }
    }
    
    public final void enable() {
        for (final Map.Entry entry : AndroidLog.knownLoggers.entrySet()) {
            this.enableLogging((String)entry.getKey(), (String)entry.getValue());
        }
    }
}
