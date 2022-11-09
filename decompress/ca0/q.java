// 
// Decompiled by Procyon v0.6.0
// 

package ca0;

import com.reddit.screen.BaseScreen;
import com.reddit.screen.util.PermissionUtil;
import com.reddit.feature.fullbleedplayer.FullBleedVideoScreen;
import com.reddit.feature.fullbleedplayer.FullBleedVideoPresenter$b;

public final class q implements FullBleedVideoPresenter$b
{
    public final boolean a(final FullBleedVideoScreen fullBleedVideoScreen) {
        return PermissionUtil.m(11, (BaseScreen)fullBleedVideoScreen);
    }
}
