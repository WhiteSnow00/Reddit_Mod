// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import com.facebook.stetho.common.LogUtil;
import android.content.res.Resources$NotFoundException;
import a2.b;
import android.content.res.Resources;

public class ResourcesUtil
{
    private ResourcesUtil() {
    }
    
    private static String getFallbackIdString(final int n) {
        final StringBuilder k = a.k("#");
        k.append(Integer.toHexString(n));
        return k.toString();
    }
    
    public static String getIdString(final Resources resources, int length) throws Resources$NotFoundException {
        if (resources == null) {
            return getFallbackIdString(length);
        }
        final int resourcePackageId = getResourcePackageId(length);
        String resourcePackageName = "";
        String s;
        if (resourcePackageId != 127) {
            resourcePackageName = resources.getResourcePackageName(length);
            s = ":";
        }
        else {
            s = "";
        }
        final String resourceTypeName = resources.getResourceTypeName(length);
        final String resourceEntryName = resources.getResourceEntryName(length);
        length = resourcePackageName.length();
        final StringBuilder sb = new StringBuilder(resourceEntryName.length() + (resourceTypeName.length() + (s.length() + (length + 1)) + 1));
        d.B(sb, "@", resourcePackageName, s, resourceTypeName);
        return b.j(sb, "/", resourceEntryName);
    }
    
    public static String getIdStringQuietly(final Object o, final Resources resources, final int n) {
        try {
            return getIdString(resources, n);
        }
        catch (final Resources$NotFoundException ex) {
            final String fallbackIdString = getFallbackIdString(n);
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown identifier encountered on ");
            sb.append(o);
            sb.append(": ");
            sb.append(fallbackIdString);
            LogUtil.w(sb.toString());
            return fallbackIdString;
        }
    }
    
    private static int getResourcePackageId(final int n) {
        return n >>> 24 & 0xFF;
    }
}
