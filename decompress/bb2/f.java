// 
// Decompiled by Procyon v0.6.0
// 

package bb2;

import com.google.android.exoplayer2.w$c;
import com.reddit.feature.stream.b;
import p11.h;
import zq0.b$e;
import java.util.List;
import zq0.b$d;
import com.reddit.video.creation.usecases.render.RenderVideoUseCase;
import com.reddit.video.creation.video.VideoRenderApiImpl;
import kotlin.Pair;
import com.reddit.video.creation.widgets.adjustclips.trim.TrimClipPresenter;
import com.reddit.video.creation.widgets.edit.presenter.EditUGCPresenter;
import com.reddit.video.creation.usecases.render.RenderAudioResult;
import com.reddit.video.creation.widgets.recording.view.RecordButtonExtensionsKt;
import android.view.MotionEvent;
import com.reddit.video.creation.widgets.voiceover.VoiceoverPresenter;
import cg2.j;
import ng2.e;
import nt.d;
import bd.n$a;
import ff2.c;
import ff2.o;

public final class f implements o, c, n$a, d
{
    public final int f;
    
    public f(final int f) {
        this.f = f;
    }
    
    public String a(final Object o) {
        switch (this.f) {
            default: {
                final String s = (String)o;
                e.f((Object)s, "it");
                return s;
            }
            case 0: {
                final String s2 = (String)o;
                e.f((Object)s2, "it");
                return s2;
            }
        }
    }
    
    public Object apply(final Object o) {
        switch (this.f) {
            default: {
                return VoiceoverPresenter.t((j)o);
            }
            case 4: {
                return RecordButtonExtensionsKt.d((MotionEvent)o);
            }
            case 3: {
                return EditUGCPresenter.l((RenderAudioResult)o);
            }
            case 2: {
                return TrimClipPresenter.g((j)o);
            }
            case 1: {
                return VideoRenderApiImpl.g((Pair)o);
            }
            case 0: {
                return RenderVideoUseCase.j((Integer)o);
            }
        }
    }
    
    public Object apply(final Object o, final Object o2) {
        switch (this.f) {
            default: {
                final b$d b$d = (b$d)o;
                final List list = (List)o2;
                e.f((Object)b$d, "previousSelection");
                e.f((Object)list, "regions");
                return new b$e(b$d, list);
            }
            case 1: {
                final Pair pair = (Pair)o;
                final h h = (h)o2;
                final int k0 = b.k0;
                e.f((Object)pair, "streamModelWithAnalyticsFlag");
                e.f((Object)h, "model");
                final boolean n = h.n;
                final boolean n2 = ((h)pair.getFirst()).n;
                boolean b = true;
                if (n == n2 || !h.n) {
                    b = false;
                }
                return new Pair((Object)h, (Object)b);
            }
            case 0: {
                return new Pair((Object)o, (Object)o2);
            }
        }
    }
    
    public void invoke(final Object o) {
        ((w$c)o).onRepeatModeChanged(this.f);
    }
}
