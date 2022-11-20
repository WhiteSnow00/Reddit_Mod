// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import android.net.Uri;
import java.lang.reflect.InvocationHandler;
import android.webkit.WebView;

public interface WebMessageListenerBoundaryInterface extends FeatureFlagHolderBoundaryInterface
{
    void onPostMessage(final WebView p0, final InvocationHandler p1, final Uri p2, final boolean p3, final InvocationHandler p4);
}
