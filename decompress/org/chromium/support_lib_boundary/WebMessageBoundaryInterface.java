// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

public interface WebMessageBoundaryInterface extends FeatureFlagHolderBoundaryInterface
{
    String getData();
    
    InvocationHandler[] getPorts();
}
