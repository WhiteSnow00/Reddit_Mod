// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import cg2.j;
import okhttp3.internal._UtilJvmKt;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParsePosition;
import ng2.e;
import java.util.Date;
import java.text.DateFormat;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000+\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u001a\f\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0005\u001a\n\u0010\u000e\u001a\u00020\u0005*\u00020\r\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f" }, d2 = { "BROWSER_COMPATIBLE_DATE_FORMATS", "", "Ljava/text/DateFormat;", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "", "[Ljava/lang/String;", "MAX_DATE", "", "STANDARD_DATE_FORMAT", "okhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1", "Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;", "toHttpDateOrNull", "Ljava/util/Date;", "toHttpDateString", "okhttp" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class DatesKt
{
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final long MAX_DATE = 253402300799999L;
    private static final DatesKt$STANDARD_DATE_FORMAT.DatesKt$STANDARD_DATE_FORMAT$1 STANDARD_DATE_FORMAT;
    
    static {
        STANDARD_DATE_FORMAT = new DatesKt$STANDARD_DATE_FORMAT.DatesKt$STANDARD_DATE_FORMAT$1();
        BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = new String[] { "EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z" }).length];
    }
    
    public static final Date toHttpDateOrNull(final String s) {
        e.f((Object)s, "<this>");
        if (s.length() == 0) {
            return null;
        }
        final ParsePosition parsePosition = new ParsePosition(0);
        final Date parse = ((ThreadLocal<DateFormat>)DatesKt.STANDARD_DATE_FORMAT).get().parse(s, parsePosition);
        if (parsePosition.getIndex() == s.length()) {
            return parse;
        }
        final String[] browser_COMPATIBLE_DATE_FORMAT_STRINGS = DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (browser_COMPATIBLE_DATE_FORMAT_STRINGS) {
            for (int length = browser_COMPATIBLE_DATE_FORMAT_STRINGS.length, i = 0; i < length; ++i) {
                final DateFormat[] browser_COMPATIBLE_DATE_FORMATS = DatesKt.BROWSER_COMPATIBLE_DATE_FORMATS;
                DateFormat dateFormat;
                if ((dateFormat = browser_COMPATIBLE_DATE_FORMATS[i]) == null) {
                    dateFormat = new SimpleDateFormat(DatesKt.BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
                    dateFormat.setTimeZone(_UtilJvmKt.UTC);
                    browser_COMPATIBLE_DATE_FORMATS[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                final Date parse2 = dateFormat.parse(s, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            final j a = j.a;
            return null;
        }
    }
    
    public static final String toHttpDateString(final Date date) {
        e.f((Object)date, "<this>");
        final String format = ((ThreadLocal<DateFormat>)DatesKt.STANDARD_DATE_FORMAT).get().format(date);
        e.e((Object)format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
