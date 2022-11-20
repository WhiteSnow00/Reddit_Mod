// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.text.DateFormat;
import j0.j;
import java.util.Calendar;
import java.util.Date;
import android.content.res.Resources;
import java.text.ParseException;
import java.util.Locale;
import java.text.SimpleDateFormat;

final class TweetDateUtils
{
    public static final SimpleDateFormat DATE_TIME_RFC822;
    public static final long INVALID_DATE = -1L;
    public static final DateFormatter RELATIVE_DATE_FORMAT;
    
    static {
        DATE_TIME_RFC822 = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
        RELATIVE_DATE_FORMAT = new DateFormatter();
    }
    
    private TweetDateUtils() {
    }
    
    public static long apiTimeToLong(final String s) {
        long time = -1L;
        if (s == null) {
            return -1L;
        }
        try {
            time = TweetDateUtils.DATE_TIME_RFC822.parse(s).getTime();
            return time;
        }
        catch (final ParseException ex) {
            return time;
        }
    }
    
    public static String dotPrefix(final String s) {
        return b.l("\u2022 ", s);
    }
    
    public static String getRelativeTimeString(final Resources resources, final long timeInMillis, final long timeInMillis2) {
        final long n = timeInMillis - timeInMillis2;
        if (n < 0L) {
            return TweetDateUtils.RELATIVE_DATE_FORMAT.formatLongDateString(resources, new Date(timeInMillis2));
        }
        if (n < 60000L) {
            final int n2 = (int)(n / 1000L);
            return resources.getQuantityString(R$plurals.tw__time_secs, n2, new Object[] { n2 });
        }
        if (n < 3600000L) {
            final int n3 = (int)(n / 60000L);
            return resources.getQuantityString(R$plurals.tw__time_mins, n3, new Object[] { n3 });
        }
        if (n < 86400000L) {
            final int n4 = (int)(n / 3600000L);
            return resources.getQuantityString(R$plurals.tw__time_hours, n4, new Object[] { n4 });
        }
        final Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(timeInMillis);
        final Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(timeInMillis2);
        final Date date = new Date(timeInMillis2);
        if (instance.get(1) == instance2.get(1)) {
            return TweetDateUtils.RELATIVE_DATE_FORMAT.formatShortDateString(resources, date);
        }
        return TweetDateUtils.RELATIVE_DATE_FORMAT.formatLongDateString(resources, date);
    }
    
    public static boolean isValidTimestamp(final String s) {
        return apiTimeToLong(s) != -1L;
    }
    
    public static class DateFormatter
    {
        private Locale currentLocale;
        private final j<SimpleDateFormat> dateFormatArray;
        
        public DateFormatter() {
            this.dateFormatArray = (j<SimpleDateFormat>)new j();
        }
        
        private DateFormat getDateFormat(final Resources resources, final int n) {
            synchronized (this) {
                final Locale currentLocale = this.currentLocale;
                if (currentLocale == null || currentLocale != resources.getConfiguration().locale) {
                    this.currentLocale = resources.getConfiguration().locale;
                    final j<SimpleDateFormat> dateFormatArray = this.dateFormatArray;
                    final int i = dateFormatArray.i;
                    final Object[] h = dateFormatArray.h;
                    for (int j = 0; j < i; ++j) {
                        h[j] = null;
                    }
                    dateFormatArray.i = 0;
                    dateFormatArray.f = false;
                }
                SimpleDateFormat simpleDateFormat;
                if ((simpleDateFormat = (SimpleDateFormat)this.dateFormatArray.f(n, (Integer)null)) == null) {
                    simpleDateFormat = new SimpleDateFormat(resources.getString(n), Locale.getDefault());
                    this.dateFormatArray.g(n, (Object)simpleDateFormat);
                }
                return simpleDateFormat;
            }
        }
        
        public String formatLongDateString(final Resources resources, final Date date) {
            synchronized (this) {
                return this.getDateFormat(resources, R$string.tw__relative_date_format_long).format(date);
            }
        }
        
        public String formatShortDateString(final Resources resources, final Date date) {
            synchronized (this) {
                return this.getDateFormat(resources, R$string.tw__relative_date_format_short).format(date);
            }
        }
    }
}
