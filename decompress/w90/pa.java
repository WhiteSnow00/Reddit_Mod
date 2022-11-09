// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import android.content.SharedPreferences;
import com.reddit.domain.model.postsubmit.CreatorKitResult$ImageInfo;
import com.reddit.domain.model.postsubmit.CreatorKitResult$Work$VideoInfo;
import je0.t;
import com.reddit.domain.model.PostType;
import j71.b;
import com.reddit.screen.BaseScreen;
import j71.d;
import j71.k;

public final class pa implements k
{
    public final a1 a;
    
    public pa(final a1 a) {
        this.a = a;
    }
    
    public final qa a(final d d, final BaseScreen baseScreen, final b b, final PostType postType, final t t, final c6.k k, final CreatorKitResult$Work$VideoInfo creatorKitResult$Work$VideoInfo, final CreatorKitResult$ImageInfo creatorKitResult$ImageInfo, final SharedPreferences sharedPreferences) {
        d.getClass();
        baseScreen.getClass();
        postType.getClass();
        return new qa(this.a, d, baseScreen, b, postType, t, k, creatorKitResult$Work$VideoInfo, creatorKitResult$ImageInfo, sharedPreferences);
    }
}
