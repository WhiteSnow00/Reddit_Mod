// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import java.util.List;

public interface FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT>
{
    List<FRAGMENT> getAddedFragments(final FRAGMENT_MANAGER p0);
}
