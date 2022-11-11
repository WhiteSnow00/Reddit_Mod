// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

public final class ExoTimeoutException extends RuntimeException
{
    public static final int TIMEOUT_OPERATION_DETACH_SURFACE = 3;
    public static final int TIMEOUT_OPERATION_RELEASE = 1;
    public static final int TIMEOUT_OPERATION_SET_FOREGROUND_MODE = 2;
    public static final int TIMEOUT_OPERATION_UNDEFINED = 0;
    public final int timeoutOperation;
    
    public ExoTimeoutException(final int timeoutOperation) {
        String s;
        if (timeoutOperation != 1) {
            if (timeoutOperation != 2) {
                if (timeoutOperation != 3) {
                    s = "Undefined timeout.";
                }
                else {
                    s = "Detaching surface timed out.";
                }
            }
            else {
                s = "Setting foreground mode timed out.";
            }
        }
        else {
            s = "Player release timed out.";
        }
        super(s);
        this.timeoutOperation = timeoutOperation;
    }
}
