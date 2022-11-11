// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho;

import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public interface InspectorModulesProvider
{
    Iterable<ChromeDevtoolsDomain> get();
}
