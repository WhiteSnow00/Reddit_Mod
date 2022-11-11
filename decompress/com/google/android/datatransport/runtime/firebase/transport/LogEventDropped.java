// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime.firebase.transport;

public final class LogEventDropped
{
    public final long a;
    public final LogEventDropped$Reason b;
    
    static {
        new a();
    }
    
    public LogEventDropped(final long a, final LogEventDropped$Reason b) {
        this.a = a;
        this.b = b;
    }
    
    public static final class a
    {
        public long a;
        public LogEventDropped$Reason b;
        
        public a() {
            this.a = 0L;
            this.b = LogEventDropped$Reason.REASON_UNKNOWN;
        }
    }
}
