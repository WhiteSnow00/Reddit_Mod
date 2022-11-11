// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

public interface e
{
    void a(final long[] p0, final boolean[] p1, final int p2);
    
    void b(final c$b p0);
    
    long getPreferredUpdateDelay();
    
    void setBufferedPosition(final long p0);
    
    void setDuration(final long p0);
    
    void setEnabled(final boolean p0);
    
    void setPosition(final long p0);
    
    public interface a
    {
        void j(final long p0);
        
        void t(final long p0);
        
        void u(final long p0, final boolean p1);
    }
}
