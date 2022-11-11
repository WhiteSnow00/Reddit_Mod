// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import java.util.Scanner;
import android.content.res.Resources;
import android.content.Context;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import com.twitter.sdk.android.core.Twitter;
import java.io.Closeable;

public class CommonUtils
{
    public static final boolean TRACE_ENABLED_DEFAULT = false;
    public static final String TRACE_ENABLED_RESOURCE_NAME = "com.twitter.sdk.android.TRACE_ENABLED";
    private static Boolean clsTrace;
    
    public static void closeOrLog(final Closeable closeable, final String s) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (final IOException ex) {
                Twitter.getLogger().e("Twitter", s, (Throwable)ex);
            }
        }
    }
    
    public static void closeQuietly(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {
            goto Label_0016;
        }
    }
    
    public static void copyStream(final InputStream inputStream, final OutputStream outputStream, final byte[] array) throws IOException {
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            outputStream.write(array, 0, read);
        }
    }
    
    public static boolean getBooleanResourceValue(final Context context, final String s, final boolean b) {
        if (context != null) {
            final Resources resources = context.getResources();
            if (resources != null) {
                final int resourcesIdentifier = getResourcesIdentifier(context, s, "bool");
                if (resourcesIdentifier > 0) {
                    return resources.getBoolean(resourcesIdentifier);
                }
                final int resourcesIdentifier2 = getResourcesIdentifier(context, s, "string");
                if (resourcesIdentifier2 > 0) {
                    return Boolean.parseBoolean(context.getString(resourcesIdentifier2));
                }
            }
        }
        return b;
    }
    
    public static String getResourcePackageName(final Context context) {
        final int icon = context.getApplicationContext().getApplicationInfo().icon;
        if (icon > 0) {
            return context.getResources().getResourcePackageName(icon);
        }
        return context.getPackageName();
    }
    
    public static int getResourcesIdentifier(final Context context, final String s, final String s2) {
        return context.getResources().getIdentifier(s, s2, getResourcePackageName(context));
    }
    
    public static String getStringResourceValue(final Context context, final String s, final String s2) {
        if (context != null) {
            final Resources resources = context.getResources();
            if (resources != null) {
                final int resourcesIdentifier = getResourcesIdentifier(context, s, "string");
                if (resourcesIdentifier > 0) {
                    return resources.getString(resourcesIdentifier);
                }
            }
        }
        return s2;
    }
    
    public static boolean isClsTrace(final Context context) {
        if (CommonUtils.clsTrace == null) {
            CommonUtils.clsTrace = getBooleanResourceValue(context, "com.twitter.sdk.android.TRACE_ENABLED", false);
        }
        return CommonUtils.clsTrace;
    }
    
    public static void logControlled(final Context context, final int n, final String s, final String s2) {
        if (isClsTrace(context)) {
            Twitter.getLogger().log(n, "Twitter", s2);
        }
    }
    
    public static void logControlled(final Context context, final String s) {
        if (isClsTrace(context)) {
            Twitter.getLogger().d("Twitter", s);
        }
    }
    
    public static void logControlledError(final Context context, final String s, final Throwable t) {
        if (isClsTrace(context)) {
            Twitter.getLogger().e("Twitter", s);
        }
    }
    
    public static void logOrThrowIllegalStateException(final String s, final String s2) {
        if (!Twitter.isDebug()) {
            Twitter.getLogger().w(s, s2);
            return;
        }
        throw new IllegalStateException(s2);
    }
    
    public static String streamToString(final InputStream inputStream) throws IOException {
        final Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        String next;
        if (useDelimiter.hasNext()) {
            next = useDelimiter.next();
        }
        else {
            next = "";
        }
        return next;
    }
}
