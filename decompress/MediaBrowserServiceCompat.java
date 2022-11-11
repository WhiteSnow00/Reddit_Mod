// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.os.Build$VERSION;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Iterator;
import X.07R;
import java.util.List;
import android.support.v4.media.MediaBrowserCompat;
import com.bytedance.covode.number.Covode;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.IBinder;
import X.13j;
import java.util.ArrayList;
import android.app.Service;

public abstract class MediaBrowserServiceCompat extends Service
{
    public final ArrayList<MediaBrowserServiceCompat.b> LIZ;
    public final 13j<IBinder, MediaBrowserServiceCompat.b> LIZIZ;
    public final MediaBrowserServiceCompat.m LIZJ;
    public MediaSessionCompat.Token LIZLLL;
    public MediaBrowserServiceCompat.c LJ;
    
    static {
        Covode.recordClassIndex(1348);
    }
    
    public MediaBrowserServiceCompat() {
        new MediaBrowserServiceCompat.b(this, "android.media.session.MediaController", -1, -1, (MediaBrowserServiceCompat.k)null);
        this.LIZ = new ArrayList<MediaBrowserServiceCompat.b>();
        this.LIZIZ = new 13j<IBinder, MediaBrowserServiceCompat.b>();
        this.LIZJ = new MediaBrowserServiceCompat.m(this);
    }
    
    public abstract MediaBrowserServiceCompat.a LIZ(final String p0);
    
    public final void LIZ(final MediaBrowserServiceCompat.h<MediaBrowserCompat.MediaItem> h) {
        h.LJIIIIZZ = 2;
        h.LIZJ();
    }
    
    public final void LIZ(final MediaSessionCompat.Token lizlll) {
        if (lizlll == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = lizlll;
            this.LJ.LIZ(lizlll);
            return;
        }
        throw new IllegalStateException("The session token has already been set");
    }
    
    public abstract void LIZ(final String p0, final MediaBrowserServiceCompat.h<List<MediaBrowserCompat.MediaItem>> p1);
    
    public final boolean LIZ(final String s, final MediaBrowserServiceCompat.b b, final IBinder binder) {
        final boolean b2 = true;
        final boolean b3 = false;
        boolean b4 = false;
        Label_0037: {
            if (binder != null) {
                break Label_0037;
            }
            try {
                return b.LJ.remove(s) != null && b2;
                while (true) {
                    Iterator iterator = null;
                    Label_0068: {
                        boolean b5;
                        while (true) {
                            b.LJ.remove(s);
                            b5 = b4;
                            return b5;
                            final List list = b.LJ.get(s);
                            b5 = b3;
                            iftrue(Label_0135:)(list == null);
                            iterator = list.iterator();
                            break Label_0068;
                            iftrue(Label_0068:)(binder != ((07R)iterator.next()).LIZ);
                            iterator.remove();
                            b4 = true;
                            break Label_0068;
                            Label_0108: {
                                b5 = b4;
                            }
                            iftrue(Label_0135:)(list.size() != 0);
                            continue;
                        }
                        Label_0135: {
                            return b5;
                        }
                    }
                    iftrue(Label_0108:)(!iterator.hasNext());
                    continue;
                }
            }
            finally {}
        }
    }
    
    public final void LIZIZ(final String s, final MediaBrowserServiceCompat.h<List<MediaBrowserCompat.MediaItem>> h) {
        h.LJIIIIZZ = 1;
        this.LIZ(s, h);
    }
    
    public void dump(final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
    }
    
    public IBinder onBind(final Intent intent) {
        return this.LJ.LIZ(intent);
    }
    
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 28) {
            this.LJ = (MediaBrowserServiceCompat.c)new MediaBrowserServiceCompat.g(this);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            this.LJ = (MediaBrowserServiceCompat.c)new MediaBrowserServiceCompat.f(this);
        }
        else if (Build$VERSION.SDK_INT >= 23) {
            this.LJ = (MediaBrowserServiceCompat.c)new MediaBrowserServiceCompat.e(this);
        }
        else {
            this.LJ = (MediaBrowserServiceCompat.c)new MediaBrowserServiceCompat.d(this);
        }
        this.LJ.LIZ();
    }
}
