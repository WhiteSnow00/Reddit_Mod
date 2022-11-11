// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.tasks;

public class RuntimeExecutionException extends zzj
{
    public RuntimeExecutionException(final Throwable t) {
        super(t);
    }
    
    public final int getErrorCode() {
        return -100;
    }
}
