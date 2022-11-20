// 
// Decompiled by Procyon v0.6.0
// 

package wd2;

import xd2.c;
import yd2.a$c;
import xd2.c$a;
import xd2.c$c;
import xd2.c$b;
import ug2.k;
import yd2.a$c$b;
import yd2.a$c$a;
import mg.d0;
import yd2.a$c$d;
import android.view.TextureView;
import com.amazonaws.ivs.player.ViewUtil;
import com.twilio.live.player.Player;

public final class a implements Runnable
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public a(final int f, final Object g, final Player h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final e e = (e)this.g;
                final g f = (g)this.h;
                final k<Object>[] g = wd2.e.g;
                ng2.e.f((Object)e, "this$0");
                ng2.e.f((Object)f, "$updatedVideoSize");
                e.f = f;
                final int a = f.a;
                if (a > 0) {
                    final int b = f.b;
                    if (b > 0) {
                        ViewUtil.setTransform((TextureView)e, a, b);
                    }
                }
                return;
            }
            case 0: {
                final yd2.a a2 = (yd2.a)this.g;
                final Player player = (Player)this.h;
                ng2.e.f((Object)a2, "$it");
                ng2.e.f((Object)player, "this$0");
                if (a2 instanceof a$c$d) {
                    final long e2 = ((a$c)a2).e;
                    final int n = 0;
                    if (e2 > 3000L) {
                        final c$b s = player.s;
                        if (s != null) {
                            final long f2 = player.f();
                            int n2 = n;
                            if (3001L <= f2) {
                                n2 = n;
                                if (f2 < 5000L) {
                                    n2 = 1;
                                }
                            }
                            if (n2 != 0 && player.g() < 1.05f && player.d() >= 3000L) {
                                s.e = true;
                                final c$c d = s.d;
                                ((c)d).a.d(d0.M((Object)d), "Seek ahead does not require revert", null);
                                final c$a c = s.c;
                                c.getClass();
                                if (player.d() >= 3000L) {
                                    ((c)c).a.d(d0.M((Object)c), "Increasing playback rate", null);
                                    player.p(1.05f);
                                }
                                else {
                                    ((c)c).a.w(d0.M((Object)c), "There is not enough buffer to increase playback rate", null);
                                }
                                s.b.y((yd2.a)new a$c$a("increase-playback-rate", player.h(), player.k(), player.l(), player.f()));
                            }
                            else if (f2 >= 5000L && player.d() >= 5000L) {
                                s.e = true;
                                final c$a c2 = s.c;
                                ((c)c2).a.d(d0.M((Object)c2), "Set playback rate back to 1.0", null);
                                player.p(1.0f);
                                final c$c d2 = s.d;
                                d2.getClass();
                                if (player.d() >= 5000L) {
                                    final long n3 = player.d() + player.h() - 3000;
                                    ((c)d2).a.d(d0.M((Object)d2), ng2.e.l((Object)n3, "Seeking ahead to "), null);
                                    player.o(n3);
                                }
                                else {
                                    ((c)d2).a.d(d0.M((Object)d2), "Skipping seek ahead because there is not enough buffered content", null);
                                }
                                s.b.y((yd2.a)new a$c$a("seek-ahead", player.h(), player.k(), player.l(), player.f()));
                            }
                            else {
                                ((c)s).a.w(d0.M((Object)s), ng2.e.l((Object)f2, "No strategy applied for live latency: "), null);
                            }
                        }
                    }
                    else {
                        final c$b s2 = player.s;
                        if (s2 != null) {
                            if (s2.e) {
                                final c$a c3 = s2.c;
                                ((c)c3).a.d(d0.M((Object)c3), "Set playback rate back to 1.0", null);
                                player.p(1.0f);
                                final c$c d3 = s2.d;
                                ((c)d3).a.d(d0.M((Object)d3), "Seek ahead does not require revert", null);
                                s2.b.y((yd2.a)new a$c$b(player.h(), player.k(), player.l(), player.f()));
                                s2.e = false;
                            }
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }
}
