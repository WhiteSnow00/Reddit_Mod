// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import ya.d;
import com.google.android.exoplayer2.c;
import android.util.Log;
import com.google.android.exoplayer2.c$a;

public final class h implements Runnable
{
    public final int f;
    public final int g;
    public final Object h;
    
    public h(final Object h, final int g, final int f) {
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final c$a c$a = (c$a)this.h;
                final int g = this.g;
                final c b = c$a.b;
                boolean b2 = true;
                if (g != -3 && g != -2) {
                    if (g != -1) {
                        if (g != 1) {
                            b.getClass();
                            final StringBuilder sb = new StringBuilder(38);
                            sb.append("Unknown focus change type: ");
                            sb.append(g);
                            Log.w("AudioFocusManager", sb.toString());
                        }
                        else {
                            b.d(1);
                            b.b(1);
                        }
                    }
                    else {
                        b.b(-1);
                        b.a();
                    }
                }
                else {
                    if (g != -2) {
                        final d d = b.d;
                        if (d == null || d.f != 1) {
                            b2 = false;
                        }
                        if (!b2) {
                            b.d(3);
                            return;
                        }
                    }
                    b.b(0);
                    b.d(2);
                }
                return;
            }
            case 0: {
                ((f.e)this.h).c(this.g);
            }
        }
    }
}
