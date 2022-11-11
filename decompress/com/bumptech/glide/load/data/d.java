// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

public interface d<T>
{
    Class<T> a();
    
    void b();
    
    DataSource c();
    
    void cancel();
    
    void d(final Priority p0, final a<? super T> p1);
    
    public interface a<T>
    {
        void e(final T p0);
        
        void f(final Exception p0);
    }
}
