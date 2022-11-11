// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor.internal;

import kotlin.Metadata;
import android.util.AndroidRuntimeException;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/bluelinelabs/conductor/internal/CalledFromWrongThreadException;", "Landroid/util/AndroidRuntimeException;", "msg", "", "(Ljava/lang/String;)V", "conductor_release" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
final class CalledFromWrongThreadException extends AndroidRuntimeException
{
    public CalledFromWrongThreadException(final String s) {
        super(s);
    }
}
