// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import hj2.s;
import androidx.paging.RemoteMediator;
import lg2.c;

public interface v<Key, Value> extends w<Key, Value>
{
    Object c(final c<? super RemoteMediator.InitializeAction> p0);
    
    s getState();
}
