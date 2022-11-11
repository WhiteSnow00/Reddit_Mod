// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import o8.d;

public interface c
{
    boolean b();
    
    void cancel();
    
    public interface a
    {
        void a(final d p0, final Object p1, final com.bumptech.glide.load.data.d<?> p2, final DataSource p3, final d p4);
        
        void d(final d p0, final Exception p1, final com.bumptech.glide.load.data.d<?> p2, final DataSource p3);
        
        void e();
    }
}
