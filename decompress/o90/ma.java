// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import android.content.SharedPreferences;
import com.reddit.domain.model.postsubmit.CreatorKitResult$ImageInfo;
import com.reddit.domain.model.postsubmit.CreatorKitResult$Work$VideoInfo;
import c6.l;
import ae0.t;
import com.reddit.domain.model.PostType;
import c71.b;
import com.reddit.screen.BaseScreen;
import c71.d;
import c71.k;

public final class ma implements k
{
    public final z0 a;
    
    public ma(final z0 a) {
        this.a = a;
    }
    
    public final na a(final d d, final BaseScreen baseScreen, final b b, final PostType postType, final t t, final l l, final CreatorKitResult$Work$VideoInfo creatorKitResult$Work$VideoInfo, final CreatorKitResult$ImageInfo creatorKitResult$ImageInfo, final SharedPreferences sharedPreferences) {
        d.getClass();
        baseScreen.getClass();
        postType.getClass();
        return new na(this.a, d, baseScreen, b, postType, t, l, creatorKitResult$Work$VideoInfo, creatorKitResult$ImageInfo, sharedPreferences);
    }
}
