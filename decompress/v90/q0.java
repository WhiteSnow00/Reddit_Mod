// 
// Decompiled by Procyon v0.6.0
// 

package v90;

import com.reddit.session.mode.common.SessionMode;

public final class q0
{
    public static final int[] a;
    
    static {
        final int[] a2 = new int[SessionMode.values().length];
        a2[((Enum)SessionMode.LOGGED_IN).ordinal()] = 1;
        a2[((Enum)SessionMode.INCOGNITO).ordinal()] = 2;
        a = a2;
    }
}
