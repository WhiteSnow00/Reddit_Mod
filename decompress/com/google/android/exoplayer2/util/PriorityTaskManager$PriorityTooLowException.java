// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.util;

import java.io.IOException;

public class PriorityTaskManager$PriorityTooLowException extends IOException
{
    public PriorityTaskManager$PriorityTooLowException(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder(60);
        sb.append("Priority too low [priority=");
        sb.append(n);
        sb.append(", highest=");
        sb.append(n2);
        sb.append("]");
        super(sb.toString());
    }
}
