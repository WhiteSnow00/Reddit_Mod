// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import af2.f;
import android.database.Cursor;
import com.instabug.library.core.eventbus.eventpublisher.Subscriber;
import com.instabug.library.core.eventbus.eventpublisher.AbstractEventPublisher;
import oi.t;
import xa.b$a;
import sa.i;
import android.widget.Toast;
import android.content.Context;
import java.util.Arrays;
import com.reddit.screen.settings.preferences.PreferencesFragment;
import java.io.Serializable;
import java.util.WeakHashMap;
import java.util.Iterator;
import java.util.List;
import com.reddit.video.creation.video.trim.videoResampler.VideoEditor;
import android.view.View$OnLayoutChangeListener;
import lb2.d;
import android.view.View;
import a4.l0$g;
import a4.l0;
import com.reddit.widget.bottomnav.BottomNavView$c;
import ng2.e;
import com.reddit.widget.bottomnav.BottomNavView;
import com.reddit.widget.bottomnav.BottomNavView$Item$Type;
import af2.v;
import ha.b;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.c;
import af2.w;
import androidx.preference.Preference$d;
import com.instabug.library.core.eventbus.eventpublisher.Unsubscribable;
import we.a;
import bd.n$a;
import sa.u;
import ta.a$a;

public final class g implements a$a, a, n$a, we.a, Unsubscribable, Preference$d, w
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public g(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Object apply(final Object o) {
        Object rawQuery = this.g;
        final c c = (c)this.h;
        final SQLiteDatabase sqLiteDatabase = (SQLiteDatabase)o;
        final b k = u.k;
        ((u)rawQuery).getClass();
        final Long r = u.r(sqLiteDatabase, c);
        if (r == null) {
            return Boolean.FALSE;
        }
        rawQuery = ((u)rawQuery).q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[] { r.toString() });
        try {
            final boolean moveToNext = ((Cursor)rawQuery).moveToNext();
            ((Cursor)rawQuery).close();
            return moveToNext;
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    public final void b(final v v) {
        switch (this.f) {
            default: {
                final BottomNavView$Item$Type bottomNavView$Item$Type = (BottomNavView$Item$Type)this.g;
                final BottomNavView bottomNavView = (BottomNavView)this.h;
                final int s = BottomNavView.s;
                e.f((Object)bottomNavView$Item$Type, "$itemType");
                e.f((Object)bottomNavView, "this$0");
                final int n = BottomNavView$c.a[((Enum)bottomNavView$Item$Type).ordinal()];
                final View view = null;
                Object o = null;
                Label_0199: {
                    if (n != 1) {
                        while (true) {
                            for (final Object next : bottomNavView.q) {
                                if (((lb2.a)next).a.a == bottomNavView$Item$Type) {
                                    final lb2.a a = (lb2.a)next;
                                    o = view;
                                    if (a != null) {
                                        o = a.c;
                                    }
                                    break Label_0199;
                                }
                            }
                            Object next = null;
                            continue;
                        }
                    }
                    final lb2.b r = bottomNavView.r;
                    o = view;
                    if (r != null) {
                        o = r.b;
                    }
                }
                if (o != null) {
                    final WeakHashMap a2 = l0.a;
                    if (l0$g.c((View)o) && !((View)o).isLayoutRequested()) {
                        ((f)v).onNext((Object)(((View)o).getX() + ((View)o).getWidth() / 2));
                    }
                    else {
                        ((View)o).addOnLayoutChangeListener((View$OnLayoutChangeListener)new d(v));
                    }
                }
                return;
            }
            case 8: {
                VideoEditor.b((VideoEditor)this.g, (List)this.h, v);
            }
        }
    }
    
    public final boolean c(final Serializable s) {
        switch (this.f) {
            default: {
                final PreferencesFragment preferencesFragment = (PreferencesFragment)this.g;
                final String[] array = (String[])this.h;
                final int v0 = PreferencesFragment.v0;
                preferencesFragment.getClass();
                final int index = Arrays.asList(array).indexOf(s);
                if (index != 0) {
                    if (index != 1) {
                        if (index == 2) {
                            preferencesFragment.V.y1((Boolean)null);
                        }
                    }
                    else {
                        preferencesFragment.V.y1(Boolean.TRUE);
                    }
                }
                else {
                    preferencesFragment.V.y1(Boolean.FALSE);
                }
                return true;
            }
            case 6: {
                final PreferencesFragment preferencesFragment2 = (PreferencesFragment)this.g;
                final Context context = (Context)this.h;
                final ws0.g y = preferencesFragment2.Y;
                final Boolean b = (Boolean)s;
                y.q((boolean)b);
                if (b) {
                    Toast.makeText(context, (CharSequence)"Make sure cookie file is updated and restart app", 0).show();
                }
                else {
                    Toast.makeText(context, (CharSequence)"Restart app for change to take effect", 0).show();
                }
                return true;
            }
        }
    }
    
    public final Object execute() {
        ((j)this.g).c.D((Iterable<i>)this.h);
        return null;
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                ((xa.b)o).onDrmSessionManagerError((b$a)this.g, (Exception)this.h);
                return;
            }
            case 2: {
                final b$a b$a = (b$a)this.g;
                final ab.e e = (ab.e)this.h;
                final xa.b b = (xa.b)o;
                b.onAudioEnabled(b$a, e);
                b.onDecoderEnabled(b$a, 1, e);
            }
        }
    }
    
    public final Object then(final we.g g) {
        final t t = (t)this.g;
        final String s = (String)this.h;
        synchronized (t) {
            t.b.remove((Object)s);
            return g;
        }
    }
    
    public final void unsubscribe() {
        AbstractEventPublisher.a((AbstractEventPublisher)this.g, (Subscriber)this.h);
    }
}
